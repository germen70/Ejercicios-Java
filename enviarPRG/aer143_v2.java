//ejercicio resuelto con array y colas

import java.util.Scanner;
import java.util.Stack;

public class aer143_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); //leo el primer digito
        while( n!= -1){

            Stack<Integer> pila = new Stack<>();
            while(n != -1){
                pila.push(n);
                n = sc.nextInt();
                
            }
            int volteos = sc.nextInt();
            
            for (int i = 0; i < volteos; i++) {
                int tortitas = sc.nextInt();
                int[] array = new int[tortitas];

                for (int j = 0; j < tortitas; j++) {//lo estoy sacando de un lado y metiendo en la nueva lista

                    array[j] = pila.pop();
                }
                for (int j = 0; j < tortitas; j++) {
                    pila.push(array[j]);
                }
                
            }
            System.out.println(pila.peek());
            n =sc.nextInt();
            
        }
    }
}