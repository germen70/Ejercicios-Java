/*ejemplo de como usar array. Este ejercicio se puede hacer sin los array*/
import java.util.Scanner;

public class AER413{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();
        
        for (int i = 0; i < casos; i++) {
            int ancho = sc.nextInt();
            int alto = sc.nextInt();
            int losetas = ancho * alto;
            
            int[] nombre = new int[2]; //[2] es el tamaño que tiene el array

            //[0] o [1] es la posicion de la array
            nombre[0]= losetas/2 + losetas %2;
            nombre[1]= losetas/2;
            System.out.println(nombre[0]+" "+nombre[1]);
          
        }
    }
}