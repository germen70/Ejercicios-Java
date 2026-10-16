import java.util.ArrayList;
import java.util.List;

// Clase Libro (parte)
class Libro {
    private String titulo;

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
}

// Clase Biblioteca (todo)
class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibros() {
        System.out.println("Libros en la " + nombre + ":");
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo());
        }
    }
}

// Clase principal
public class Agrega2 {
    public static void main(String[] args) {
        // Crear libros
        Libro libro1 = new Libro("Java para principiantes");
        Libro libro2 = new Libro("Patrones de diseño");

        // Crear biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Mostrar los libros de la biblioteca
        biblioteca.mostrarLibros();
    }
}