//importante como repaso de MAPAS
//sin terminar la salida de datos porque ni entiendo
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class AER633 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.next());
        
        while (n != 0) {
            
            HashMap<String,int[]> mapa = new HashMap<>();
            

            for (int i = 0; i < n; i++) {

                int[] gen = new int[2];
                gen[0] = 0; //masculino
                gen[1] = 0; //femenino
               
                String animal = sc.next();

                String ani = animal.substring(0,animal.length()-1);
                String mal = animal.substring(animal.length()-1);
                
                if (!mapa.containsKey(ani)){
                    if(mal.equals("o")){
                        gen[0]=1;
                        mapa.put(ani,gen);

                    }else{
                        gen[1]=1;
                        mapa.put(ani,gen);
                    }
                    
                }else{
                    if (mal.equals("o")) {
                        
                        int[] sacar = mapa.get(ani);
                        sacar[0]++;
                        mapa.put(ani, sacar);
                    }else{
                        int[] sacar = mapa.get(ani);
                        sacar[1]++;
                        mapa.put(ani, sacar);

                    }
                }
            }
            int pareja = 0;
            int noPareja = 0;
            int sobrantes = 0;

            for (String animal : mapa.keySet()) {

                int[] valor = mapa.get(animal);
                int dif = 0;//para sobrante
                //parejas
                if (valor[0] >= valor[1]) {
                    pareja =pareja + valor[1];

                    if(valor [0] > (valor[1]+1)){
                        dif = valor [0] - (valor[1]+1);
                        sobrantes = sobrantes + dif;
                    }
                    
                }else{
                    pareja =pareja + valor[0];

                    if(valor [1] > (valor[0]+1)){
                        dif = valor [1] - (valor[0]+1);
                        sobrantes = sobrantes + dif;
                    }
                    
                }

                //no pareja
                if (valor[0] == 0 || valor[1] == 0 ) {
                    noPareja++;
                }
            
                // para ver la lista: System.out.println(animal+", "+valor[0]+"  "+valor[1]);
                    
            }
            System.out.println("ORDEN: "+pareja+" "+noPareja+" "+sobrantes);
            System.out.println("-------");
            n = Integer.valueOf(sc.next()); 
        }
    }
}
