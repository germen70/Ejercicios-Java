import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lavanderias {

    public static void main(String[] args) {
        Lavanderia reimon = new Lavanderia(188, "Calle Pantomina", "ReyMon", "Las3mill");
        System.out.println(Lavanderia.numCachibaches); //como el atributo es estatico no hace falta get/set

        Electrodomestico l = new Lavadora("Bosh", "B123", 10, false);
        reimon.addCachibache(l);
        System.out.println(Lavanderia.numCachibaches); //antes habia 2, ahora debe haber 3

        /*con esto saco del mapa 
        mi mapa hasta ahora contiene:
        1, lavadora (sin nada)
        2, secadira (sin nada)
        3 , l
        */
       //System.out.println(reimon.local.get(1).servicios.getFirst()); //tambien vale .get(0) Da Error porque hay valores nulos
       System.out.println(reimon.local.get(3).servicios.get(0)); //nos dara el toString q hemos diseñado
    }
}

class Lavanderia {

    private int num;
    private String direccion;
    private String propietario;
    private String ciudad;
    public Map<Integer, Electrodomestico> local;
    public static int numCachibaches = 0;
    
    //constructor
    public Lavanderia(int num, String direccion, String propietario, String ciudad) {
        this.num = num;
        this.direccion = direccion;
        this.propietario = propietario;
        this.ciudad = ciudad;
        this.local = new HashMap<>(); //vale tambien con un treeMap
        this.local.put(++numCachibaches,new Lavadora()); //inicializamos con el constructor vacio porque aun no se añaden datos
        //numCachibaches++ si se pone asi: SE PONE y luego se suma 1. Yo lo hje puesto asi ++numCachibaches para q primero sume y luego lo ponga
        this.local.put(++numCachibaches, new Secadora()) ;
        
    }
    //metodo
    public void addCachibache(Electrodomestico l){
    this.local.put(++numCachibaches,l);
    }

}
class Electrodomestico {

    private String marca;
    private String modelo;
    protected ArrayList<Servicio> servicios = new ArrayList<>(); //se crea el arraylist

    //constructor
    public Electrodomestico(){
        marca = "";
        modelo = "";
    }
    public Electrodomestico(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

}
class Lavadora extends Electrodomestico{
    private int carga;
    private boolean superior;
    
    //constructor 
    public Lavadora(){
        super();
    }
    public Lavadora(String marca, String modelo, int carga, boolean superior)   {
        super(marca, modelo);
        this.carga = carga;
        this.superior = superior;
        servicios.add(new ServNormal());
    }

}
class Secadora extends Electrodomestico {

    private int carga;
    private boolean hibrido = false;

    
    //constructor    
    public Secadora(){
        super();
    }
    public Secadora(String marca, String modelo,int carga, boolean hibrido) {
        super(marca, modelo);
        this.carga = carga;
        this.hibrido = hibrido;
    }    
}
//clase abstracta. Al ser abstracta no se instancia (solo se crea a partir de las clases hijas)
abstract class Servicio { 
    protected double precio;
    protected int minDuracion;
    protected String tipo;
    
    //construccion
    public Servicio(double precio, int minDuracion, String tipo) {
        this.precio = precio;
        this.minDuracion = minDuracion;
        this.tipo = tipo;
    }
    public Servicio(){
        precio = 0;
        minDuracion = 0;
    }
    public String toString(){
        return "precio: "+precio+ "\nDuración; "+minDuracion+"min";
    }

    
}
class ServRapido extends Servicio {

    private boolean eco;
    
    //constructor
    public ServRapido() {
        super();
        this.eco = eco;
        this.precio = 2.0;
        this.minDuracion = 15;

    }
    //metodos
    public void activarEco(){
        if(!eco){
            eco = true;
            precio += 0.5;
            minDuracion += 5;
        }

    }
    public void desactivarEco(){
  
        if(eco){
            eco = false; 
            precio -= 0.5;
            minDuracion -= 5;
        }
    }

    
}
class ServNormal extends Servicio {
    
    //constructor
    public ServNormal(){
        precio = 3.0;
        minDuracion = 60;

    }


}
class ServDelicado extends Servicio {

    
    //constructor
    public ServDelicado() {
        precio = 10.0;
        minDuracion = 90;
    }
}