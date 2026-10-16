//se puede resolver tanto por mapa como con ¿sets?(la lista que no se repite valores)
//ejercio sin terminar
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AER718 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pendientes = sc.nextInt();

        while (pendientes != 0) {
            int acumular = 0;
            HashMap<Integer,Integer> mapa = new HashMap <>();
            for (int i = 0; i < pendientes; i++) {
                
                int pareja = sc.nextInt();

                if (!mapa.containsValue(pareja)){
                    mapa.put(1,pareja);
                }else{
                    int nuevo = mapa.get(pareja)+1; //nos da un numero entero, y le suma 1
                    mapa.put(nuevo, pareja); 
                }

            }
            for (Integer d : mapa.keySet()) { //.keyset es un integer osea un valor
                    
                    
                acumular = acumular + mapa.get(d)/2;

            }
            System.out.println(acumular);
            
         
        }
    }
}