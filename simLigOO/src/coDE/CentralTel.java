package coDE;

import java.util.Stack;

/**
 *
 * @author lmoraes
 */
public class CentralTel {
    protected Stack<Mensagem> pilhaAtend = new Stack<Mensagem>();
    
    public boolean adiciona(Mensagem m){
        if(this.pilhaAtend.add(m)){
            return true;
        } else return false;
    }

    public void beam(Contador cont, SystemLogs log){
        Mensagem tempm;
        tempm = pilhaAtend.pop();
        if(tempm!=null){
            Celular tempc;
            tempc = tempm.getRecebe();
            if(tempc.getAntena().addMsg(tempm)){
                log.addLog("Adicionado na lista da Antena!");
            } else{
                if(tempm.getEnvia().getAntena().addMsg(tempm.delivStatus())){
                log.addLog("Erro ao adicionar na Antena! A lista deve estar cheia! Enviado msg de erro para celular que enviou!");    
                } else log.addLog("Mensagem perdida por falta de capacidade!");
            }
        } else{
            log.addLog("Stack da central vazia!");
        }
    }
}
