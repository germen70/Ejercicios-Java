/*AER751
Usamos el Math. */
import java.util.Scanner;
public class MathMinMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {

            int[] años = new int[4];
            for (int j = 0; j < 4; j++) {
               años[j] = sc.nextInt();
            }
            int nacimiento = Math.max(años[0], años[2]);//año de nacimiento más tarde
            int muerte = Math.min(años[1], años[3]);//año de muerte mas temprana
            
            System.out.println(Math.max((muerte-nacimiento+1),0));
        }
    }
}