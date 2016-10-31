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
    
    public boolean pesquisaEenviaCel(Mensagem m, int n){
        
        for(int i=0; i==pilhaAtend.size()-1; i++){
            Celular temp =  new Celular();
            temp = pilhaAtend.get(i);
            if(temp.numero == n){
                if(temp.getAntena().verificaEenviaCel(m, temp)){
                    return true;
                }
            }
        }
        return false;
    }
}
