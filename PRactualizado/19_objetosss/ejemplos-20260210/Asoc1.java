import java.util.ArrayList;
import java.util.List;

// Clase Estudiante
class Estudiante {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase Profesor
class Profesor {
    private String nombre;
    private List<Estudiante> estudiantes;

    public Profesor(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    // Método para asociar estudiantes al profesor
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    // Mostrar la lista de estudiantes
    public void mostrarEstudiantes() {
        System.out.println("Estudiantes que enseña " + nombre + ":");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getNombre());
        }
    }
}

// Clase principal
public class Asoc1 {
    public static void main(String[] args) {
        // Crear estudiantes
        Estudiante est1 = new Estudiante("Juan");
        Estudiante est2 = new Estudiante("Maria");
        Estudiante est3 = new Estudiante("Pedro");

        // Crear profesor
        Profesor profesor = new Profesor("Dr. Pérez");

        // Asociar estudiantes al profesor
        profesor.agregarEstudiante(est1);
        profesor.agregarEstudiante(est2);
        profesor.agregarEstudiante(est3);

        // Mostrar los estudiantes
        profesor.mostrarEstudiantes();
    }
}