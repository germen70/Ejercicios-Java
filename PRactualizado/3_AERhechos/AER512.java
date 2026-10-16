//ejercicio de saber cual es el porcentaje de algo
import java.util.Scanner;

public class AER512 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();


        for (int i = 0; i < casos; i++) {
            int conejo = sc.nextInt();
            int caballo = sc.nextInt();

            System.out.println(conejo*100/(conejo+caballo));
        }
    }
}