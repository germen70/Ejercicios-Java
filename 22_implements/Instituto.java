import java.util.ArrayList;


public class Instituto {
    public static void main(String[] args) {
        
        Estudiante es = new Estudiante();
        ArrayList<Persona> lista = new ArrayList<>();
        
        Direccion d1 = new Direccion();
        Direccion d2 = new Direccion("Calle", "val", 49000, "Esp");
        Direccion d3 = new Direccion("final", "sasa", 112, "saa");

        Persona p1 = new Estudiante("Pepe", "Palotes", 1234, d1 , 987);
        
        Persona p2 = new Estudiante();
        Persona p3 = new Profesor("Patci", "Pistola", 191918, d3, 1);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        for (Persona persona : lista) {
            System.out.println(persona);
        }
    }
}
class Direccion{

    private String calle;
    private String ciudad;
    private int codigo;
    private String pais;

    public Direccion(String calle, String ciudad, int codigo, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigo = codigo;
        this.pais = pais;
    }
    public Direccion(){

    }
    
}

class Persona{

    private String nombre;
    private String apellido;
    private int nif = 0;
    private Direccion direccion ;
    //constructor
    //este es sin direccion
    public Persona(String nombre, String apellido, int nif) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
        this.direccion = new Direccion();
    }
    //con dire
    public Persona(String nombre, String apellido, int nif, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
        this.direccion = direccion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getNif() {
        return nif;
    }
    public void setNif(int nif) {
        this.nif = nif;
    }
    public Direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }  
}
class Estudiante extends Persona{
    private int idEstudiante;

    public Estudiante(){
        super("SinNombre", "SinApellido", 0, new Direccion() );
        this.idEstudiante = 0;
    }
    public Estudiante(String nombre, String apellido, int nif, Direccion direccion, int idEstudiante) {
        super(nombre, apellido, nif, direccion);
        this.idEstudiante = idEstudiante;
    }
    //imprimir
    public String toString(){
        String p ="Ficha: \n"+ this.getNombre()+"\n"+
        this.getApellido()+"\n"+
        this.getNif()+"\n"+
        this.getDireccion()+"\n"+
        this.idEstudiante;
        return p;
    }
    //get y set

}
class Profesor extends Persona{
    private int ndespacho;

    public Profesor(){
        super("", "", 0, new Direccion());
        this.ndespacho = 0;
    }
    public Profesor(String nombre, String apellido, int nif, Direccion direccion, int ndespacho) {
        super(nombre, apellido, nif, direccion);
        this.ndespacho = ndespacho;
    }
    //imprimir
    public String toString(){
        String p ="Ficha: \n"+ this.getNombre()+"\n"+
        this.getApellido()+"\n"+
        this.getNif()+"\n"+
        this.getDireccion()+"\n"+
        this.ndespacho;
        return p;
    }

}