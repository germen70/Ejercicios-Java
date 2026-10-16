//hecho por el profesor. La funcion sirve en cualquiera de los casos. 
import java.util.Scanner;

public class AER757v2{
    

    public static int calcula(String s){
        
        int mayorT = 0;
        int tSeguidas = 0;
    
        String[] cade = s.split("S");
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            
            
            if ( c == 'T'){
                tSeguidas++;

            }else {
                if(tSeguidas > mayorT){
                    mayorT = tSeguidas;
                }
                tSeguidas = 0;
            }
            
        }
        if(tSeguidas > mayorT){         //para solucionar el ultimo caso cuando solo haya T ("TTTTTTTTT")
                    mayorT = tSeguidas;
                }
        return mayorT;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt(); sc.nextLine();

        for (int i = 0; i < casos; i++) {
            
            System.out.println(calcula(sc.nextLine()));
            
        }
    }
}
