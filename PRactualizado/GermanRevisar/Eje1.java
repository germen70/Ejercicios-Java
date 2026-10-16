import java.util.ArrayList;
import java.util.Scanner;

public class Eje1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();sc.nextLine();

        for (int i = 0; i < casos; i++) {
            
            ArrayList<String> comprar = new ArrayList<String>();
            ArrayList<String> comprado = new ArrayList<String>();

            String linea = sc.nextLine();
            String[] l = linea.split(" ");

            for (int index = 0; index < l.length-1; index++) {
                comprar.add(l[index]);
            }

            linea = sc.nextLine();
            l = linea.split(" ");
            for (int index = 0; index < l.length-1; index++) {
                comprado.add(l[index]);
            }

            int devolver = 0;
            for (String cosa : comprado) {
                if (comprar.contains(cosa)){
                    int aa = comprar.indexOf(cosa);
                    comprar.remove(aa);
                }else{
                    devolver++;
                }
            }

           System.out.println(comprar.size()+" "+devolver);
           
            
        }
    }
}