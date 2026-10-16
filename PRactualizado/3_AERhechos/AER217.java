
import java.util.Scanner;

public class AER217 {

   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      int caso;
      int par = 0;

      caso = sc.nextInt();

      while(caso>0) {
         if (caso % 2 == par) {
            System.out.println("DERECHA");
         } else {
            System.out.println("IZQUIERDA");
         }

         caso = sc.nextInt();
        }

   }
}
