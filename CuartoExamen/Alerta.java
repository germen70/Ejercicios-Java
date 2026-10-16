import java.util.ArrayList;

public class Alerta {

    public static void main(String[] args) {
        ArrayList <Borrasca> lista = new ArrayList<>();
        lista.add(new Borrasca("Alice"));
        lista.add(new Borrasca("benjamin", 75,100));
        //imprimir
        for (Borrasca b : lista) {
            System.out.println(b);
        }

        lista.add(new Borrasca("Claudia", 175,50));
        lista.add(new Borrasca("David"));
        
        //actualiza
        lista.getLast().setLluvia(200);
        lista.getLast().setViento(100);
        //imprimir
        System.out.println(lista.getLast());
    }
}