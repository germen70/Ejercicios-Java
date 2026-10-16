/*usa la formula matematica de:
Tengo X cosas y cada contenedor puede llevar Y.
¿Cuántos contenedores necesito? (SI sobrepasa un contenedor, necesito otro)
AER736*/
import java.util.Scanner;

public class AER736{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
       
        for (int i = 0; i < casos; i++) {
            int escaleras = sc.nextInt();
            int pasos = sc.nextInt();

            int total = (escaleras+pasos-1)/pasos;
            System.out.println(total);
        }
    }
}