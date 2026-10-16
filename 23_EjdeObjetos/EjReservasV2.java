//Sin mapas
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class EjReservasV2 {
    public static void main(String[] args) {
        Polideportivo pol = new Polideportivo("SUMA");
        Pista p1 = new Padel("T1", "Interior");
        pol.addPista(p1);
        Pista p2 = new Tenis("T1", "Exterior");
        pol.addPista(p2);

        Reserva r = new Reserva(p2, 1, 2, 4);
    }
    
}

class Polideportivo {

    private String nombre;
    private String direccion;
    private ArrayList <Pista> pista;
    //se elige el dia hora, mes a la vez
    private Map<String,int[][][]>  reservas = new HashMap<String, int[][][]>(); //mes, dia, hora

    
    /* elegimos el dia y de ahi se elige la hora 
    private ArrayList<Map<String, int[]>> asasa= new ArrayList<>(); tambien se podria haber ido por este camino
    es un array del dia, array de hora
    */
    
    public Polideportivo(String nombre) {
        this.nombre = nombre;

    }
    
    public boolean addPista(Pista p){ //creamos esto ya que no vale crear el objeto Pista (es abstracto)
        try {
            pista.add(p);
            reservas.put(p.getNombre(), new int[12][31][24]);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    public boolean addReserva(Reserva r){ //creamos esto ya que no vale crear el objeto Pista (es abstracto)
        try {
            //esto es lo mismo que lo de abajo
            //int n = reservas.get(r.getP().getNombre())[r.getMes()] [r.getDia()] [r.getHora()]; //obtenemos el valor

            int[][][] n = reservas.get(r.getP().getNombre());
            int valor = n[r.getMes()][r.getDia()][r.getHora()];
            
            if (valor != 0) { //si es distinto a 0 significa que esta sin reservar
                return false;
            }

            n[r.getMes()][r.getDia()][r.getHora()] = 1; //aqui reservamos colocando en la posicion del cubito un 1

            reservas.put(r.getP().getNombre(),n); //lo añadimos a la lista
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
    //he creado todos los get y set por pereza
    public Pista getP() {
        return p;
    }
    public void setP(Pista p) {
        this.p = p;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    
}