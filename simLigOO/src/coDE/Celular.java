package coDE;

import java.util.ArrayList;

/**
 *
 * @author lmoraes
 */
public class Celular {
    protected int numero;
    protected Antena maisProx;
    protected ArrayList<Mensagem> caixaEntrada;
    
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
    
    public boolean envia(Mensagem m, int n){
            if(this.maisProx.verificaEenviaCentral(m,n)){
                return true;
            } else return false;            
    }
    
    public void recebe(Mensagem m){
        caixaEntrada.add(m);
    }
    
}
