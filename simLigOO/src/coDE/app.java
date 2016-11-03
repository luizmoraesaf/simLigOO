package coDE;

import java.util.HashMap;


/**
 *
 * @author lmoraes
 */
public class app {

    public static void main(String[] args) {
       
        //Area de testes
        CentralTel ct1 = new CentralTel();
        Antena a1 = new Antena(ct1);
        Celular c1 = new Celular(88888888, a1);
        Celular c2 = new Celular(99999999, a1);
        Mensagem m1 = new Mensagem("droga", c1, 99999999);
        //System.out.println("" + m1.logMensagem());
        
        while(Contador.CONT>=0){
            
        }

        //func mais prox = sqrt(pow(x1-x2)+pow(y1-y2))
    }
    
}
