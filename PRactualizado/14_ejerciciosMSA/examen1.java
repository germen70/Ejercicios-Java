
import java.util.Scanner;

public class examen1 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {
            int Maxmaletas = 0;
            int viajes = 1;
            int clientes = sc.nextInt();

            for (int j = 0; j < clientes; j++) {
                int maleta = sc.nextInt();
                Maxmaletas = Maxmaletas + maleta;
                if (Maxmaletas > 10) {
                    viajes++;
                    Maxmaletas = maleta;
                } 
                
            }
            System.out.println(viajes);
        }
    }
}
