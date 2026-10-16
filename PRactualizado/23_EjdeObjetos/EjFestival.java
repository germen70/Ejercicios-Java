import java.util.ArrayList;

public class EjFestival {

    public static void main(String[] args) {
        
    }
}

class Festival {

    private String nombre;
    private int aforoMax;   
    private ArrayList<Zona> fiesti;
    //constructor
    public Festival(String nombre, int aforoMax) {
        this.nombre = nombre;
        this.aforoMax = aforoMax;
        this.fiesti = new ArrayList<>(3); //si pongo un numero dentro del () me crea 3 espacios dentro del array
    }
}

class Zona {
    private String nombre;

    private String genero; //genero de musica
    private ArrayList<Barra> bar;
}

class Barra {

    private int cantidad;
    private Grifo[] grifos;
    
    //constructor
    public Barra(int cantidad) { //creo el array con la cantidad que me pasen
        this.cantidad = cantidad;
        this.grifos = new Grifo[cantidad];
        grifos[0] = new Grifo(20, new Cerveza());
        grifos[1] = new Grifo(new Refresco());
    }
}

class Grifo {

    private int capacidad;//capacidad del grifo
    private Bebida b;
    
    //constructor
    public Grifo(Bebida b) {
        capacidad = 10;
        this.b = b;
    }
    public Grifo(int capacidad, Bebida b) {
        this.capacidad = capacidad;
        this.b = b;
    }
}

class Bebida {

    protected String marca;
    protected String nombre;
    protected int precio;
    //constructor
    public Bebida() {
        marca = "";
        nombre = "";
        precio = 0;
    }
    public Bebida(String marca, String nombre, int precio) {
        this.marca = marca;
        this.nombre = nombre;
        this.precio = precio;
    }    
}
class Refresco extends Bebida{
    protected boolean carbonatada;
    protected boolean esZero;
    
}
class BebidaConAlcohol extends Bebida {

    protected int grados; //grados de alcohol
    protected boolean destilada;
    
    //constructor
    public BebidaConAlcohol() {
        grados = 8;
    }
}
class Cerveza extends BebidaConAlcohol {
    protected String tipo;
    
    //constructor
    public Cerveza(){
        grados = 5;
        tipo = "Tostada";
        precio = 7;
    }
    public Cerveza(String tipo){
        this.tipo = tipo;
    }
}

class RCola {
    
}