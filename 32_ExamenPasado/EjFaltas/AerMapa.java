import java.util.LinkedHashMap;
import java.util.Scanner;

public  class AerMapa{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        while (casos !=0) {
            //<el numero que sale, posicion en la que sale>
            LinkedHashMap <Integer, Integer> primera = new LinkedHashMap<>();//solo almaceno la primera vez que sale el numero
            LinkedHashMap <Integer, Integer> ultima = new LinkedHashMap<>();//actualizo cada vez q sale el numero
            //foi para meter el numero y uso la i para saber su posicion
            for (int i = 0; i < casos; i++) {
                int num = sc.nextInt();
                //lo añado si no contiene el numero en primera
                if (!primera.containsKey(num)) {
                    primera.put(num, i);
                }
                //siempre lo añado por lo q se actualiza siempre
                ultima.put(num, i);
            }
            long numTotalRepes = 0; //para contar las veces que se han repetido
            
            for (Integer clave : primera.keySet()) {
                int posicionPrimera = primera.get(clave);
                int posicionUltima = ultima.get(clave);
                numTotalRepes = numTotalRepes + (posicionUltima-posicionPrimera);
            }
            
            System.out.println(numTotalRepes);
            casos = sc.nextInt();
        }
    }
}