/* HAY QUE imprimir este triangulo (tiene que tener los espacios por los 2 lados)
     *
    ***
   *****
  *******
 *********
*********** 
*/
/*esta es mi version hecha por mi */
import java.util.Scanner;

public class ImprimirTriangulosYo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        String asterisco = "*";
        int nEspacios = casos;
        String espacio = "";
        
        for (int i = 0; i < casos; i++) {
            
            for (int j = 1; j < nEspacios; j++) {
                espacio = espacio + " ";
            }
            System.out.print(espacio);
            nEspacios--; 
            
            System.out.println(asterisco);
            asterisco = asterisco + "**";

            espacio = "";
        }

    }
}