//VER. Es lo del try catch

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caramelos = 100;
        int reparto = 0;
        System.out.println("cuantos sois en clase?");

        while(sc.hasNext()){
            
 
            try{
                int personas = sc.nextInt();
                reparto = caramelos/personas;
                System.out.println("salimos a "+reparto+" cada persona");
            }catch(InputMismatchException e){
                System.out.println("No has introducido un numero entero");

            }catch(ArithmeticException e){
                System.out.println("No puedo repartir caramelos a 0 personas");

            }catch(Exception e){
                System.out.println("ERROR GLOBAL");
            }finally{
                sc.nextLine();
            }
        }
    }
}