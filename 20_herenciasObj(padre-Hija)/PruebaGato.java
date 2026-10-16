class Animales{
    private String nombre;
    private Character genero;
    protected String texto; //ver porque es protected y no private (tiene que ver con el objeto de abajo: clase padre e hijo)
    
    //constructor
    public Animales (String nombre, Character genero){
        this.nombre  =nombre;
        this.genero = genero;
        this.texto = "GRRRR";
    }

     //metodo
    public void habla(){
        System.out.println("GRR");
    }
    //imprimir
    public String toString(){
        return "Mi nombre es "+nombre;
    }
}

class Gato extends Animales { //para usar el objeto padre hay que poner: extends Nombre
    private int nPatas;

    //constructor
    public Gato (String nombre){
        super(nombre,'M') ; //al poner super() lo que hace es usar el constructor del padre (Animales)
        this.nPatas = 4; //todos los gatos tienen 4 patas
        this.texto = "MIAU";  //este atributo es del objeto super y lo sobreescribimos (pasamos de GRRR A MIAU)
        
    }    
    /*IMPORTANTE PONER: en la clase padre ya hay un toString, si queremos imprimir lo de la clase Gato tenemos q poner un @override
    */
    @Override 
    public String toString(){
        String s = super.toString(); //llamo al toString de mi objeto super

        return s+"\nMi Gato tiene "+nPatas+" patas";
    }

    //metodo
    public void habla(){
        System.out.println("Miau");
    }
}
public class PruebaGato {
    public static void main(String[] args) {

        Gato g = new Gato("Michi");//creo el objeto Gato 
        //lo de abajo: creo un objeto animal con los contructores de gato (se puede porque los he construido de forma hereditaria)
        //
        //si fuesen clases abstractas ya no valdria
        Animales g1 = new Gato("Michi");//creo el objeto Gato 
        g.habla(); // IMPRIME MIAU y no GRR
        System.out.println(g);
        System.out.println(g.texto); // IMPRIME MIAU y no GRR
    }

    
}