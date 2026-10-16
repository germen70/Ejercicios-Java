//importante como repaso de MAPAS
import java.util.Scanner;
import java.util.TreeMap;

public class AER270 {

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
                
                if (!mapa.containsKey(nombre)){
                    if(nota.equals("CORRECTO")){
                       mapa.put(nombre,1); 
                    }else{
                        mapa.put(nombre,-1);
                    }
                    
                }else{
                    if(nota.equals("CORRECTO")){
                        int nuevo = mapa.get(nombre)+1; //nos da un numero entero(SU VALOR), y le suma 1
                        mapa.put(nombre, nuevo);
                    }else{
                        int nuevo = mapa.get(nombre)-1; //nos da un numero entero, y le suma 1
                        mapa.put(nombre, nuevo);
                    }  
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
