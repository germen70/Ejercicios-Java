//IMPORTANTE ENTENDER EL CODIGO. ESTA SIN TERMINAR.
import java.util.Arrays;
import java.util.Scanner;

public class AEL346 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_nac = sc.nextInt();
        int tiempo = sc.nextInt();
        
        /*SI LOS 2 ES 0, NO ENTRA DENTRO DEL WHILE. 
        OJO!!!: SE PONE ||(si los 2 son 0, ya no entra) Y NO && (si uno es 0, ya no entra)*/
        while(num_nac != 0 || tiempo != 0){
            int[] nac = new int[num_nac];
            for (int i = 0; i < nac.length; i++) {
                nac[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(nac));
            /*creamos un array restanto el valor del ultimo array con el primero y le sumamos 1
             * nac[num_nac-1]: num_nac es 10 pero en el array no hay posicion nac[10], es por eso que restamos 1 
             * (recordemos que la array empieza por la posicion 0 y no 1)
            */
            int dimension = nac[num_nac-1]-nac[0]+1;
            int[] anyos =new int[dimension];
            System.out.println(dimension);
            for (int i = 0; i < nac.length; i++) {
                //en el array anyos[piscion: valor de nac[i]-valor de nac[0]] sumamos 1
                anyos[nac[i]-nac[0]]++;//incrementamos 1
            }

            num_nac = sc.nextInt();
            tiempo = sc.nextInt();
        }
    }
}