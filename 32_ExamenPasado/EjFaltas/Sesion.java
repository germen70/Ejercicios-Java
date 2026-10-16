public class Sesion {

    private String idSesion;
    private String modulo;
    //constructor
    public Sesion(String idSesion, String modulo) {
        this.idSesion = idSesion;
        this.modulo = modulo;
    }
    @Override
    public String toString(){
        return idSesion+" - "+modulo;
    }
}