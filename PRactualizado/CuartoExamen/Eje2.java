import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Eje2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();
        

        while (casos != 0) {
            sc.nextLine();
            //se puede usar un arraylist   //ArrayList <Estacion> lista2 = new ArrayList<>();
            TreeSet<Estacion> lista = new TreeSet<>(); //SI USO un Tree ya no haria falta usar un .sort
            
            for (int index = 0; index < casos; index++) {
                String a = sc.next();
                Integer b = sc.nextInt();
                Integer c = sc.nextInt();
                Estacion es1 = new Estacion(a, b, c);

                lista.add(es1);
            }
            
            //Collections.sort(lista);  //SI USASE UN arraylist TENDRIA Q USAR ESTA LINEA PARA ORDENAR 


            Estacion nom=lista.getFirst();

            System.out.println(nom.getNombre());
           
            casos = sc.nextInt();
        }
    }
}

