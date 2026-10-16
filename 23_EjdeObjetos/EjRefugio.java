import java.util.ArrayList;

public class EjRefugio {

    public static void main(String[] args) {
        Refugio r1 = new Refugio("Pets", "calle 1", 5);
        Perro perr1 = new Perro("Firulais", "Sin raza");
        Pajaro paj1 = new Pajaro("Piolin", "Sin raza");
        for (Sala s : r1.lista) {
            //solo metemos al perro 1 vez, cuando lo haga hay que salir del foreach
            if(s.anyadirAnimal(perr1)){//la condicion ya da true o false
                System.out.println("añadido perro correctamente");
            }
            if (s.anyadirAnimal(paj1)) {
                
                System.out.println("añadido pajaro "+ paj1.nombreAnimal+"correctamente");
            }
        }


        r1.lista.get(0).anyadirAnimal(perr1);
        
    }
}
class Refugio{

    private String nombre;
    private String direccion;
    private int capacidadJau;
    protected ArrayList<Sala> lista;
    
    //constructor
    public Refugio(String nombre, String direccion, int capacidadJau) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.capacidadJau = capacidadJau;
        this.lista = new ArrayList<>();
        
        lista.add(new Sala(1, 5,1)); //creamos 1 sala con perros
        lista.get(0).anyadirAnimal(new Perro("Perro1", "Mestizo"));

        lista.add(new Sala(2, 8,2));//creamos 1 sala con gatos
        lista.get(1).anyadirAnimal(new Perro("Gato1", "Mestizo"));
        
        lista.add(new Sala(3, 12,3));//creamos 1 sala con conejo
        lista.get(2).anyadirAnimal(new Perro("Conejo1", "Mestizo"));

        lista.add(new Jaula(4, 7,4));//creamos 1 sala con pajao
        lista.get(3).anyadirAnimal(new Perro("Conejo1", "Mestizo"));
        
    }
}
class Sala {//se guardan animales que no sean pajaros

    private int id;
    protected int capacidadMax;
    protected int tipo;//aqui pondre el tipo de animal que habra en la sala //private Animal tipo; tambien valdria pero habria q inicializar y tal
    //1=perro 2=gato 3= conejo
    ArrayList<Animal> listaAnimal;

    public Sala(int id, int capacidadMax, int tipo) {
        this.id = id;
        this.capacidadMax = capacidadMax;
        this.tipo = tipo;
        listaAnimal = new ArrayList<>();
        /*Esto no vale hacer 
        if (tipo.equals(tipo)) {
            listaAnimal = new ArrayList<Perro>(); !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        }*/
    }
    public boolean anyadirAnimal(Animal ani){
        if (listaAnimal.size() <=capacidadMax) {
            if (tipo ==1 && ani instanceof Perro) {
                listaAnimal.add(ani);
                return true;
            }
            if (tipo ==2 && ani instanceof Gato) {
                listaAnimal.add(ani);
                return true;
            }
            if (tipo ==3 && ani instanceof Conejo) {
                listaAnimal.add(ani);
                return true;
            }
        }else{
            System.out.println("superada capacidad maxima");
        }
       
        return false;
    }
}
class Jaula extends Sala{ //jaula es un tipo de sala donde solo se guardan pajaros

    private ArrayList<Pajaro> listaJ;
    
    //constructor
    public Jaula(int id, int capacidadMax, int tipo) {
        super(id, capacidadMax, tipo);
        listaJ = new ArrayList<>();
        
    }
    @Override //hacemos un override para modificar el metodo del padre
    public boolean anyadirAnimal(Animal ani){
        if (listaJ.size() <=capacidadMax) {
            if (tipo ==4 && ani instanceof Pajaro) {
                listaAnimal.add(ani);
                return true;
            }
            return false;
        }
        return false;
    }

}
abstract class Animal { //la creamos abstracta para q no podamos crear el objeto Animal (da igual si se pone o no pero con en irl no hay animal)

    protected String nombreAnimal;
    protected String raza;
    protected int numpatas;
    private boolean vuela;
    protected boolean chip;

    //constructor
    public Animal() {
        this.numpatas = 4;
        this.vuela = false;
        this.chip = false;
    }
    public Animal(int numpatas, boolean vuela, boolean chip) {
        this.numpatas = numpatas;
        this.vuela = vuela;
        this.chip = chip;
    }
}
class Perro extends Animal{
    
    public Perro(String nom, String raza){
        super(4, false, true);
        nombreAnimal = nom;
        this.raza = raza;
    }
}

class Gato extends Animal{
    public Gato(String nom, String raza){
        super(4, false, true);
        nombreAnimal = nom;
        this.raza = raza;
    }
}
class Conejo extends Animal{
    
    public Conejo(String nom, String raza){
        super(4, false, true);
        nombreAnimal = nom;
        this.raza = raza;
    }
}
class Pajaro extends Animal{
    public Pajaro(String nom, String raza){
        super(2, true, false);
        nombreAnimal = nom;
        this.raza = raza;
    }
}