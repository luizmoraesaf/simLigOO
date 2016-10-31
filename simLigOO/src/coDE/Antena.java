package coDE;

import java.util.ArrayList;
import java.math.*;

/**
 *
 * @author lmoraes
 */
public class Antena {
    protected Posicao pos;
    protected CentralTel central;
    protected ArrayList<Mensagem> listaMsg = new ArrayList<Mensagem>();
    
    public Antena(Posicao p, CentralTel ct){
        this.pos = p;
        this.central = ct;
    }
    
    //public boolean addMsg(Mensagem m){
    //    if(this.listaMsg.add(m)){
    //       return true;
    //    } else return false;
    //}
    
    public boolean verificaEenviaCentral(Mensagem m, int n){
        boolean verificador;
        if(this.listaMsg.add(m)){
            verificador = true;
        } else verificador = false;
        
        if(verificador){
            
        }
    }
    
    public boolean verificaEenviaCel(){
        
    }

    public Posicao getPos() {
        return pos;
    }
}
