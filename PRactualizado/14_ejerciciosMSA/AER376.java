
import java.util.Scanner;

public class AER376 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        while (casos != 0) { 
            int[] picos = new int[casos];
            for (int i = 0; i < casos; i++) {
                picos[i] = sc.nextInt();
            }
            int contador = 0;
            for (int i = 1; i < casos-1; i++) {
                if(picos[i] > picos[i-1] && picos[i] > picos[i+1]){
                    contador++;
                }
            }
            if(picos[0]>picos[1] && picos[0]>picos[casos-1]){
                contador++;
            }
            if(picos[casos-1]>picos[casos-2] && picos[casos-1]>picos[0]){
                contador++;
            }
            System.out.println(contador);
            
            casos = sc.nextInt();
        }
    }
    
}
