
import java.util.Scanner;

public class AER446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();sc.nextLine();

        for (int i = 0; i < casos; i++) {
            String n= sc.nextLine();
            String[] nombres = n.split(" ");

            String nieto = nombres[0];
            int nomtotales = Integer.valueOf(nombres[1]);

            boolean real = true;
            for (int j = 0; j < nomtotales-1; j++) {
                String prr = nombres[j+2];
                 String ultimo = nombres[nombres.length-1];
                if(nieto.equals(prr)|| !nieto.equals(ultimo) ){  
                    real = false;
                }
            }
            if(nomtotales == 1){
                real = false;
            }
            
             if (!real) {
                System.out.println("FALSA");
                
            }else {
                System.out.println("VERDADERA");
            }
        
        }
    }    
}
