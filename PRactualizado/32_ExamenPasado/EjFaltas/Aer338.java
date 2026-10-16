//// La respuesta es igual a la posicion. si un número ya apareció antes, su posicion debe estar marcada con 1
//por lo q seria copia. Sino se le marca 1
import java.util.*;

public class Aer338 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {

            int casos = sc.nextInt();
            int recuerdos = sc.nextInt();

            int copiados = 0;
            int copiProf = 0;
            
            int[] numeros = new int[100001];
            int[] profesor = new int[100001];//hay como maximo 100.000 + 1 porque los array[] empiezan por 0
            int[] cola = new int[recuerdos]; //dentro de cada indice guardo las respuestas que tienen los alumnos
            int anyadir = 0;//es una variable de posicon q me servira para volver a recorrer el array de cola. Cuando llega al final, vuelve al principio
            int tamanyo =0;

            for (int i = 0; i < casos; i++) {

                int num = sc.nextInt();

                // copiados globales
                if (numeros[num] >1) { //si la posicion del numero es igual a 1 significa que YA existia un num igual a ese
                    copiados++;   
                }
                numeros[num]++;

                //profesor
                if (profesor[num] > 0) {//si es mayor a 0 significa q se acuerda de alguien q tuvo esa respuesta. si es 0 significa q nadie tuvo esa respuesta
                    copiProf++;
                }
                profesor[num]++; //lo mismo pero con ++ pq el profe se puede olvidar de respuestas y puede haber varias respuestas con ese num
                
                //cola:
                int antes = cola[anyadir]; //esta es una variable q me sirve para guardar el numero que tenia antes mi cola
                cola[anyadir] = num;
                

                //Este if se activara cuando llegue al limite de la cola por primera vez
                if (tamanyo== recuerdos) {
                    profesor[antes]--;//esto hace q se olvide de la respuesta
                }else{
                    tamanyo++;
                }
                
                anyadir = (anyadir + 1) % recuerdos; //bucle para la cola. Cuando llega al final, vuelve al inicio
            }
            System.out.println(copiados + " " + copiProf);
        }
    }
}