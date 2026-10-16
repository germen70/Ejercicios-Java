public class Alumno {
    static int nnn=0;
    
    private int num=0;
    private String nia;
    private String nombre;
    private int edad;
    //constructor
    public Alumno(String nia, String nombre, int edad) {
        nnn++;
        num= nnn;
        this.nia = nia;
        this.nombre = nombre;
        this.edad = edad;
    }
    public Alumno(int num, String nia, String nombre, int edad) {
        nnn++;
        this.num = num;
        this.nia = nia;
        this.nombre = nombre;
        this.edad = edad;
    }
    @Override
    public String toString(){
        return num+" - "+nombre;
    }
    public int getNum() {
        return num;
    }
}