//importante como repaso de MAPAS
import java.util.Scanner;
import java.util.TreeMap;

public class AER270_v2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = Integer.valueOf(sc.next());
        int n =sc.nextInt();
        while (n != 0) {
            sc.nextLine();
            TreeMap<String,Integer> mapa = new TreeMap<>();

            for (int i = 0; i < n; i++) {
                String nombre = sc.nextLine();
                String nota = sc.nextLine();
                int notaa = 0;
                if(nota.equals("CORRECTO")){
                    notaa++;
                }else{
                    notaa--;
                }
                
                if (!mapa.containsKey(nombre)){
                    
                    mapa.put(nombre,notaa); 
                    
                }else{
                    
                    int nuevo = mapa.get(nombre)+notaa; //nos da un numero entero(SU VALOR), y le suma 1
                    mapa.put(nombre, nuevo);
                   
                }
            }
            for (String clave : mapa.keySet()) {
                int valor = mapa.get(clave);
                if(valor !=0){
                    
                    System.out.println(clave+", "+valor);
                    
                }
            }
            System.out.println("---");
            
            //n = Integer.valueOf(sc.next());
            n =sc.nextInt();
        }
    }
}
