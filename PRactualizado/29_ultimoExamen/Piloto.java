public class Piloto {
    private String nombre;
    private String sigla;
    private String pais;
    private String marca;

    public Piloto(String nombre, String sigla, String pais, String marca) {
        this.marca = marca;
        this.nombre = nombre;
        this.pais = pais;
        this.sigla = sigla;
    }

    public String getNombre() {
        return nombre;
    }
}
