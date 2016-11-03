package coDE;

import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author lmoraes
 */
public class app {

    public static void main(String[] args) {
        //Criando LOG
        SystemLogs log = new SystemLogs();

        //Area de testes
        Contador cont = new Contador();
        CentralTel ct1 = new CentralTel();
        Antena a1 = new Antena(ct1);
        Celular c1 = new Celular(88888888, a1);
        Celular c2 = new Celular(99999999, a1);
        Mensagem m1 = new Mensagem("droga", c1, c2);
        ArrayList<Antena> antenas = new ArrayList<Antena>();
        ArrayList<Celular> celulares = new ArrayList<Celular>();
        antenas.add(a1);
        celulares.add(c1);
        celulares.add(c2);
        
        while(cont.getCont()>0){
            ct1.beam(cont, log);
            for(Antena objAntena : antenas){
                objAntena.beam(cont, log);
            }
            for(Celular objCelular : celulares){
                objCelular.beam(cont, log);
            }
            cont.decrementa();
        }

        //func mais prox = sqrt(pow(x1-x2)+pow(y1-y2))
    }
    
}
