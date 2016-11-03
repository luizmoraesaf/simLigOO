package coDE;

/**
 *
 * @author lmoraes
 */
public class Contador {
    private static int CONT = 0;

    public Contador() {
    }
    
    public void decrementa(){
        CONT++;
    }
    
    public int getCont(){
        return CONT;
    }
}
