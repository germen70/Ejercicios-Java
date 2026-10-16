/* Problema: 2 lineas, la primera nos dan la cantidad limite y la segunda es la cantidad que se va añadiendo
 * Nos piden contabilizar cuantas veces se añadia:
 * Si la cantidad que se añade es igual al limite: Cuenta. 
 * Si la cantidad que se añade es 0 : Cuenta hasta la anterior
 * Si la cantidad supera el limite: Cuenta hasta la anterior
 * 
 * Cuando el caso era 0, no se tenia que incluir sc.nextInt(); habia que hacer directanente sc.nextLine(); .
 * eleTotal = sc.nextInt();sc.nextLine(); Sobraba el cambio de linea porque ya lo hace automaticamene, el
 * programa funciona pero salia "Exception in thread "main" java.util.NoSuchElementException: No line found" 
 * ya que yo forzaba leer la siguiente linea cuando ya finalizó la entrada.
 * Habia que usar un boolean para poder salir del while
*/
import java.util.Scanner;

public class AER411SinCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eleTotal = sc.nextInt(); sc.nextLine();
        
        //mientras no sea 0, entra dentro del bucle
        while(eleTotal != 0){
            //definimos variable
            int eleSuma = 0;    
            int contador = 0; 
            int elefante = sc.nextInt();    //leemos el primer elefante
            boolean seguir = true;  //bolean para salir del while

            while(seguir){
                contador++;     //cada vez que se repide el while, se suma el contador
                eleSuma = eleSuma + elefante;   //sumamos los elefantes

                //importante: el if. Cuando es 0 significa que no habrá mas digitos en la linea, por lo cual 
                //no puede hacer elefante = sc.nextInt(); porque saltaria linea/error al no encontrar siguiente digito
                if(elefante == 0 || eleTotal < eleSuma){  //si el elfante es 0, salimos 
                    System.out.println(contador -1); 
                    seguir = false;
                }else{

                    if(eleSuma == eleTotal){
                    System.out.println(contador);
                    seguir = false;
                    }
                    elefante = sc.nextInt(); // solo hacemos esto porque sabemos que habrá mas digitos al no ser 0
                
                }
            }
            sc.nextLine();
            eleTotal = sc.nextInt();
        }
        
    }
}
