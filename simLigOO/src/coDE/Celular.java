package coDE;

/**
 *
 * @author lmoraes
 */
public class Celular {
    protected Posicao pos;
    protected int numero;
    protected Antena maisProx;
    
    public Celular(Posicao p, int n, Antena a){
        this.pos = p;
        this.numero = n;
        this.maisProx = a;
    }

    public int getNumero() {
        return numero;
    }

    public Posicao getPos() {
        return pos;
    }    
    
    public boolean enviaMSG(Mensagem m, Celular c) throws{
        if(m.verificaIntegridade()){
            
        }
    }
}
