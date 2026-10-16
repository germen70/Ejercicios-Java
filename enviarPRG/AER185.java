//ejerecicio donde se usa treeset
//EJERCICIO SIN TERMINAR
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class AER185 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();sc.nextLine();

        for (int i = 0; i < casos; i++) {
            TreeSet<String> tBueno = new TreeSet<>();
            TreeSet<String> tMalo = new TreeSet<>();

            String s = sc.nextLine();
            String[] ingredientes = s.split(" ");

            if(ingredientes[0].equals("SI:")){
                for (int j = 1; j < ingredientes.length-1; j++) {
                   
                tBueno.add(ingredientes[j]);
                tMalo.remove(ingredientes[j]); 
                 
                }
            }else{
                for (int j = 1; j < ingredientes.length-1; j++) {
                    if (! tBueno.contains(ingredientes[j])) {
                        tMalo.add(ingredientes[j]); 
                    }

                }
            }
            
        Iterator<String> iterator = tMalo.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name+" ");
            
        }    
        }
        
    }
}