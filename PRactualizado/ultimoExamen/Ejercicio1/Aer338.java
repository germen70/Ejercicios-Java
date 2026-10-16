//// La respuesta es igual a la posicion. si un número ya apareció antes, su posicion debe estar marcada con 1
//por lo q seria copia. Sino se le marca 1
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Aer338 {

    public static void main(String[] args) {
        try {
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String linea;

            while ((linea = br.readLine()) != null) {

                StringTokenizer st = new StringTokenizer(linea);
                int casos = Integer.parseInt(st.nextToken());
                int recuerdos = Integer.parseInt(st.nextToken());

                int copiados = 0;
                int copiProf = 0;
                
                Queue<Integer> cola = new ArrayDeque<>();
                int[] numeros = new int[100001];//hay como maximo 100.000 + 1 porque los array[] empiezan por 0
                int[] profesor = new int[100001];
                
                st = new StringTokenizer(br.readLine());
                for (int i = 0; i < casos; i++) {

                    int num = Integer.parseInt(st.nextToken());

                    // copiados globales
                    if (numeros[num] == 1) { //si es igual a 1 significa que YA existia un num igual a ese
                        copiados++;   
                    }else{      //sino pues se guarda el numero
                        numeros[num] =1;
                    }

                    //profesor
                    if (profesor[num] > 0) {
                        copiProf++;
                    }

                    profesor[num]++; //sumamos un 1 porque puede haber en mi cola varios numeros
                    cola.add(num);

                    // el array del profesor debe ser del tamaño de la cola
                    if (cola.size() > recuerdos) {

                        int eliminado = cola.poll();
                        profesor[eliminado]--;
                    }

                    
                }

                System.out.println(copiados + " " + copiProf);
            }    
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}