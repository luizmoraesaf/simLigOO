package coDE;

import java.util.HashMap;


/**
 *
 * @author lmoraes
 */
public class app {

    public static void main(String[] args) {
        //Cria um hash como "mapa"
        HashMap<Posicao,Object> map = new HashMap<Posicao,Object>();
        
        //Area de testes
        CentralTel ct1 = new CentralTel(new Posicao(5,3));
        Antena a1 = new Antena(new Posicao(2,3), ct1);
        Celular c1 = new Celular(new Posicao(1,1), 88888888, a1);
        Celular c2 = new Celular(new Posicao(1,2), 99999999, a1);
        Mensagem m1 = new Mensagem("droga", c1, 99999999);
        //System.out.println("" + m1.logMensagem());
        
        //Inclusão dos celulares no hashmap
        map.put(a1.getPos(), a1);
        map.put(c1.getPos(), c1);
        map.put(c2.getPos(), c2);
        
        //Testes de envio
        try{
            c1.envia(m1, 99999999);
            Mensagem teste = c2.caixaEntrada.get(0);
            System.out.println(" " + teste.logMensagem());
        } catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
        //func mais prox = sqrt(pow(x1-x2)+pow(y1-y2))
    }
    
}
