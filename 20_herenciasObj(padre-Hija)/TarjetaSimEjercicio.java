public class TarjetaSimEjercicio {

    public static void main(String[] args) {
        TarjetaSIM t1 = new TarjetaSIM("678112233");
        TarjetaSIM t2 = new TarjetaSIM("644744469");
        TarjetaSIM t3 = new TarjetaSIM("622328909");
        TarjetaSIM t4 = new TarjetaSIM("664739818");
        System.out.println(t1);
        System.out.println(t2);
        t1.llama(t2, 320);
        t1.llama(t3, 200);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
    }
    
}
class TarjetaSIM {

    private String num;
    private int tiempo;

    //constructor
    public TarjetaSIM(String num) {
    this.num = num;
    tiempo = 0;
    }
    //metodos
    public void llama (TarjetaSIM ts, int t){ //como usamos otro objeto, es IMPRESCINDIBLE usar getter y sobretodo setters (porque sobreescribo)
        this.tiempo = this.tiempo+t;
        //ts.tiempo = ts.tiempo + t; esto esta mal porque hay que usar gett y sett
        ts.setTiempo(ts.getTiempo()+t);
    }
    //imprimir
    @Override
    public String toString(){
        return "Num. "+num+" - "+tiempo+"s de conexión";
    }
    
    
    //getters y setters
        //esto no hace falta porque no cambio el numero
    /*
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }*/
    public int getTiempo() {
        return tiempo;
    }
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }


    
}