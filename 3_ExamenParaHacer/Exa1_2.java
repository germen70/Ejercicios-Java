/*repasar: ejercicio donde se compara el primero con el siguiente valor
 * el truco esta en leer el primer digito en una variable, y entrar en un bucle 
 * restando 1 (porque ya 1 vez) el numero de veces
*/
import java.util.Scanner;

public class Exa1_2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int casos;
        boolean premio = true;


        casos = sc.nextInt();
        //for para casos
        for (int i = 0; i < casos; i++) {
            //leo la primera puntuacion
            int primero = sc.nextInt();
            /*for para comparar la primer puntuacion con las siguientes
             * EN este caso no es "4" sino "3" porque ya lei una puntuacion arriba
            */
            for (int j = 0; j < 3 ; j++) {
                //en siguiente leo la siguiente puntuacion
                int siguiente = sc.nextInt();
                //si primero es mayor o igual al siguiente, cambio el bolean que escribi arriba
                if (primero >= siguiente) {
                    premio = false;
                    
                }
                // ahora el siguiente sera primero y con esto vuelvo a recorrer el for
                primero = siguiente;
                
            }
            /*EN Bolean se evalua normalmente en ifs
            yo puse if(premio == true) pero es if(premio)
            si el boolean que puse es true pues gano si no lo es pues pierdo*/
            if(premio){
                System.out.println("PREMIO");
            }else{
                System.out.println("VUELVE A INTENTARLO");
            }
            
        }
    }
}