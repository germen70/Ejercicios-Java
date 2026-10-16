/*version del profesor, es mas sencilla. Utiliza colas: los zapatos estan en una lista
yo saco un zapato y compruebo si exise su contrario; si existe, se borra y si no, se pone 
en  otra cola. Despues imprimo las 2 colas*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Eje3 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (sc.hasNextLine()) {
            
            String[] zapas = sc.nextLine().split(" "); //linea mas optimizada

            Queue<String> der = new LinkedList<String>();
            Queue<String> izq = new LinkedList<String>();

            for (int j = 0; j < zapas.length; j++) {
                String aa = zapas[j];
                //47a 
                String numero = aa.substring(0,2); //podria poner  String numero = zapas[j].substring(0,2);
                String letra = aa.substring(2);
            
                
                if (zapas.equals("D")){
                    der.add(numero);
                }else{
                    izq.add(numero);
                }

            }
            
            ArrayList<String> lista = new ArrayList<>();

            while(!der.isEmpty()){
                String v = der.poll();
                if (izq.contains(v)) {
                    izq.remove(v);
                }else{
                    lista.add(v+"D");
                }
            }
            while (!izq.isEmpty()) {
                lista.add(izq.poll()+"I");
            }
            Collections.sort(lista);
            System.out.println();
        }
    }
}