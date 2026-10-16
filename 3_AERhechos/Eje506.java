import java.util.Scanner;

public class Eje506 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < casos; i++) {
            String tension = sc.nextLine();
            String[] partes = tension.split(" / ");
            
            /*convertir los datos de string a int para hacer luego la comparacion en el if */
            int primero = Integer.parseInt(partes[0]);
            int segundo = Integer.parseInt(partes[1]);

            if (primero >= segundo){
                System.out.println("BIEN");
            }else{
                System.out.println("MAL");
            }
            
        }

    }
}