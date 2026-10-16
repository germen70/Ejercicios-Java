
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        while (casos != 0) {
            
            int kmMayor = Integer.MIN_VALUE;
            int posMayor = 0;
            for (int i = 1; i <= casos; i++) {
                int km = sc.nextInt();
                if ( km >= kmMayor) {
                    kmMayor = km;
                    posMayor = i;
                }   
            }
            System.out.println(posMayor);
            casos = sc.nextInt();
        }
        sc.close();
    }
}
