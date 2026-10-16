//problema sobre retroceder si no se llega a la  meta de forma exacta. EL parchis. AER407
import java.util.Scanner;

public class AER407 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int casillas = sc.nextInt();//tope maximo
        int posicion = sc.nextInt();//mi posicion
        int tirada = sc.nextInt();//lo que avanzo

        while (casillas != 0 || posicion != 0 || tirada != 0) {

            if (posicion+tirada <= casillas) { //si no sobrepasa el tablero

                System.out.println(posicion+tirada);//sumo mi posicion+ la tirada
            } else { //si sobrepasa el tablero
                int sobra = (posicion+tirada) - casillas; //sumo mi nuva posicion y le restamos lo que sobrepasa
                int rebote = casillas - sobra; //restamos desde el final hasta el inicio
                System.out.println(rebote);
            }

            casillas = sc.nextInt();
            posicion = sc.nextInt();
            tirada = sc.nextInt(); 
        }
    }
}