//ejercicio de pila: La pila solo se puede acceder al ultimo elemento. ya sea para añadir o quitar
// .empty, .pop (para verlo y quitarlo), .peek (solo verlo)
import java.util.Scanner;
import java.util.Stack;

public class ejePilas {

    public static Boolean esCorrecta(String abc){
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < abc.length(); i++) {
            char caso = abc.charAt(i);
            if (caso == '(' || caso == '{' || caso == '[') {
                pila.push(caso);
            }
            try{ /*cuando el primer elemento es ),],} el .pop() mira elementos de la pila, pero la pila esta vacia
                 dará error*/
                if (caso == ')') {
                    
                    char caso1 = pila.pop(); //esto dice sacame el primer elemento de la pila
                    if (caso1 !='(') {
                        return false;
                    }
                }
                if (caso == '}') {
                    char caso1 = pila.pop();
                    if (caso1 !='}') {
                        return false;
                    }
                }
                if (caso == ']') {
                    char caso1 = pila.pop();
                    if (caso1 !='(') {
                        return false;
                    }  
                }
            }catch(Exception e){
                return false;
            }
        }//fin del for
        if (pila.isEmpty()) {
            return true;
        }
        return  false;
    }//fin de la función

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = "";

        while (sc.hasNext()) {
            entrada = sc.nextLine();

            if(esCorrecta(entrada)){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }
    }
}
