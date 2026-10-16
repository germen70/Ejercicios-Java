import java.util.ArrayList;
import java.util.Collections;

public class EjTiempoCompareTo {

    public static void main(String[] args) {
        
        Tiempo t1 = new Tiempo(1, 20, 30);
        Tiempo t2 = new Tiempo(1, 78, 104);

        System.out.println("mostramos tiempo t1: "+t1);
        System.out.println("mostramos tiempo t2: "+t2);

        //suma con static
        Tiempo t3 = Tiempo.suma2(t1, t2);
        System.out.println("mostramos t3, suma sin static(t1+t2): "+t3);
        
        //suma sin static
        t2.suma(t1);
        System.out.println("mostramos suma con static(t1+t2): "+t2);
        //
        
        Tiempo t4 = new Tiempo(6, 3, 317);
        System.out.println("mostramos tiempo t4: "+t4);
        Tiempo t5 = Tiempo.resta(t2, t4);

        System.out.println("resta t2 - t4: "+t5);

        ArrayList <Tiempo> lista = new ArrayList<>();
        lista.add(t1);
        lista.add(t2);
        lista.add(t3);
        lista.add(t4);
        lista.add(t5);

        ////////////////////////
        System.out.println("Imprimimos lista de los tiempos de forma ordenada");
        Collections.sort(lista); //el .sort funciona porque creamos el compareTo, y los objetos se ordenan segun el criterio q pusimos

        for (Tiempo t : lista) {
            System.out.println(t);
            
        }

    }
}

class Tiempo implements Comparable<Tiempo>{ //PONER ESTO SI QUIERO USAR UN compareTo

    private Integer horas;
    private Integer minutos;
    private Integer segundos;

    public Tiempo() { //constructor por defecto (se le da valores iniciales)
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;        
    }

    public Tiempo(Integer horas, Integer minutos, Integer segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;

        this.simplificar();
    }
    
    //metodos
    //suma version normal (no static)
    public void suma(Tiempo t1){ 

        this.segundos = this.segundos + t1.getSegundos();
            //t1.minutos++;
        this.minutos = this.minutos + t1.getMinutos();
            //t1.horas++;
        this.horas = this.getHoras() + t1.getHoras();

        this.simplificar();

    }
    //suma version static
    public static Tiempo suma2 (Tiempo t1, Tiempo t2){
        Tiempo t = new Tiempo();

        t.setSegundos(t1.getSegundos()+t2.getSegundos());
        t.setMinutos(t1.getMinutos()+t2.getMinutos());
        t.setHoras(t1.getHoras()+t2.getHoras());
        
        t.simplificar();
        return t;
    }

    public static Tiempo resta(Tiempo t1, Tiempo t2){ 
        
        Integer x = t1.getSegundos() + t1.getMinutos() * 60 + t1.getHoras() *3600;
        Integer y = t2.getSegundos() + t2.getMinutos() * 60 + t2.getHoras() *3600;

        //.abs  es convierte en positivo si es negativo el resultado
        Integer z = Math.abs(x-y);
        
        return new Tiempo(0,0,z);


    }

    //privado para simplificar
    private void simplificar (){
        Integer s = segundos + minutos * 60 + horas *3600;

        horas = s /3600; //horas
        minutos = (s%3600)/60; //minutos
        segundos= ((s%3600)%60); //segundos
        
    }
    
    //toString para imprimir
    public String toString(){
        
        return horas+"h "+minutos+"m "+segundos+"s ";
    }
    @Override
    //toCompare para comparar
    public int compareTo (Tiempo a){
        Integer c1 = this.getSegundos() + this.getMinutos() * 60 + this.getHoras() *3600;
        Integer c2 = a.getSegundos() + a.getMinutos() * 60 + a.getHoras() *3600;
        Integer c = c1-c2;

        return c;
    }

    //getters y setters
    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }

    public Integer getSegundos() {
        return segundos;
    }

    public void setSegundos(Integer segundos) {
        this.segundos = segundos;
    }    
}
