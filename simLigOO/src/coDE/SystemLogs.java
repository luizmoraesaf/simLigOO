package coDE;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.io.*;

/**
 *
 * @author lmoraes
 */
public class SystemLogs {
    protected ArrayList<String> logs = new ArrayList<String>();
    Locale locale = new Locale("pt","BR");
    GregorianCalendar calendar = new GregorianCalendar(); 
    SimpleDateFormat formatador = new SimpleDateFormat("'dd' de 'MMMMM' de 'yyyy' - 'HH':'mm'h'",locale);
    SimpleDateFormat formatarq = new SimpleDateFormat("'dd''MMMMM''yyyy''HH''mm'h'");

    public SystemLogs() {
    }
        
    public void addLog(String l){
        if(!logs.add(formatador.format(calendar.getTime())+ " - " + l)) System.out.println("Erro no log!");
    }
    
    public void salvaLog(){
        try{
        FileWriter arq = new FileWriter("c:\\" + formatarq + "LOGsimLigOO");
        PrintWriter parq = new PrintWriter(arq);
        
        parq.printf("Inicio LOG: " + formatador.format(calendar.getTime()) + "%n");
            for(int i=0; i<=logs.size()-1; i++){
                parq.printf(logs.get(i));
            }
        arq.close();
        System.out.println("LOG Salvo!");
        } catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
