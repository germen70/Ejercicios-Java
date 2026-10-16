public class EJPlaneta {

    public static void main(String[] args) {
        Planeta p1 = new Planeta("Marte", 300000L, 22317.23);
        Planeta p2 = new Planeta("Tierra", 3000000L, 24800.45);

        Satelite s1 = new Satelite("Deilos", p1, 120000);
        Satelite s2 = new Satelite("Luna", p2, 150000);
        Satelite s3 = new Satelite("aaa", p1, 100000);

        System.out.println(s1.orbitaPlanet(p1)); //el planeta que orbita este satelite ES IGUAL al planeta con el q pregunto 
        System.out.println(s2.orbitaPlanet(p1));

        System.out.println("Numero de satelites q tiene x planeta: "+p1.getNumSatelites());
        System.out.println("Numero de satelites q tiene x planeta: "+p2.getNumSatelites());
    }
}
class Planeta {
    private String nombre;
    private Long masa;
    private Double diametro;
    protected Integer numSatelites; //protected
    
    //constructores
    public Planeta(String nombre, Long masa, Double diametro) {
        this.nombre = nombre;
        this.masa = masa;
        this.diametro = diametro;
        numSatelites = 0; //cuando se construye el planeta, damos valor inicial (queda mas elegante asi)
    }

    //getters y setters
    //solo sacamos el get y no el set de numSatelites
    public Integer getNumSatelites() {
        return numSatelites;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Long getMasa() {
        return masa;
    }
    public void setMasa(Long masa) {
        this.masa = masa;
    }
    public Double getDiametro() {
        return diametro;
    }
    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }
}
class Satelite {

    private String nombre;
    private Planeta planetaOrbita;
    private Integer distancia;

    //constructores
    public Satelite(String nombre, Planeta planetaOrbita, Integer distancia) {
        this.nombre = nombre;
        this.planetaOrbita = planetaOrbita;
        this.distancia = distancia;
        this.planetaOrbita.numSatelites++;
        //si usasemos private y get y set se tendria q poner esta linea:
        //this.planetaOrbita.setNumSatelites(this.planetaOrbita.getNumSatelites()+1);

    }

    //METODOS
    //Saber si orbita un planeta
    public boolean orbitaPlanet(Planeta p){
        if (this.planetaOrbita.equals(p)) {
            
            return true;
        }
        return false;

        //SIMPLIFICADO (esto equivale a lo de arriba): return this.planetaOrbita.equals(p);
    }
    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Planeta getPlanetaOrbita() {
        return planetaOrbita;
    }
    public void setPlanetaOrbita(Planeta planetaOrbita) {
        this.planetaOrbita = planetaOrbita;
    }
    public Integer getDistancia() {
        return distancia;
    }
    public void setDistancia(Integer distancia) {
        this.distancia = distancia;
    }
}
