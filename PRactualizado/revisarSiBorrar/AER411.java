/*Resulto con cadenas pero en AER tiene error de "Límite de memoria superado" por usar cadenas cuando 
se puede resolver sin ellas
*/
import java.util.Scanner;

public class AER411{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();

        while(total != 0){
            sc.nextLine();
            String elefante = sc.nextLine();
            int sumaElefante = 0;
            boolean salir = true;
            
            String[] cade = elefante.split(" ");
            
            for (int i = 0; i < cade.length; i++) {
                int ele = Integer.valueOf(cade[i]);
                sumaElefante = sumaElefante + ele;
                if(salir){
                    if(sumaElefante == total){
                        System.out.println(i+1);
                        salir = false;
                    }
                    if(ele == 0 || sumaElefante > total){
                        System.out.println(i);
                        salir = false;
                    }
                }
                
            }
            total = sc.nextInt();
        }
            
        
    }
}