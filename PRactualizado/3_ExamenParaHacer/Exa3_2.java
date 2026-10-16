/*lo hice yo todo. y esta todo bien pero hay que repasar porque tenia tela este ejercicio */
import java.util.Scanner;

public class Exa3_2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int caso=0;

        /*while (sc.hasNext()){} significa que mientras haya un numero para leer pues
        entra dentro del bucle*/
        while (sc.hasNext()){
            caso = sc.nextInt();

            String num = String.valueOf(caso);
            int contar= 0;
            boolean bestial = true;

            for (int i = 0; i < num.length(); i++) {

                char letra = num.charAt(i); //me lo guarda en formato normal
                //int letra = num.charAt(i);  me lo guarda en formato ASTII    
                /*SE PUEDE USAR DE LAS 2 FORMAS PERO OJO CON LOS VALORES. el 6 siginica 6 pero en el otro el 6
                 * significa otro valor
                 */
                
                if(letra == '6'){
                    contar = contar +1;
                    if(contar == 3){
                        bestial = false;
                    }
                }else{
                    contar = 0;
                }

            }
            if (bestial) {
                System.out.println("NO");
                
            }else{
                System.out.println("SI");
            }


        }
    }
}