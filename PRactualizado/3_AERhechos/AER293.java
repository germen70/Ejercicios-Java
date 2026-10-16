import java.util.Scanner;

public class AER293 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {
            /*
            int insectos = sc.nextInt();
            int aracnidos = sc.nextInt();
            int crustaceos = sc.nextInt();
            int cienpies = sc.nextInt();
            int cienpiesSegmento = sc.nextInt();
            int totalPatas = 6 * insectos + 8 * aracnidos + 10 * crustaceos + (cienpies * 2 * cienpiesSegmento);
            */
            System.out.println(6*sc.nextInt()+8*sc.nextInt()+10*sc.nextInt()+(sc.nextInt()*2*sc.nextInt()));
        } 
    }
}