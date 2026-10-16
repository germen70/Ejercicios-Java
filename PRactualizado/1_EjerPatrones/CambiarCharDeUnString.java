//EJERCICIO DE CAMBIO DE CARACTERES DE UNA FRASE
import java.util.Scanner;

public class CambiarCharDeUnString{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String frase = sc.nextLine();

        /*el ejercicio se puede resolver de manera rapida y facil con:
        frase = frase.replace('a','1');
        System.out.println(frase);
         */


        /*en vez de sustituir la cadena, vamos a crear una nueva similar a la anterior pero con las modificaciones */
        int l = frase.length();
        String fraseCodificada = "";
        for (int i = 0; i < l; i++) {

            char x = frase.charAt(i);
            
            switch (x) {
                case 'a': x = '1'; break;
                    
                case 'e':  x = '2'; break;
                    
                case 'i':  x = '3'; break;
                    
                case 'o':  x = '4'; break;
                    
                case 'u':  x = '5'; break;
                
                default: break;
            }
            fraseCodificada +=x;
        }
        System.out.println(fraseCodificada);
    }
}