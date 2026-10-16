import java.util.Scanner;

public class AER143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tortitas = sc.nextInt(); //leo el primer digito
        while(tortitas != -1){ //miestras no sea igual a "-1" entra dentro del programa
            sc.nextLine(); /*hago un salto de linea porque no me interesa saber el resto de números
            porque, el resto, es una una cadena descendente. Ej: si el primer numero empieza en 5:
            le  sigue el 4, luego 3, 2, 1 y terminará en -1. tanto el -1 como el resto me dan igual*/

            int[] t = new int[tortitas]; //el 1º numero que leíva a ser el tamaño de mi array

            for (int i = 0; i < t.length; i++) {//en cada parte del array meto un contador descentente
                t[i] = tortitas; //gracias a esto, me da igual leer el resto de números que mecione arriba
                tortitas--;
            }
            int vueltasTotales = sc.nextInt(); //leo el numero de veces que haré vueltas
            
            for (int i = 0; i < vueltasTotales; i++) {
                int vuelta = sc.nextInt(); //esta es la cantidad que yo voltearé (contando desde arriba)
                int[] vvv = new int[vuelta]; //creo otra array del tamaño de la cantidad que volteare
                /*meto dentro del array el valor de array inicial de forma descendente. Es decir, 
                LOS VALORES DEL NUECO ARRAY VAN A SER IGUAL A LOS VALORES DEL DEL ULTIMO ARRAY
                PERO YENDO DE FORMA DESCENDENTE: el primero con el último, el segundo con el penúltimo,
                el tercero con el antepenúltimo...*/
                for (int j = 0; j < vvv.length; j++) { //meto en el nuevo array
                    vvv[j] = t[t.length-1-j];
                } 
                for (int j = 0; j < vvv.length; j++) { //los valores del nuevo array los 
                // vuelvo a meter en el array inicial
                    
                    t[t.length-1-j] = vvv[vvv.length-1-j];
                } 
                
            }
            
            System.out.println(t[t.length-1]); // imprimo el valor del último array
        }
    }
    
}