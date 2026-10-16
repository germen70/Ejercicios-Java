/*REPASAR: variante del ejercicio pero sin cadenas.
primero leo el numero y luego leo la letra (usamos el sc.next())*/

import java.util.Scanner;

public class Exa1_1v2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String carta;
        String[] datos;
        String naipe;

        
        while(sc.hasNext()){
            
            

            /* OJO: el numero que tengo en datos esta en String. Hago una conversion de
             * datos en num.
             * ojo con [aqui va el orden que quiero]
             */
            int num = Integer.valueOf(sc.next());
            naipe = sc.next();

            if (num != 1 && num != 12) {
                System.out.println("DULCE");
                
            }else{
                if (num == 1) {
                    /*comparamos el naipe: se utiliza nombre.equals("letra") y no
                     naipe == "letra"*/
                    if(naipe.equals("O")){
                        System.out.println("MOVIL");
                    }else{
                        System.out.println("JUEGO DE MESA");
                    }
                    
                }else{
                    if(naipe.equals("O")){
                        System.out.println("DRON");
                    }else{
                        System.out.println("COMIC");
                    }
                }
            }
            
            
        }

    }
}