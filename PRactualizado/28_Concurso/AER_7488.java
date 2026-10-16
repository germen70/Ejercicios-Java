//uso de mapas
import java.util.HashMap;
import java.util.Scanner;

public class AER_7488 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        while (casos != 0) {
            String nombre;
            HashMap<String, Integer> lista = new HashMap<>();

            for (int i = 0; i < casos; i++) {
                nombre =  sc.next();

                if (!nombre.equals("?")) {
                    int p = Integer.valueOf(sc.next());
                    if(!lista.containsKey(nombre)){

                        lista.put(nombre, p);
                    }else{
                        
                        lista.put(nombre, (lista.get(nombre)+p));
                    }
                }else{
                    int salidas = sc.nextInt();
                    int pistTotales =0;
                    for (int j = 0; j < salidas; j++) {
                        nombre = sc.next();
                        
                        pistTotales+= lista.get(nombre);
                        lista.remove(nombre);
                    }
                    System.out.println(pistTotales);
                    sc.nextLine();
                }
            }
            System.out.println("---");
            casos = sc.nextInt(); 
        }
    }
}