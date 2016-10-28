package coDE;

/**
 *
 * @author lmoraes
 */
public class Mensagem {
    protected String conteudo;
    protected Celular envia;
    protected Celular recebe;
    protected Posicao pos;
    
    public Mensagem(String c, Celular e, Celular r){
        this.conteudo = c;
        this.envia = e;
        this.recebe = r;
        this.pos = e.getPos();
    }

    public void showMsg(){
        System.out.println("Mensagem: " + this.conteudo);
    }

    public String logMensagem() {
        return "LogMensagem{" + "conteudo=" + this.conteudo + ", envia=" + envia.getNumero() + ", recebe=" + recebe.getNumero() + '}';
    }

    public void setPos(Posicao pos) {
        this.pos = pos;
    }
    
    public boolean verificaIntegridade(){
        if(conteudo != null)
    }
}
