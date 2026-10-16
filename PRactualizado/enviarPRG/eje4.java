import java.util.ArrayDeque;
import java.util.ArrayList;

public class eje4 {

    public static void main(String[] args) {
        //Meter los numeros del 1 al 90 en una lista
        ArrayList<Integer> bolas = new ArrayList<>();

        for (int i = 1; i <= 90; i++) {
           bolas.add(i);
        }

        //Sacarlos aleatoriamente y ponerlos en una cola
        ArrayDeque<Integer> cola = new ArrayDeque<>();
        while (! bolas.isEmpty()) { //mientras no sea vacia, tambien vale: mientras bolas != 0
            int pos = (int)(Math.random()*bolas.size());
            Integer bola = bolas.remove(pos);
            
            cola.add(bola);

        }
        //
        try {//este try sirve para que nos saque los numero segun la velocidad que yo quiera
            while (!cola.isEmpty()) {
                Thread.sleep(500);
                System.out.print(cola.poll()+" ");
            }  
        } catch (Exception e) {
            
            System.out.println(e);
        }
       
    }
}