package coDE;

import java.util.Queue;
import org.apache.commons.collections4.queue.CircularFifoQueue;
import java.math.*;


/**
 *
 * @author lmoraes
 */
public class Antena {
    protected CentralTel central;
    Queue<Mensagem> listaMsg = new CircularFifoQueue<Mensagem>(10);
    
    public Antena( CentralTel ct){
        this.central = ct;
    }
    
    public boolean addMsg(Mensagem m){
        if(this.listaMsg.add(m)){
           return true;
        } else return false;
    }
}
