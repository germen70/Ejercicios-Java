public class EjIncidencias {

    public static void main(String[] args) {
        Incidencia inc1 = new Incidencia(105, "No tiene acceso a internet");
        Incidencia inc2 = new Incidencia(14, "No arranca");
        Incidencia inc3 = new Incidencia(5, "La pantalla se ve rosa");
        Incidencia inc4 = new Incidencia(237, "Hace un ruido extraño");
        Incidencia inc5 = new Incidencia(111, "Se cuelga al abrir 3 ventanas");
        inc2.resuelve("El equipo no estaba enchufado");
        inc3.resuelve("Cambio del cable VGA");
        System.out.println(inc1);
        System.out.println(inc2);
        System.out.println(inc3);
        System.out.println(inc4);
        System.out.println(inc5);
        System.out.println("Incidencias pendientes: " + Incidencia.getPendientes());
    }
}

class Incidencia {
   
    static private Integer num = 0; // o public static

    private Integer codigo; //no haria falta crear el set del codigo porque nunca lo necesitaremos modificar
    private String estado;
    private String antes; //incidencia
    private Integer puesto; 
    private String despues; //resuelve

    static private Integer pendientes = 0; //el atributo es privado por lo que tengo q crear el set de este atributo. SI fuera publico, con el get sobra
    
    //constructor
    public Incidencia(Integer puesto, String antes) {
        this.num++;
        this.codigo = this.num;
        this.puesto = puesto;
        this.antes = antes;
        this.estado = "pendiente";
        if (estado.equals("pendiente")) {
            pendientes++;
        }
    }
    
    //metodo 
    public void resuelve(String despues){
        this.despues = despues;
        this.estado ="resuelta";
        Incidencia.pendientes--;
        //this.pendientes--;  ESto funciona pero sale subrallado en amarillo (mirar el atributo num)

    }
    
    //imprimir
    @Override
    public String toString(){
        if (this.estado.equals("pendiente")) {
            return "Incidencia "+this.codigo+" - Puesto: "+this.puesto+" - "+this.antes+" - "+this.estado.substring(0,1).toUpperCase()+this.estado.substring(1);
        }
        return "Incidencia "+this.codigo+" - Puesto: "+this.puesto+" - "+this.antes+" - "+this.estado.substring(0,1).toUpperCase() +this.estado.substring(1)+" - "+this.despues;
    }
    
    //getters y setters

    public static Integer getPendientes() {
        return pendientes;
    }

    public static void setNum(Integer num) {
        Incidencia.num = num;
    }

}