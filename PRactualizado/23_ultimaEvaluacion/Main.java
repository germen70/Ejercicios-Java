import java.lang.classfile.instruction.ReturnInstruction;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        MaquinaVending maquina = new MaquinaVending("SENIA VENDING");  //Representa una maquina de vending

        do {
            System.out.println("--- "+ maquina.getNombre() +" ---");
            System.out.println("1. Ver productos");
            System.out.println("2. Insertar dinero");
            System.out.println("3. Comprar producto");
            System.out.println("4. Devolver dinero");
            System.out.println("5. Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    maquina.mostrarProductos();
                    break;
                case 2:
                    double dinero = sc.nextDouble();
                    maquina.insertarCredito(dinero); //Añade el credito
                    System.out.println("Crédito actual: " + maquina.getCredito() + " euros");
                    break;
                case 3:
                    String codigo = sc.next();
                    switch (maquina.comprar(codigo)){
                            case 0:
                                System.out.println("Producto entregado"); //Se hace la compra
                                break;
                            case -1:
                                System.out.println("Producto agotado");
                                break;
                            case -2:
                                System.out.println("Crédito insuficiente");
                                break;
                            case -3:
                                System.out.println("Código incorrecto");
                                break;
                    }
                    break;
                case 4:
                    maquina.devolverDinero();  //Pone el credito a 0
                    break;
            }

        } while (opcion != 5);
    }
}
class MaquinaVending{

    private String nombre;
    private Lineal[] lineales;
    private double credito;
  
    //constructor
    public MaquinaVending(String nombre) {
        this.nombre = nombre;
        lineales = new Lineal[6];
        lineales[0] = new Lineal("A1", new Bebida("Agua", 1.0, false), 5);
        lineales[1] = new Lineal("A2", new Bebida("Refresco", 1.5, true), 5);
        lineales[2] = new Lineal("B1", new Snack("Patatas", 1.2), 5);
        lineales[3] = new Lineal("B2", new Snack("Chocolate", 1.8), 5);
        lineales[4] = new Lineal("C1", new Sandwich("Sandwich Mixto", 3.5), 3);
        lineales[5] = new Lineal("D1", new Ensalada("Ensalada Cesar", 4.0, true), 3);
        credito = 0.0;
    }
    //metodos
    public void mostrarProductos(){
        
        for (Lineal l : lineales) {
            System.out.println(l);
        }
    }
    public void insertarCredito(double money){
        credito = credito+money;
    }
    public int comprar(String n){
        n = n.toUpperCase();  //lo pongo a mayusculas siempre
        //simplificar este if
        for (Lineal l : lineales) {
            if (l.getCodigo().equals(n)) {

                if (l.getStock() <=0) {
                    return -1;
                }

                if (credito >= l.getProd().getPrecio() ) {
                    //System.out.println(info(l.p));
                    this.credito = this.credito - l.getProd().getPrecio();
                    
                    System.out.println("Producto Entregado: "+ l.getProd().getNom()+"\n"+darMoney());

                    l.setStock(l.getStock()-1);

                    return 0;
                }
                return -2;
                
            }
        }
        return -3;
    }
    
    public void devolverDinero(){
        //String abc = darMoney(); 
        System.out.println("Operacion cancelada.\n"+darMoney());
    }
    public String darMoney(){
        String qwe = "Cambio devuelto: "+this.credito+" euros";
        this.credito = 0.0;
        return qwe;
    }
    //get y set   
    public String getNombre() {
        return nombre;
    }
    public double getCredito() {
        return credito;
    }
}
class Lineal{
    private String codigo;
    private Producto prod;
    private int stock;

    //construcor
    public Lineal(String codigo, Producto prod, int stock){
        this.codigo = codigo;
        this.prod = prod;
        this.stock = stock;
    }
    //imprimir
    public String toString(){
        
        return this.getCodigo()+" | "+this.getProd().getNom()+" | "+this.getProd().getPrecio()+" euros | Stock: "+this.getStock();
    }
    //get y set
    public String getCodigo() {
        return codigo;
    }
    public Producto getProd() {
        return prod;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}

abstract class Producto {
    private String nom;
    private double precio;
    
    //constructor
    public Producto(String nomm, double pr){
        this.nom = nomm;
        this.precio = pr;
    }
    //get necesarios
    public String getNom() {
        return nom;
    }

    public double getPrecio() {
        return precio;
    }
}
//hijas de productos
class Bebida extends Producto{
    private boolean tieneGas;

    //constructor
    public Bebida(String nomm, double pr, boolean tieneGas){
        super(nomm, pr);
        this.tieneGas = tieneGas;
    }
}
class Snack extends Producto{

    //constructor
    public Snack(String nomm, double pr){
        super(nomm, pr);
    }
}
class Sandwich extends Producto{

    //constructor
    public Sandwich(String nomm, double pr){
        super(nomm, pr);
    }
}
class Ensalada extends Producto{
    private boolean esVegetariano;

    //constructor
    public Ensalada(String nomm, double pr, boolean esVegetariano){
        super(nomm, pr);
        this.esVegetariano = esVegetariano;
    }
}