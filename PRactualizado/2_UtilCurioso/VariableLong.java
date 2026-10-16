/*usamos la variable long con Scanner 
AER788
*/
import java.util.Scanner;
public class VariableLong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();
       
        for (int i = 0; i < casos; i++) {
            long personas = sc.nextLong();
            long botin = sc.nextLong();
            long reparto = botin/personas; // lo que le corresponde a cada uno de la pandilla
            //lo que le corresponde a manola: el resto + el reparto
            long manola = botin%personas + reparto;

        System.out.println(manola);
        }
    }
}