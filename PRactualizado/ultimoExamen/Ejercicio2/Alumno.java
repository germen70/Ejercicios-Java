
public class Alumno {

    private int idAlumno;
    private String nombre;

    public Alumno(int idAlumno, String nombre) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
    }

    //toString
    @Override
    public String toString(){
        return (idAlumno+" - "+nombre);
    }
    

}