//sin terminar
import java.util.Scanner;

public class EjPersonas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Persona p1 = new Persona(sc.next(), sc.nextInt(), sc.next(),sc.next().toUpperCase().charAt(0), sc.nextDouble(),sc.nextDouble());
        //Persona p2 = new Persona(sc.next(), sc.nextInt(), sc.next().toUpperCase().charAt(0));
        Persona p3 = new Persona("Juan Nadie", 50, 'X');

        //System.out.println(p1.getDni());
        //System.out.println(p2.getDni());
        System.out.println(p3.getDni());
    }
}
class Persona {

    private String nombre;
    private Integer edad;
    private String dni;
    private Character sexo;
    private Double peso;
    private Double altura;
    
    //constructores
    public Persona(String nombre, Integer edad, Character sexo) {
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo); //sexo se envia al metodo y el metodo ya define el this.sexo
        this.dni = generaDni();
    }    
    public Persona(String nombre, Integer edad, String dni, Character sexo, Double peso, Double altura) {
        
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }
    //metodos
    
    public int  calcularIMC(){

        //IMC= Peso actual (kg) ÷ altura (m) x altura (m)= kg/m2
       if (this.peso.equals(null) || this.altura.equals(null)){
            return -1;
       }
        double num = this.peso / (this.altura * this.altura);

        if (num < 20) {
            return 0;
        }
        if (num < 25) {
            return 1;
        }
        if (num < 30) {
            return 2;
        }

        return 3;
        
    }
    public Boolean esMayorDeEdad(){ 
        if (this.edad < 18) {
            return true;
        }
        return false;
    }
    private void comprobarSexo(char sexo){ //no es visible al exterior por eso es private
        if (sexo !='H' || sexo !='M' && sexo != 'X'){ 
            sexo = 'M'; 
        }
        this.sexo = sexo; //aqui ya define el thgis.sexo

    }
    private String generaDni(){
        int n = (int)(Math.random()*100000000);
        char[] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B', 'N','J','Z','S','Q','V','H','L','C','K','E'};
        int l = n %23;
        String ns = String.format("%08.0f", (float)n); //.valueOf()  Crea el tamaño del String
        
        return ns +""+ letra[l];
        
    }
    //imprimir
    @Override
    public String toString(){
        return
        this.nombre+" "+
        this.edad+" "+
        this.dni+" "+
        this.sexo+" "+
        this.peso+" "+
        this.altura;
    }
    //GET Y SET
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public Character getSexo() {
        return sexo;
    }
    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
}