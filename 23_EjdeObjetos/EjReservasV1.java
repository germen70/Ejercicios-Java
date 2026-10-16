
import java.util.ArrayList;
public class EjReservasV1 {
    public static void main(String[] args) {
        Polideportivo pol = new Polideportivo("SUMA");
        Pista p1 = new Padel("T1", "Interior");
        pol.addPista(p1);
        Pista p2 = new Tenis("T1", "Exterior");
    }
    
}

class Polideportivo {

    private String nombre;
    private String direccion;
    private ArrayList <Pista> pista;

    public Polideportivo(String nombre) {
        this.nombre = nombre;

    }
    public Polideportivo(String nombre, String direccion) {
        this(nombre); //el this hace referencia al constructor de arriaba (al que se le da un atributo)
        this.direccion = direccion;
        
        /* Esto no vale si la clase pista es abstracta ya que no se puede crear el objeto pista!!
        for (int i = 0; i < npistas; i++) {
            pista.add(new Pista());  //tendria q poner la hija de pista para que valiese
        }
         */
    }
    
    public boolean addPista(Pista p){ //creamos esto ya que no vale crear el objeto Pista (es abstracto)
        try {
            pista.add(p);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
}
class Pista { //podria ser abstracta (en este eje lo hacemos abstracto)

    private String nombre;

    private String tipo; //exterior o interior

    public Pista() { //constructor por default para que no haya valores null
        this.nombre = "X";
        this.tipo = "Exterior";
    }
    public Pista(String nombre) { //creo este constructor porq quiero pero lo puedo borrar y que solo haya 2
        this.nombre = nombre;
    }
    public Pista(String nombre, String tipo) {
        this(nombre);
        this.tipo = tipo;
    }
    //get y set
    public String getNombre() {
        return nombre;
    }
}
//ESTAS SON LAS CLASES HIJAS, en cada una usamos el constructor del padre
class Padel extends Pista { 

    public Padel(String nombre, String tipo) {
        super(nombre, tipo); 
    }
}
class Tenis extends Pista { 

    public Tenis(String nombre, String tipo) {
        super(nombre, tipo);
    }
}
class Basket extends Pista { 

    public Basket(String nombre, String tipo) {
        super(nombre, tipo);
    }
}
class Reserva {

    private Pista p; //utilizo el objeto abstracto
    private int mes;
    private int dia;
    private int hora; //la hora de reserva

    public Reserva(Pista p, int mes, int dia, int hora) {
        this.p = p;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
    }
    public String toString(){
        return p.getNombre()+" "+dia+ "/"+mes+"\n"+hora;
    }
    
}