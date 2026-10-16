/*SIN TERMINAR. HAY ALGO QUE FALLA*/

import java.util.Scanner;

public class AER315 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int fila = sc.nextInt();
        int columnas = sc.nextInt();
        while(fila !=0 ||columnas != 0){
            sc.nextLine(); //lee el salto de linea porque en este ejercicio tenemos numeros y caracteres
            char[][] minas = new char[columnas][fila];

            for (int i = 0; i < fila; i++) { 
                String filass = sc.nextLine();

                
                for (int j = 0; j < filass.length(); j++) {  //en vez de columnas se puede poner fila.length();
                    minas[i][j] = filass.charAt(j);
                    
                         
                }
            }
            int celdas = 0; //representa q es una celda en blanco y tiene 6 bombas
            //no hace falta comprobar los laterales porque nunca van a llegar a 6 minas. por eso:
            for (int i = 1; i < fila-1; i++) {
                for (int j = 1; j < columnas-1; j++) {

                  if(minas[i][j] == '-') { 
                    int bombas =0;
                    //aqui otro doble bucle for para recorrer el tablero.IMPORTANTE ENTENDER
                    for (int k = i-1; k < i+1; k++) {
                        for (int k2 = j-1; k2 < j+1; k2++) {
                            if(minas[i-1][j-1] =='*'){
                            bombas++;
                            }
                        }
                    }
                    if(bombas>=6){
                        celdas++;
                    }
                  }
                }
            }

            System.out.println(celdas);
            fila = sc.nextInt();
            columnas = sc.nextInt();
        }

    }
}