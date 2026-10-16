/*lo de las cazuelas de huevos.
Tengo X cosas y cada contenedor puede llevar Y.
¿Cuántos contenedores necesito? (SI sobrepasa un contenedor, necesito otro)*/
import java.util.Scanner;
public class AER368 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int huevos = sc.nextInt();
        int cazuela = sc.nextInt();
        while (huevos != 0 || cazuela != 0) {
            //fórmula matemática
            System.out.println(10* ((huevos + cazuela -1)/cazuela));
            
            huevos = sc.nextInt();
            cazuela = sc.nextInt();
        } 
    }
}