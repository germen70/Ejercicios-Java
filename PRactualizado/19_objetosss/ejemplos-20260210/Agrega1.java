import java.util.ArrayList;
import java.util.List;

// Clase Estudiante (parte)
class Estudiante {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase Escuela (todo)
class Escuela {
    private String nombre;
    private List<Estudiante> estudiantes;

    public Escuela(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void mostrarEstudiantes() {
        System.out.println("Estudiantes en " + nombre + ":");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getNombre());
        }
    }
}

// Clase principal
public class Agrega1 {
    public static void main(String[] args) {
        // Crear estudiantes
        Estudiante est1 = new Estudiante("Juan");
        Estudiante est2 = new Estudiante("Maria");

        // Crear escuela
        Escuela escuela = new Escuela("Escuela Primaria");

        // Agregar estudiantes a la escuela
        escuela.agregarEstudiante(est1);
        escuela.agregarEstudiante(est2);

        // Mostrar los estudiantes de la escuela
        escuela.mostrarEstudiantes();
    }
}
