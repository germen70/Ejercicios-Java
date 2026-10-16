
class Habitacion { //parte
    private String nombre;

    public Habitacion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Casa { //todo
    private String direccion;
    private Habitacion habitacion;

    public Casa(String direccion) {
        this.direccion = direccion;
    }

    public void agregarHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public void mostrarHabitacion() {
        System.out.println("Casa en " + direccion + " tiene la habitación: " + habitacion.getNombre());
    }
}

// Clase principal
public class Compo1 {
    public static void main(String[] args) {
        // Crear habitación
        Habitacion habitacion1 = new Habitacion("Sala");

        // Crear casa
        Casa casa = new Casa("Calle Ficticia 123");

        // Agregar habitación a la casa
        casa.agregarHabitacion(habitacion1);

        // Mostrar la habitación de la casa
        casa.mostrarHabitacion();
    }
}
