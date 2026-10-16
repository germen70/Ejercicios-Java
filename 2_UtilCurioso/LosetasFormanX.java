//suma de las losetas que forman una X. AER758.
import java.util.Scanner;

public class LosetasFormanX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        int tamaño;

        for (int i = 0; i < casos; i++) {
            tamaño = sc.nextInt();
            //una opcion: 2*tamaño+(tamaño-3)*4+3;
            //otra opcion: tamaño+tamaño-1+((tamaño-2)*4);

            System.out.printf("%d %d\n",tamaño+tamaño-1+((tamaño-2)*4), tamaño*tamaño-(tamaño+tamaño-1+((tamaño-2)*4)));
        }
    }
}