/* HAY QUE imprimir este triangulo (tiene que tener los espacios por los 2 lados)
     *
    ***
   *****
  *******
 *********
*********** 
*/
/*solucion hecha por el profesor*/
import java.util.Scanner;
public class ImprimirTriangulosProfe {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int casos = 0;

        casos = sc.nextInt();
        
        for (int i = 1; i <= casos; i++) {
            //bucle de espacios
            for (int x = 1; x <= casos-i; x++) {
                System.out.print(" ");
                
            }

            for (int j = 1; j <= (i*2-1); j++) {
                System.out.print("*");
  
            }
            System.out.println();
  
        }
    }
}