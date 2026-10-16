/*  EJERCICIO REPASAR 
ojo: INTEGER.valueOF(); y STRING.valueOF();*/

import java.util.Scanner;

public class Exa3_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caso;
        int suma = 0;
        caso = sc.nextInt();

        /*bucle donde mientras no sea un caso en especifico, sigue */
        while (caso != 0) {
            
            String num = String.valueOf(caso);

            //en este for se usa .length() (digitos que tiene)
            for (int i = 0; i < num.length(); i++) {


                //NO SE QUE SIGNIFICA ESTO
                String aux = num.charAt(i)+"";

                int digitos = Integer.valueOf(aux);
                //??????????????????????????????
                int potencia = (int) Math.pow(digitos, num.length());
                suma += potencia;
                
            }

            if (suma == caso) {
                    System.out.println("SI");
                    
                }else{
                    System.out.println("NO");
                }

            /*con esto vuelvo a leer el siguiente numero*/
            caso = sc.nextInt();
            
        }
    }
}