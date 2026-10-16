//IMPORTANTE 
import java.util.Scanner;

public class AER171 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();

        while (casos != 0) {
            int[] montaña = new int[casos];

            for (int i = 0; i < casos; i++) {
                montaña[i] = sc.nextInt();
                
            }
            int contador = 0;
            int anterior = 0;
            //IMPORTANTE: RECORREMOS UNA ARRAY DE FORMA INVERSA
            for (int i = casos-1; i >= 0; i--) {
                if (montaña[i] > anterior){
                    contador++;
                    anterior = montaña[i];
                }
                
            }
            System.out.println(contador);

            //sc.nextLine();
            casos = sc.nextInt();
            
        }
    }
}