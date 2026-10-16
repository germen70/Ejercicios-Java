/*IMPORTANTE REPASAR
 * AER160 */

import java.util.Scanner;

public class matriz4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        while(casos != 0){
            int[][] m1 = new int[casos][casos];

            int nAbajo = 0;
            int nArriba = 0;
            for (int i = 0; i < m1.length; i++) { //
                for (int j = 0; j < m1[0].length; j++) { //ESO equivale a poner casos(la seguna es decir columnas)
                    m1[i][j] = sc.nextInt();
                    //i != j: para evitar la matriz diagonal
                    //i>j: para buscar la parte inferior de la matriz
                    if(i>j){ //usamos las variables del for para buscar por la matriz
                        
                        nAbajo = nAbajo+m1[i][j];  //el valor de la matriz se suma a una variable
                    //i<j: para buscar la parte superior de la matriz
                    }else if(i<j){
                            
                        nArriba = nArriba+m1[i][j];//el valor de la matriz se suma a una variable
                    
                    }
                         
                }
            }
            /*si alguna de las variables (donde se ha ido sumando) es igual a 0, significa que una ha habido una parte 
             * (ya sea inferior o superior) de la matriz donde ha sido todos 0.
            */
            if (nAbajo == 0 || nArriba == 0){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }

            casos = sc.nextInt();
        }

    }
}