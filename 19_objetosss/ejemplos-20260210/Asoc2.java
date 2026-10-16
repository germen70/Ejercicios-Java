import java.util.HashSet;
import java.util.Set;

// Clase Estudiante
class Estudiante {
    private String nombre;
    private Set<Curso> cursos = new HashSet<>();;

    public Estudiante(String nombre) {
        this.nombre = nombre; 
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void mostrarCursos() {
        System.out.println(this.nombre + " está inscrito en los siguientes cursos:");
        for (Curso curso : cursos) {
            System.out.println(curso.getNombre());
        }
    }
}

// Clase Curso
class Curso {
    private String nombre;
    private Set<Estudiante> estudiantes;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void mostrarEstudiantes() {
        System.out.println("Estudiantes inscritos en el curso " + this.nombre + ":");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getNombre());
        }
    }
}

// Clase principal
public class Asoc2 {
    public static void main(String[] args) {
        // Crear estudiantes
        Estudiante est1 = new Estudiante("Juan");
        Estudiante est2 = new Estudiante("Maria");
        Estudiante est3 = new Estudiante("Pedro");

        // Crear cursos
        Curso curso1 = new Curso("Matemáticas");
        Curso curso2 = new Curso("Historia");
        Curso curso3 = new Curso("Ciencias");

        // Asociar estudiantes a cursos
        est1.agregarCurso(curso1);
        est1.agregarCurso(curso2);
        est2.agregarCurso(curso2);
        est2.agregarCurso(curso3);
        est3.agregarCurso(curso1);
        est3.agregarCurso(curso3);

        // Asociar cursos a estudiantes
        curso1.agregarEstudiante(est1);
        curso1.agregarEstudiante(est3);
        curso2.agregarEstudiante(est1);
        curso2.agregarEstudiante(est2);
        curso3.agregarEstudiante(est2);
        curso3.agregarEstudiante(est3);

        est1.mostrarCursos();
        est2.mostrarCursos();
        est3.mostrarCursos();

        System.out.println();

        curso1.mostrarEstudiantes();
        curso2.mostrarEstudiantes();
        curso3.mostrarEstudiantes();
    }
}