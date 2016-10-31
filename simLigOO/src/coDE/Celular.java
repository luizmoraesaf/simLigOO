package coDE;

import java.util.ArrayList;

/**
 *
 * @author lmoraes
 */
public class Celular {
    protected Posicao pos;
    protected int numero;
    protected Antena maisProx;
    protected ArrayList<Mensagem> caixaEntrada;
    
    public Celular(Posicao p, int n, Antena a){
        this.pos = p;
        this.numero = n;
        this.maisProx = a;
    }
    
    public Celular(){}

    public int getNumero() {
        return numero;
    }

    public Posicao getPos() {
        return pos;
    }    

    public Antena getAntena() {
        return maisProx;
    }
    
    public boolean envia(Mensagem m, int n){
            if(this.maisProx.verificaEenviaCentral(m,n)){
                return true;
            } else return false;            
    }
    
    public String recebe(Mensagem m, int n){
        String res = "Enviada com sucesso";
        if(this.caixaEntrada.add(m)){
            return res;
        } else res = "Erro ao adicionar na caixa!";
        return res;
    }
    
}
