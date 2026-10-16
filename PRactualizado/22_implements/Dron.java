//ejemplo de implements: para la herencia multiple
interface Volador {

    public abstract void volar();
}

interface Recargable {

    public abstract int recarga();
}
class Vehiculo{
    private String nombre; //lo usaremos para identificar

    
    public Vehiculo(String nombre) {
        this.nombre = nombre;
    }

}
public class Dron extends Vehiculo implements Recargable,Volador{
    public int bateria;

    public Dron(String nombre){
        super(nombre); 
        this.bateria = 0;
    }

    //metodo
    public int recarga(){
        return this.bateria;
    }
    public void volar(){
        System.out.println("Estoy volando");
    }   
}