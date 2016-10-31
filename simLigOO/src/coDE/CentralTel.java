package coDE;

import java.util.Stack;

/**
 *
 * @author lmoraes
 */
public class CentralTel {
    protected Posicao pos;
    protected Stack<Celular> pilhaAtend = new Stack<Celular>();
    
    public CentralTel(Posicao p){
        this.pos = p;
    }
    
    public boolean adiciona(Celular c){
        if(this.pilhaAtend.add(c)){
            return true;
        } else return false;
    }
    
    public String pesquisaEenviaCel(Mensagem m, int n){
        String res;
        for(int i=0; i==pilhaAtend.size()-1; i++){
            Celular temp =  new Celular();
            temp = pilhaAtend.get(i);
            if(temp.numero == n){
                res = temp.getAntena().verificaEenviaCel(m, temp);
                if(res.equalsIgnoreCase("Enviada com sucesso")){
                    return res;
                } else res = "Erro ao pesquisar e enviar para antena!";
            } else res = "Erro ao pesquisar no Stack Central!";
        }
        res = "Erro no iterador de pesquisa da Central!";
        return res;
    }
}
