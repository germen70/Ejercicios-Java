import java.util.Scanner;

public class AER369 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int casos =  sc.nextInt();
        
        while (casos != 0) {
            String cadena = "";
            for (int i = 0; i < casos; i++) {
                cadena = cadena+"1";
                
            }
            

            System.out.println(cadena);

            casos = sc.nextInt();
            
        }
    }
}