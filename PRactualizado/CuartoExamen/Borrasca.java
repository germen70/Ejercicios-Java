

public class Borrasca {

    private String nombre;
    private Integer lluvia;
    private Integer viento;
    
    //constructores

    public Borrasca(String nombre) {
        this.nombre = nombre;
        this.lluvia = 0;
        this.viento = 0;
    }

    public Borrasca(String nombre, Integer lluvia, Integer viento) {
        this.nombre = nombre;
        this.lluvia = lluvia;
        this.viento = viento;
    }
    //metodos
    public int alertaLluvia(){
        int v = this.lluvia ;
        int estado = 3;

        if (v < 60) {
            estado =0;
        }
        if (v >= 60 && v <100) {
            estado =1;
        }
        if (v >= 100 && v <180) {
            estado =2;
        }
        
        return estado; //rojo
    }

    public int alertaViento(){
        int v = this.viento ;
        int estado = 3;

        if (v < 70) {
            estado =0;
        }
        if (v >= 70 && v <90) {
            estado =1;
        }
        if (v >= 90 && v <130) {
            estado =2;
        }
        
        return estado; //rojo
    }
    
    public String colores(int a){

        if (a == 1) {
            return "amarillo";
        }
        if (a == 2) {
            return "naranja";
        }
        if (a == 3) {
            return "rojo";
        }
       
        return "verde";

        //otra forma (con el swith) y no hacer tanto ifs
        /* 
        switch (a) {
            case 0: return "verde";
            case 1: return "amarillo";
            case 2: return "naranja";
        }
        return "rojo";
        */
    }
    //imprimir
    
    @Override
    public String toString(){
        int ll = this.alertaLluvia();
        int vi = this.alertaViento();
        
        String a = "Borrasca: "+this.getNombre().toUpperCase();
        String b = "nivel lluvia: "+ this.colores(ll);
        String c = "nivel viento: "+ this.colores(vi);
        String d = "-----------";


        return a+"\n"+b+"\n"+c+"\n"+d+"\n";
    }
    /* MAS OPTIMIZADO Y LIMPIO (sobretodo limpio)
    public String toString(){
        
        return 
        "Borrasca: "+this.getNombre().toUpperCase()+
        "\nnivel lluvia: "+ this.colores(this.alertaLluvia())+
        "\nnivel viento: "+ this.colores(this.alertaViento())+
        "\n-----------";

    }
     */
    //getters y setters
    public String getNombre() {
        return nombre;
    }

    //Segun el ejercicio, habia q crear los GET y SET ¡¡NECESARIOS!! por lo que no hacia falta crear el setNombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getLluvia() {
        return lluvia;
    }

    public void setLluvia(Integer lluvia) {
        this.lluvia = lluvia;
    }

    public Integer getViento() {
        return viento;
    }

    public void setViento(Integer viento) {
        this.viento = viento;
    }

}