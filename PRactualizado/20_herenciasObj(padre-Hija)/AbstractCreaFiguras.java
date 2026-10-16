/*
Las clases abstractas se usan como plantilla ya que se juegan con  las clases hijas 
los metodos de esta clase deben ser OBLIGATORIAMENTE modificadas en los metodos de las clases hijas
Yo no quiero crear el objeto Figura, pero es necesario*/
import java.util.Vector;

public class AbstractCreaFiguras {
    public static void main(String[] args) {
        
        Vector<Figura> figuras = new Vector<Figura>(); //creo un vector de figuras PERO NO VOY A METER FIGURAS (metere tipos de figura)
        // Figura fx = new Figura(); //esto no valdria porque es una clase abstracta
        Figura f = new Circulo(10); 
        //al usar el abstract yo no puedo crear un objeto pero si instanciar sus clases hijas o sus metodos

        figuras.add(new Circulo(10)); // Radio=10
        figuras.add(new Cuadrado(10)); // Lado=10
        figuras.add(new Triangulo(10,5)); // Base=10, Altura=5;
        for (Figura fa: figuras){
            System.out.println("Área: "+fa.area());
            System.out.println("Perímetro: "+fa.perimetro());
        }
    }
}
////////////
abstract class Figura{ 
    
    //constructor
    public Figura(){
    
    }
    //metodos
    public abstract double area(); // Los metodos abstractos no tinen cuerpo {}. SOlo se pone la cabecera
    //Deben ses los metodos de las clases hijas los que modifiques este metodo (con el @overide)
    //public double perimetro(); //como el objeto es abstracto, los metods deben ser abtracto
    public abstract double perimetro(); 
    
}
////////////
class Cuadrado extends Figura{

    private Integer  lado;

    //constructor
    public Cuadrado(Integer lado) {
        this.lado = lado;
    }

    //metodos
    @Override
    public double area(){
        return this.lado * this.lado;
    }
    @Override
    public double perimetro(){
        return 4 * lado;
    }

    
}
////////////
class Circulo extends Figura{
    private double radio;

    //constructor
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    @Override
    //metodos
    public double area(){
        return Math.PI * radio * radio;
    }
    @Override
    public double perimetro(){
        return 2 * Math.PI * radio;
    }
    
}
////////////
class Triangulo extends Figura{

    private int base;
    private int altura;

    //constructor
    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    //metodos
    @Override
    public double area(){
        return (base * altura) / 2;
    }
    @Override
    public double perimetro(){
       
        double lado = Math.sqrt((altura * altura) +((base/2)*(base/2))); //sqrt es raiz cuadrada
        
        return base + 2*lado;
    }
    
}
