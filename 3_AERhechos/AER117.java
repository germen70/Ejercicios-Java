import java.util.Scanner;

public class AER117 {

    public static void main(String[] args) {
        /*scaner para leer los casos */
        Scanner sc = new Scanner(System.in);

        int casos;
        casos = sc.nextInt(); sc.nextLine(); //salto de linea
        /*para cada casos, entra dentro.
         * Dentro se resta un caso por cada vez que entra.
         * Guardamos la frase en un String
         * la frase la separamos cuando haya " " y la colocamos en otro string
         * imprimimos el string segun la posicion que queramos
         */
        for(int i = 0;i < casos;i++){
            
            String frase = sc.nextLine();

            String [] nombre = frase.split(" ");

            System.out.println("Hola, "+nombre[1]+".");

        }

    }
}