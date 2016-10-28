package coDE;

import java.util.ArrayList;
import java.math.*;

/**
 *
 * @author lmoraes
 */
public class Antena {
    protected Posicao pos;
    protected ArrayList<Mensagem> listaMsg = new ArrayList<Mensagem>();
    
    public Antena(Posicao p){
        this.pos = p;
    }
    
    public boolean addMsg(Mensagem m){
        if(this.listaMsg.add(m)){
            return true;
        } else return false;
    }

    public Posicao getPos() {
        return pos;
    }
}
