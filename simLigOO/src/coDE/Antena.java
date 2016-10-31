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
            if(this.central.pesquisaEenviaCel(m, n)){
                return true;
            }
        }
        return false;
    }
    
    public String verificaEenviaCel(Mensagem m, Celular c){
        String res = "Erro ao verificar telefone na antena!";
        if(c.maisProx.equals(this)){
            res = c.recebe(m, m.getEnvia());
            if(res.equalsIgnoreCase("Enviada com sucesso")){
                return res;
            } else res = "Erro ao enviar mensagem para celular!";
        } else res = "Erro verificação da mensagem!";
        return res;
    }

    public Posicao getPos() {
        return pos;
    }
}
