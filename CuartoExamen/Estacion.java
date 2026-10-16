//IMPORTANTE PARA SABER DE COMPARE TO CON NUMEROS Y, SINO, LETRASÇ

public class Estacion implements Comparable <Estacion>  {
    private String nombre;
    private Integer temperatura;//USAMOS INTEGER
    private Integer viento;


    //constructor
    public Estacion(String nombre, Integer temperatura, Integer viento) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.viento = viento;
    }

    //compare to
    @Override
    public int compareTo(Estacion es){
        
        //COMO USAMOS INTEGER: tenemos q utilizar .equals 
        //si fuese int podriamos usar ==
        if (this.temperatura.equals(es.temperatura)){ 
            /* SI NECESITASE ORDENAR POR LETRAS Y NO POR NUMEROS USARIA ESTA LINEA
            if (this.temperatura.equals(es.temperatura)){ 

                return this.nombre.compareTo((es.nombre)); //DE MENOR A MAYOR
            }*/
        
            return es.viento - this.viento; //dde mayor a menor
           
        }
        
        return this.temperatura - es.temperatura; // de menor a mayor
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }

    public Integer getViento() {
        return viento;
    }

    public void setViento(Integer viento) {
        this.viento = viento;
    }

}