//sin terminar
import java.util.HashMap;
import java.util.Scanner;

public class AER169 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int casos = sc.nextInt();sc.nextLine();

        for (int i = 0; i < casos; i++) {
            String participante = sc.nextLine();

            HashMap<String, Integer> lista = new HashMap<>();

            while (!participante.equals("====")) { 
                
                String[]parti = participante.toLowerCase().split(", "); //pasamos a minuscula el nombre completo
                
                String apellido = parti[0];
                String nombre = parti[1];
                
                if (!lista.containsKey(apellido)) {
                    lista.put(apellido, 1);
                }else{
                    int num = lista.get(nombre);
                    lista.put(apellido, num++);
                }
                
                participante = sc.nextLine();
            }
            

            
            
            
        }
    }
}
