
import java.util.Scanner;

public class AER313 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt(); sc.nextLine();

        for (int i = 0; i < casos; i++) {
            int saldo = sc.nextInt();
            int cuenta = sc.nextInt();

            if (saldo+cuenta >= 0) {
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }

    }
}