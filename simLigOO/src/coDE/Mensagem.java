package coDE;

/**
 *
 * @author lmoraes
 */
public class Mensagem {
    protected int status = 0;         //0 -criada, 1 -erro, 2 -enviando antena, 3 -enviando celular
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

    public void setStatus(int status) {
        this.status = status;
    }
}
