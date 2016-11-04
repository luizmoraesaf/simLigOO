package coDE;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author lmoraes
 */
public class Celular {
    protected int numero;
    protected Antena maisProx;
    protected ArrayList<Mensagem> caixaEntrada;
    protected Stack<Mensagem> caixaSaida;
    
    public Celular(int n, Antena a){
        this.numero = n;
        this.maisProx = a;
    }
    
    public Celular(){}

    public int getNumero() {
        return numero;
    }

    public Antena getAntena() {
        return maisProx;
    }
    
    public void beam(Contador cont, SystemLogs log){
        Mensagem tempm;
        tempm = caixaSaida.pop();
        if(tempm != null){
            tempm.setStatus(2);
            if(this.getAntena().addMsg(tempm)){
                log.addLog("Mensagem enviada para antena!");
            } else {
                tempm.setStatus(1);
                log.addLog("Erro ao enviar para antena! Stack antena pode deve cheio!");
            }
        } else log.addLog("Stack do celular vazio!");
    }
    
    public void recebe(Mensagem m){
        caixaEntrada.add(m);
    }    
}
