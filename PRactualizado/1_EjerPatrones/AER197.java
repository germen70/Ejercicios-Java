//pilas

import java.util.Scanner;
import java.util.Stack;

public class AER197 {
    public static String fase1(String s){
        String m = "";
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < s.length(); i++) { //esta funcion ordena primero los caracteres par y luego las impares
            if (i%2 == 0) { //si la letra está en una posicion par, se añade
                m = m + s.charAt(i);
            }else{ //si no esta en una posicion par, se añade a una pila temporal
                pila.add(s.charAt(i));
            }
            
        }
        //recorrer la pila: mientras la pila no este vacia, entra dentro del bucle
        //ahora metemos la pila en "m"
        while (!pila.isEmpty()) {
            m = m + pila.pop();
        }
        return m;
    }

    public static String fase2(String s){ //esta funcion invierte los caracteres
        String m = "";
        String vocales = "aeiouAEIOU";
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char l = s.charAt(i);
            if (vocales.contains(l+"")) { //importante poner el +"" porque sino no va
                while (!pila.isEmpty()) {
                    m = m + pila.pop();
                }    
                m = m + l;
            }else{
                pila.push(l);
            }
        }
        //este while es importante por si cuando salga del for y haya algo en la pila, se añada y no se pierda
        while (!pila.isEmpty()) {
            m = m + pila.pop();
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String mensaje = sc.nextLine();

            String mensa1 = fase1(mensaje);

            String mensa2 = fase2(mensa1);

            System.out.println(mensaje+" => "+mensa2);
            
        }
    }
}
