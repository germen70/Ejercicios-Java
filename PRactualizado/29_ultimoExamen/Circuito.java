public class Circuito {
    
    private Integer num;
    private String nombre;
    private String pais;
    private Integer codigo;
    
    //constructor
    public Circuito() {
    }
    public Circuito(Integer num, String nombre, String pais, Integer codigo) {
        this.num = num;
        this.nombre = nombre;
        this.pais = pais;
        this.codigo = codigo;
    }

    public Integer getNum() {
        return num;
    }
    public String getNombre() {
        return nombre;
    }

}
