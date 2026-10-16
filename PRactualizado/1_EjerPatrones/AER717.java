//aer 717 HECHO POR EL PROFESOR. YO NO LO PUDE RESOLVER. ENTENDER COMO FUNCIONA
import java.util.Arrays;
import java.util.Scanner;

public class AER717 {

    public static boolean divertido(String s){
        /*Esto es lo mismo q lo de abajo. Esto solo sirve si nos piden la mitad y si es solo par
        String cad1 = s.substring(0,s.lenght()/2);
        String cad1 = s.substring(s.lenght()/2,s.lenght()); */
        String cad1 = s.substring(0,3);
        String cad2 = s.substring(3,6);
        //si no entiendes esto. Sigue con un solo return.
        if(cad1.equals(cad2)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        String dd = "";
        String mm = "";
        String aa = "";

        for (int i = 0; i < casos; i++) {
            
            dd = sc.next();
            mm = sc.next();
            aa = sc.next();
            String[] fecha = new String[6];
            
            fecha[0]= dd+mm+aa;
            fecha[1]= dd+aa+mm;
            fecha[2]= mm+aa+dd;
            fecha[3]= mm+dd+aa;
            fecha[4]= aa+mm+dd;
            fecha[5]= aa+dd+mm;
            
            boolean diver = false;
            
            for (int j = 0; j < fecha.length; j++) {

                if(divertido(fecha[j])){
                    diver = true;
                }
            }
            if(diver){
                System.out.println("DIVERTIDOS");
            }else{
                System.out.println("INSULSOS");
            }
            
        }

    }
    
}
