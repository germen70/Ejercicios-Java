import java.util.Scanner;

public class AER369_ConCadenas {

    public static String unos (int n){
        String cadena = new String(""); // esto es igual a String cadena = "";
        for (int i = 0; i < n; i++) {
            cadena = cadena + "1";
        }
        return cadena;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int casos =  sc.nextInt();
        
        while (casos != 0) {
            

            System.out.println(unos(casos));

            casos = sc.nextInt();
            
        }
    }
}