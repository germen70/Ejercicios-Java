//IMPORTANTE. EJERCICIO DONDE SE USA Arrays.sort();  //en los parentesis se pone la array que se quiere organizar
//ESTO ESTA bien pero hay un fallo y es que cunado imprime, el ultimo elemento iumprime un espacio. Ver la version 2
import java.util.Arrays;
import java.util.Scanner;

public class matriz6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        
        while (casos !=0){
            sc.nextLine();
            
            String a = sc.nextLine();
            String[] b = a.split(" ");
            
            Arrays.sort(b);
            for (int i = 0; i < b.length; i++) {

                System.out.print(b[i]+" ");

            }
            
            System.out.println();

            casos = sc.nextInt();
        }
    }
}