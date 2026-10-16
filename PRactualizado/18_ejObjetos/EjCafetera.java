public class EjCafetera {

    public static void main(String[] args) {
        
        Cafetera c1 = new Cafetera();
        Cafetera c2 = new Cafetera(500);
        Cafetera c3 = new Cafetera(100, 200);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("Total cafeteras usadas: "+Cafetera.totalCafetera); // ????

        c2.vaciarCafetera();
        System.out.println("vaciamos del todo: "+c2);
        c2.llenarCafetera();
        System.out.println("llenamos al maximo: "+c2);
        c2.servirTaza(50);
        System.out.println("servimos una taza (50), por lo que nos queda: "+c2);
        c2.agregarCafe(10);
        System.out.println("rellenamos (10): "+c2);

        System.out.println("Total cafeteras usadas: "+Cafetera.totalCafetera); // ????
    }
}

class Cafetera {


    private Integer capacidadMaxima;
    private Integer cantidadActual;
    public static Integer totalCafetera = 0; //se pone public static porque es un elemento que afecta a todos los elementos

    //constructor por defecto: establece la capacidad máxima en 1000 (ml) y la actual en cero(cafetera vacía).
    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
        
        totalCafetera++;
    }
    // Constructor con la capacidad máxima de la cafetera; inicializa la cantidad actual de café igual a la capacidad máxima.
    public Cafetera(Integer capacidadMaxima) {
        this.cantidadActual = capacidadMaxima;
        this.capacidadMaxima = capacidadMaxima;

        totalCafetera++;
    }

    //Constructor con la capacidad máxima y la cantidad actual. Si la cantidad actual es mayor que la capacidad máxima de la cafetera, la ajustará al máximo.
    public Cafetera(Integer capacidadMaxima, Integer cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;

        if (cantidadActual >= capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;
            
        }else{
            this.cantidadActual = cantidadActual;
            
        }
        totalCafetera++;
    }


    //GETTERS Y SETTERS
    public Integer getCapacidadMaxima() {
        return capacidadMaxima;
    }
    public void setCapacidadMaxima(Integer capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    public Integer getCantidadActual() {
        return cantidadActual;
    }
    public void setCantidadActual(Integer cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    //METODOS:
    // hace que la cantidad actual sea igual a la capacidad.
    public void llenarCafetera(){ 
        this.cantidadActual = this.capacidadMaxima;
    }
    //simula la acción de servir una taza con la capacidad indicada.
    //Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
    public void servirTaza(int a){
        
        if (a < cantidadActual) {
           this.cantidadActual = this.cantidadActual - a; 
        }else{
            this.cantidadActual = a;
        }
    }
    // pone la cantidad de café actual en cero.
    public void vaciarCafetera(){
        this.cantidadActual = 0;
    }
    // añade a la cafetera la cantidad de café indicada.
    public int agregarCafe(int c){
        
        if (this.capacidadMaxima < this.cantidadActual + c) { //si al agregar, sobrepasa el limite de la cafetera
            c = this.capacidadMaxima + this.cantidadActual;
            this.cantidadActual = this.capacidadMaxima;
        }else{ //si al agregar, no sobrepasa la cafetera
            this.cantidadActual = this.cantidadActual + c;
        }
        return c ;
    }

    @Override
    public String toString(){
        return ""+cantidadActual+"//"+capacidadMaxima;
    }
}