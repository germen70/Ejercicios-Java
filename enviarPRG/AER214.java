//algo esta mal, creo que son los saltos de linea
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AER214 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reyes = sc.nextInt();
        // SIEMPRE ES : clave, valor

        while (reyes != 0) {
            sc.nextLine();

            HashMap<String, Integer> mapa = new HashMap <>();      

            for (int i = 0; i < reyes; i++) {
                String rey = sc.next();
                if (!mapa.containsKey(rey)){
                    mapa.put(rey,1);
                }else{
                    int nuevo = mapa.get(rey)+1; //nos da un numero entero, y le suma 1
                    mapa.put(rey, nuevo); 
                }

            }

            sc.nextLine();

            int herederos = sc.nextInt();
            for (int j = 0; j < herederos; j++) {
                String heredero = sc.next();
                if (mapa.containsKey(heredero)) {
                    int nuevo = mapa.get(heredero)+1;
                    mapa.put(heredero, nuevo);

                    System.out.println(nuevo);
                }else{
                    mapa.put(heredero, 1);
                    System.out.println(1);
                }
                
            }




            reyes = sc.nextInt();

        }
    }
}