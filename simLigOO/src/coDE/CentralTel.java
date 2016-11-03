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

    public boolean beam(Contador cont){
        Mensagem tempm;
        tempm = pilhaAtend.pop();
        if(tempm!=null){
            Celular tempc;
            tempc = tempm.getRecebe();
            if(tempc.getAntena().addMsg(tempm)){
                return true;
            }
        } else return false;
        return false;
    }
}
