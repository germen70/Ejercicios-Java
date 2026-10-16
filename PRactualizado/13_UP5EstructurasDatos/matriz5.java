/* IMPORTANTE REPASAR.  EJERCICIO SIN TERMINAR
 * tema lectura de datos cuando hay numeros y letras con saltos de linea
 * Mi mayor problema fue:
 * int[][] campo = new int[a][b]   //a: son las columnas y b: son las filas
 * La entrada te da primero las columnas y luego las filas
 * AER176 */

import java.util.Scanner;

public class matriz5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int columna = sc.nextInt();
        int fila = sc.nextInt();
        String a = "";

        while(fila != 0 && columna != 0){
            /*este salto de linea es importante ya que luego vamos a leer una linea entera. Si no hacemos
            el cambio de linea, leeremos una linea vacia (lo siguiente despues del numero es nada)*/
            sc.nextLine();
            
            int[][] campo = new int[fila][columna];
            for (int i = 0; i < fila; i++) {

                a = sc.nextLine();
                
                for (int j = 0; j < columna; j++) {
                    
                    campo[i][j] = 0;
                    //IMPORTANTE ESTA LINEA
                    
                    if (a.charAt(j) == '*') {
                        campo[i][j]= 1;
                    }
                    
                    System.out.print(campo[i][j]+" ");
                }
                System.out.println();
            }
        
        columna = sc.nextInt();
        fila = sc.nextInt();
        
        }
        
    }
}