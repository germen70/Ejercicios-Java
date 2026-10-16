import java.util.Vector;

public class CreaFiguras {
    public static void main(String[] args) {
        
        Vector<Figura> figuras = new Vector<Figura>();
        figuras.add(new Circulo(10)); // Radio=10
        figuras.add(new Cuadrado(10)); // Lado=10
        figuras.add(new Triangulo(10,5)); // Base=10, Altura=5;
        for (Figura f: figuras){
            System.out.println("Área: "+f.area());
            System.out.println("Perímetro: "+f.perimetro());
        }
    }
}
////////////
class Figura{ //figura es un objeto abstracto y es necesario porque en el programa principal usamos una lista de figuras
    //lo necesito porque yo recorro las figuras y no el triangulo, cuadrado...
    
    //constructor
    public Figura(){

    }
    //metodos
    public double area(){
        return 3.0;
    }

    public double perimetro(){
        return 3.0;
    }
    
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
