import java.util.Scanner;

public class AER158 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {
            int muros = sc.nextInt();
            int sube = 0;
            int baja = 0;

            int primero = sc.nextInt();

            for (int j = 1; j < muros; j++) {
                int siguiente = sc.nextInt();
                /*contabilizamos cuantas bajadas y subidas que hay */
                if(primero>siguiente){
                    baja++;
                }
                if (primero<siguiente){
                    sube++;
                }

                primero = siguiente;
            
            }
            System.out.println(sube+" "+baja);
        }
    }
}
