import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class AER_748 {
    public static int recorre(ArrayList<Pistolero> lista){
        int pos = -1;
        for (Pistolero pistolero : lista) {
            if (pistolero.nombre.equals(nombre)) {
                pistolero.pistola = pistolero.pistola+p;
                lista.add(pistolero);
                break;
            }
            pos++;
        }

        return pos;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        while (casos != 0) {
            String nombre;
            ArrayList<Pistolero> lista= new ArrayList<>();

            for (int i = 0; i < casos; i++) {
                nombre =  sc.next();

                if (!nombre.equals("?")) {

                    int p = Integer.valueOf(sc.next());
                    if(!lista.contains(new Pistolero(nombre, p))){

                        lista.add((new Pistolero(nombre, p)));
                    }else{
                        
                        lista.get(i);

                            if (pistolero.nombre.equals(nombre)) {
                                 pistolero.pistola = pistolero.pistola+p;
                                lista.add(pistolero);
                                break;
                            }
                        
                    }
                }else{
                    //String l = sc.nextLine();
                    int salidas = sc.nextInt();
                    int pistTotales =0;
                    for (int j = 0; j < salidas; j++) {
                        nombre = sc.next();
                        Pistolero pist = new Pistolero("", 0);
                        for (Pistolero pistolero : lista) {
                            if (pistolero.nombre.equals(nombre)) {
                                pistTotales += pistolero.pistola;
                                pist = pistolero;
                                break;
                            }
                        }
                       
                        lista.remove(pist);
                    }
                    System.out.println(pistTotales);
                    sc.nextLine();

                }
            }
            System.out.println("---");/*
            int aa = lista.size();
            for (int i = 0; i < aa; i++) {
                System.out.println(lista.getFirst());
                lista.removeFirst();
            } */
           casos = sc.nextInt(); 
        }
    }
}
class Pistolero implements Comparable<Pistolero>{
    public String nombre;
    public int pistola;

    public Pistolero(String nombre, int pistola) {
        this.nombre = nombre;
        this.pistola = pistola;
    }
    @Override
    public int  compareTo(Pistolero p){
        //ver como ordena esto
        return this.nombre.compareTo(p.nombre);
    }

    @Override
    public String toString(){
        return nombre+" "+pistola;
    }
}