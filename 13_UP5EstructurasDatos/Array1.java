import java.util.Arrays;
import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Crea un vector de enteros de 10 elementos
        int[] a = new int[3];

        /*Realiza un bucle para inicializar sus valores. Imprime la
        posición por pantalla para asignar los valores.*/
        for (int i = 0; i < a.length; i++) { //a.length IMPORTANTE. eso es el tamaño de la array
            System.out.println("Dime el valor de la posición "+i);
            a[i] = sc.nextInt(); //añadimos el valor en cada uno de los indices.IMPORTANTE ENTENDER
            
        }
        /*De esta forma nos lo imprime en una lista. Solo nos permite visualizar
        System.out.println(Arrays.toString(a)); */


        for (int i = a.length-1; i >= 0; i--) {  //en este bucle lo recorremos al reves.
            System.out.println("En la posición "+i+" hay un "+a[i]);

            
        }
    }
}