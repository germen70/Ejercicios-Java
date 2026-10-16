/*revisar: el while es una forma de leer el primer tiempo y compararlo con el resto de tiempos
 * para saber cual es el menor. saber estructura (se pude hacer tambien un for dentro de un
 * for pero no es del todo correcto (no se pude añadir el primer tiempo y te toca
 * poner tu mismo un tiempo inventado para empezar a comparar) con el while esto no pasa
 * ya que  añadimos el primer tiempo fuera y en el bucle restamos 1 y comparamos con el 
 * resto de marcas
 */

import java.util.Scanner;

public class Exa1_3 {

    public static void main(String[] args) {
        
        Scanner  sc = new Scanner(System.in);
        int casos;
        int jugadores;
        double tiempo = 0;
        double tiempo2 = 0;
        

        casos = sc.nextInt(); 
        for (int i = 0; i < casos; i++) {


            jugadores = sc.nextInt(); 
            //estoy leyendo fuera a 1 jugador
            tiempo = sc.nextDouble();
            //en el bucle, le resto 1 ya que ya he leido 1 arriba
            jugadores--;
            
            while(jugadores >0){
                tiempo2 = sc.nextDouble();
                if (tiempo > tiempo2) {
                    tiempo = tiempo2;
                    
                }
                jugadores--;

            }
     
            System.out.println(tiempo); 
            
            
        }
    }
}