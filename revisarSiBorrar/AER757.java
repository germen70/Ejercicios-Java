/*REPASAR ESA FUNCION PÒRQUE ES MUY UTIL: una linea se separa en una cadena y se contea cuantos
digitos tiene la cadena*/

import java.util.Scanner;

public class AER757{
    

    public static int calcula(String s){
        int res = 0;
    
        String[] cade = s.split("S");
        for (int i = 0; i < cade.length; i++) {

            String num = String.valueOf(cade[i]);
            int ab = num.length();
            
            
            if ( ab > res){
                res = ab;

            }
        }

        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt(); sc.nextLine();

        for (int i = 0; i < casos; i++) {
            
            System.out.println(calcula(sc.nextLine()));
            
        }
    }
}
