import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EjRamal_821CompareTo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        while (casos!= 0) {
            ArrayList <Ramal> lista = new ArrayList<>();
            sc.hasNextLine();

            for (int i = 0; i < casos; i++) {
                String nombre = sc.next();
                Integer letra = 0;
                if ('D' == sc.next().charAt(0)) {
                    letra = 1;
                }
                
                Integer distacia = Integer.valueOf(sc.next());

                

                //Simplificado: lista.add(new Ramal(nombre, letra, distacia));
                Ramal r = new Ramal(nombre, letra, distacia);
                lista.add(r);
                
            }
            Collections.sort(lista);

            for (Ramal r : lista) {
                System.out.println(r);
            }


            System.out.println("---");
            casos = sc.nextInt();
        }
    }
}

class Ramal implements Comparable<Ramal>{ //PONER ESTO SI QUIERO USAR UN compareTo

    private String nombre;
    private Integer lado;
    private Integer distancia;
    
    public Ramal(String nombre, Integer lado, Integer distancia) {
        this.nombre = nombre;
        this.lado = lado;
        this.distancia = distancia;
    }
    //para ordenarlos por el menor numero o sino por la D primero (luego la I)
    @Override
    public int compareTo(Ramal r){
        //si son iguales: odena por el lado
        if (this.distancia.equals(r.distancia)) { //OJO Q SE USA .equals y no ==

            // son char por lo que se puede comparar (tabla asir)
            return this.lado - r.lado;
            
        }
        //si no son iguales: ordena por la distancia
        return this.distancia  - r.distancia; //de menor a mayor
    }
    //para imprimir el nombre
    @Override
    public String toString (){
        return this.nombre;
    }

    
    
    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getLado() {
        return lado;
    }

    public void setLado(Integer lado) {
        this.lado = lado;
    }

    public Integer getDistancia() {
        return distancia;
    }

    public void setDistancia(Integer distancia) {
        this.distancia = distancia;
    }
    
}
