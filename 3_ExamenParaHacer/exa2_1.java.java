//revisar como funciona ese while(sc.hasNext)
import java.util.Scanner;

public class Eje_4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            String personas = sc.nextLine();
            int parejas = 0;
            int h = 0; 
            int m = 0;
        
            for (int i = 0; i < personas.length(); i++) {
                char letra = personas.charAt(i);
                
                if (letra == 'G'){
                    h=0;
                    m=0;
                }
                if (letra == 'H'){
                    h++;
                    if(m>0){
                        m--;
                        h--;
                        parejas++;
                    }
                }
                if (letra == 'M'){
                    m++;
                    if(h>0){
                        m--;
                        h--;
                        parejas++;
                    }
                }
                
            }
            System.out.println(parejas);
            
        }
    }
}