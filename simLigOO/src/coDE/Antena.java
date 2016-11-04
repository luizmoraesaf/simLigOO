package coDE;

import java.util.Queue;
import java.math.*;
import java.util.PriorityQueue;


/**
 *
 * @author lmoraes
 */
public class Antena {
    protected CentralTel central;
    Queue<Mensagem> listaMsg = new PriorityQueue<Mensagem>(10);
    
    public Antena( CentralTel ct){
        this.central = ct;
    }
    
    public boolean addMsg(Mensagem m){
        if(this.listaMsg.add(m)){
           return true;
        } else return false;
    }
    
    public void beam(Contador cont, SystemLogs log){
        for(Mensagem m : listaMsg){
            if(m.getStatus() == 3){
                Celular tempc = m.getRecebe();
                tempc.recebe(m);
                log.addLog("Mensagem entregue com sucesso!");
            } else if(m.getStatus() == 2){
                if(central.adiciona(m)){
                    log.addLog("Mensagem enviada para central!");
                } else log.addLog("Erro ao adicionar na Stack da central!");
            }
        }
    }
}
