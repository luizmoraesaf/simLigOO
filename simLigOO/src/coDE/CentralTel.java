package coDE;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author lmoraes
 */
public class CentralTel {
    protected Posicao pos;
    protected Stack<Celular> pilhaAtend = new Stack<Celular>();
    
    public CentralTel(Posicao p){
        this.pos = p;
    }
    
    public boolean adiciona(Celular c){
        if(this.pilhaAtend.add(c)){
            return true;
        } else return false;
    }
    
    public boolean pesquisaEenviaCel(int n){
        Iterator i = this.pilhaAtend.iterator();
        while(i.hasNext()){
            Celular temp = (Celular) i.next();
            if(temp.numero == n){
                if(temp.getAntena().verificaEenviaCel()){
                    return true;
                }
            }
        }
        return false;
    }
}
