import java.util.Scanner;

public class AER764 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        while (casos != 0) {
            int contador = 0;
            for (int i = 0; i < casos; i++) {
                contador = contador + sc.nextInt() - sc.nextInt();;
                
            }
            System.out.println(contador);
            casos = sc.nextInt();
        }
    }
}