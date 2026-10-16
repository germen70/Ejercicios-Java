//usamos la variable long   
//ver los comandos del scanner (ya no es sc.nextInt())
import java.util.Scanner;
public class AER788 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();
        long personas;
        long botin;
        long reparto;
        long manola;
        for (int i = 0; i < casos; i++) {
            personas = sc.nextLong();
            botin = sc.nextLong();
            reparto = botin/personas; // lo que le corresponde a cada uno de la pandilla
            //lo que le corresponde a manola: el resto + el reparto
            manola = botin%personas + reparto;

        System.out.println(manola);
        }
    }
}