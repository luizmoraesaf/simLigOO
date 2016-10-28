package coDE;

import java.util.Stack;

/**
 *
 * @author lmoraes
 */
public class CentralTel {
    protected Posicao pos;
    protected Stack<Mensagem> pilhaAtend = new Stack<Mensagem>();
    
    public CentralTel(Posicao p){
        this.pos = p;
    }
    
    public boolean adiciona(Mensagem m){
        if(this.pilhaAtend.add(m)){
            return true;
        } else return false;
    }
}
