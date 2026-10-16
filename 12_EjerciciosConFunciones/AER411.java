//HACERLO SIN UNA CADENA. sumar de uno en uno y comparar y mientras no sea un 0

import java.util.Scanner;

public class AER411{
    /* public static int calcula(int a){
        int res = 0;



        return res;

    }*/
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();sc.nextLine();

        while(total != 0){
            
            String elefante = sc.nextLine();
            int contador = 0;
            
            String[] cade = elefante.split(" ");
            
            for (int i = 0; i < cade.length; i++) {
                int ele = Integer.valueOf(cade[i]);
                contador = contador + ele;
                if(contador >= total){
                    System.out.println(cade[i]);
                }
                if(ele == 0){
                    System.out.println(cade[i-1]);
                }
            }
            total = sc.nextInt();sc.nextLine();
        }
            
        
    }
}