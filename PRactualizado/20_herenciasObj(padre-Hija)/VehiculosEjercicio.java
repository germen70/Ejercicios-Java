
//USAMOS EL instanceof para, de una lista de clase, solo utilicemos los objetos en concreto
import java.util.ArrayList;
import java.util.Scanner;

public class VehiculosEjercicio {
    static Scanner sc = new Scanner(System.in); //con esto puedo usar el Scanner en todo (tanto en el main como en la funcion) ES GLOBAL

    public static int menu (){
        
        try {
            System.out.println("VEHÍCULOS\n" + 
                        "=========\n" + 
                        "1. Anda en bicicleta\n" + 
                        "2. Anda en coche\n" + 
                        "3. Ver kilometraje de la bicicleta\n" + 
                        "4. Ver kilometraje del coche\n" + 
                        "5. Ver kilometraje total\n" + 
                        "6. Ver vehículos totales\n" + 
                        "7. Salir\n" + 
                        "Elige una opción (1-7):");
            return sc.nextInt();
            
        } catch (Exception e) {//para cuando inserten una letra 
            return 0;
        }
    }
    
    public static void main(String[] args) {
        
        ArrayList<Vehiculo> lista = new ArrayList<>();
        lista.add(new Bicicleta("Bike")); //construyo un vehiculo y lo guardo en la lista
        lista.add(new Coche("Jeepeta"));
        lista.add(new Bicicleta("ccc"));
        lista.add(new Coche("CitroenSara"));
        //Vehiculo v4 = new Coche("ddd");
/* 
        lista.get(0).andar(5);
        lista.get(1).andar(10);
        lista.get(2).andar(15);
        lista.get(3).andar(20);

        ////////////////////////// 
        
        int kmBici = 0;
        
        for (Vehiculo vehiculo : lista) {
            if (vehiculo instanceof Bicicleta) {//
                //kmBici +=vehiculo.getKilometrosRecorridos();
                
            }
            System.out.println(vehiculo.getKilometrosRecorridos());
        }
   
        //2 formas de hacer
        System.out.println("Kilometraje total de la bici usando instanceof: "+kmBici);
        System.out.println("Kilometraje total de la bici usando atributo static (atributo de clase): "+ Bicicleta.kilometrosBicis);

        //System.out.println("Kilometraje total del coche: "+v2.getKilometrosRecorridos());

        System.out.println("Kilometraje total de mis vehiculos: "+Vehiculo.kilometrosTotales);

        System.out.println("Total de vehiculoos creados: "+Vehiculo.vehiculosCreados);
        //////////////////////// 
        */
        
        int opción = 0;

        do {
            
            opción = menu();
            
            switch (opción) {
                case 1: 
                    System.out.println("Elige la bici: ");
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i) instanceof Bicicleta) {
                            System.out.println(i+ " - "+ lista.get(i).getNombre());
                        }
                    }
                    int n1 = sc.nextInt();
                    System.out.println("Introduce km: ");
                    int km1 = sc.nextInt();
                    lista.get(n1).andar(km1);
                    break;
                case 2:
                    System.out.println("Elige el coche: ");
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i) instanceof Coche) {
                            System.out.println(i+ " - "+ lista.get(i).getNombre());
                        }
                    }
                    int m1 = sc.nextInt();
                    System.out.println("Introduce km: ");
                    int km2 = sc.nextInt();
                    lista.get(m1).andar(km2);
                    break;
                case 3:
                    System.out.println("km totales de las bicis: "+Bicicleta.kilometrosBicis);
                    System.out.println("Elige una bici para saber sus km: ");
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i) instanceof Bicicleta) {
                            System.out.println(i+ " - "+ lista.get(i).getNombre());
                        }
                    }
                    int n2 = sc.nextInt();
                    System.out.println("km de la bici "+lista.get(n2).getNombre()+": "+ lista.get(n2).getKilometrosRecorridos());
                    break;
                case 4:
                    System.out.println("km totales del coche: "+Coche.kilometrosCoche);
                    System.out.println("Elige un coche para saber sus km: ");
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i) instanceof Coche) {
                            System.out.println(i+ " - "+ lista.get(i).getNombre());
                        }
                    }
                    int m2 = sc.nextInt();
                    System.out.println("km del coche "+lista.get(m2).getNombre()+": "+ lista.get(m2).getKilometrosRecorridos());
                    break;
                case 5:
                    System.out.println(Vehiculo.kilometrosTotales);
                    break;
                case 6:
                    System.out.println(Vehiculo.vehiculosCreados);
                default:
                
            }
        } while (opción != 7);

    }
}
//Cuando se refiere a clase, hace referencia a TODOS los objetos (no es un objeto sino una clase)
//Cuando se refiere a un objeto, hace referecia a ESE objeto en concreto (no es una clase sino una objeto)
 class Vehiculo{
    private String nombre; //lo usaremos para identificar
    private int kilometrosRecorridos;
    public static int vehiculosCreados = 0; //atributos de clase (no de objeto) (static)
    public static int kilometrosTotales = 0; //como son publicos no hace falta crear get y set de estos. Vale con directamente llamarlos
    
    public Vehiculo(String nombre) {
        this.nombre = nombre;
        kilometrosRecorridos = 0;
        Vehiculo.vehiculosCreados++; //al ser atributo de clase hay que ponerlo asi para modificar (es static)
        
        kilometrosTotales = 0;
        
    }

    //metodo
    public void andar (int km){
        kilometrosRecorridos += km;
        Vehiculo.kilometrosTotales += km;
    }
    
    //get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }
   
    
}

class Bicicleta extends Vehiculo{
    public static int kilometrosBicis = 0;//atributo solo de la clase bicicleta
    
    //constructor
    public Bicicleta(String n) {
        super(n);
    }
    //metodo
    @Override
    public void andar (int km){
        super.andar(km);
        Bicicleta.kilometrosBicis += km;
        
    }
}
class Coche extends Vehiculo{
    public static int kilometrosCoche = 0;//atributo solo de la clase bicicleta

    //constructor
    public Coche(String nombre) {
        super(nombre);
    }
    //metodo
    @Override
    public void andar (int km){
        super.andar(km);
        Coche.kilometrosCoche += km;
        
    }
    
    //get y set


}
