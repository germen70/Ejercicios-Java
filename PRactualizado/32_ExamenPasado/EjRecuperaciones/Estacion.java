public class Estacion {
    private String nombre;

    public Estacion(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString(){
        return nombre;
    }
    public String getNombre() {
        return nombre;
    }
}
