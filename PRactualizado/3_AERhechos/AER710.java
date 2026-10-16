
import java.lang.reflect.Array;
import java.util.Scanner;

public class AER710 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        
        
        for (int i = 0; i < casos; i++) {
            int tope = sc.nextInt();
            int suma = 0;
            for (int j = 0; j < 6; j++) {
                suma += sc.nextInt();
            }

            System.out.println(tope-suma);
        }
    }
}
