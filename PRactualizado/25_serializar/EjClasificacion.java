//una impresion  esta serealizada y la otra no. La serealizada esta ordenada con el .sort()
public class EjClasificacion {

    public static void main(String[] args) {
        Clasificacion clasificacion = new Clasificacion();
        clasificacion.addEquipo(new Equipo("Atlético", 57));
        
        clasificacion.addEquipo(new Equipo("Celta", 41));
        clasificacion.addEquipo(new Equipo("Betis", 44));
        clasificacion.addEquipo(new Equipo("R. Madrid", 69));
        clasificacion.addEquipo(new Equipo("Villarreal", 58));
        clasificacion.addEquipo(new Equipo("Barcelona", 73));
        
       

        clasificacion.imprimirClasificacion(); //aqui se imprime

        clasificacion.serializar("clasificacion.dat"); //aqui serealiza
        //Con esto ya valdria pero como yo quiero 
        Clasificacion clasificacionRec = Clasificacion.deserializar("clasificacion.dat"); //aqui deserealiza
/* 
        Clasificacion clasificacionRec = new Clasificacion();
        clasificacionRec =clasificacion.deserializar("clasificacion.dat"); //aqui deserealiza*/
        clasificacionRec.imprimirClasificacion(); //aqui imprime esa deserealizacion

        //la impresion debe ser la misma
    }
}