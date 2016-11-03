package coDE;

/**
 *
 * @author lmoraes
 */
public class Mensagem {
    protected final int status = 0;         //0-enviando, 1-erro, 2-enviada
    protected String conteudo;
    protected Celular envia;
    protected Celular recebe;
    
    public Mensagem(String c, Celular e, Celular r){
        this.conteudo = c;
        this.envia = e;
        this.recebe = r;
    }

    public void showMsg(){
        System.out.println("Mensagem: " + this.conteudo);
    }

    public String logMensagem() {
        return "LogMensagem{" + "conteudo=" + this.conteudo + ", envia=" + envia.getNumero() + ", recebe=" + recebe + '}';
    }

    public Celular getEnvia() {
        return envia;
    }

    public Celular getRecebe() {
        return recebe;
    }
    
    public Mensagem delivStatus(){
        this.conteudo += "* ERRO NA ENTREGA *";
        return this;
    }
}
