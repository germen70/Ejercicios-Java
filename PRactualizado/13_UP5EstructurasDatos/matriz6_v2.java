import java.util.Arrays;
import java.util.Scanner;

public class matriz6_v2 {
    //USAMOS UN VOID. PORQUE NECESITAMOS UN PROCEDIMIENTO (no una funcion) (es decir que no queremos que nos den un valor)
    public static void imprimeArray (String[]a){
        for (int i = 0; i < a.length-1; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println(a[a.length-1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        
        while (casos !=0){
            sc.nextLine();
            
            String[] b = new String[casos];
            
            
            for (int i = 0; i < b.length; i++) {

                b[i] = sc.next();

            }

            Arrays.sort(b);
            imprimeArray(b);
           

            casos = sc.nextInt();
        }
    }
}