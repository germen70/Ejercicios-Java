
import java.util.Scanner;

public class AER523 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int casos = sc.nextInt();sc.nextLine();
        String miCoche = "";
        String miNum = "";
        String miLetra = "";
        String otroCoche = "";
        String otroNum = "";
        String otroLetra = "";
       

        for (int i = 0; i < casos; i++) {
            int viejo = 0;
            int nuevo = 0;

            miCoche = sc.next();
            otroCoche = sc.next();
            miNum = miCoche.substring(0,4);
            miLetra = miCoche.substring(4);
            
            while (!otroCoche.equals("0")) { 
                otroNum = otroCoche.substring(0,4);
                otroLetra = otroCoche.substring(4);
                
                if(otroCoche.charAt(0)>miCoche.charAt(0))


                otroCoche = sc.next();
            }
        }
    }
}
