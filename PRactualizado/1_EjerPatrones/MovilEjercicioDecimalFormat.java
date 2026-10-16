//en el enunciado esta mal, m2 es 0,50 y no 0,87
//importante aqui uso el decimal format para poner un numero con 2 decimales
import java.text.DecimalFormat;

public class MovilEjercicioDecimalFormat {

    public static void main(String[] args) {
        Movil m1 = new Movil("678112233", "plata");
        Movil m2 = new Movil("644744469", "oro");
        Movil m3 = new Movil("622328909", "platinum");
        System.out.println(m1);
        System.out.println(m2);
        m1.llama(m2, 320);
        m1.llama(m3, 200);
        m2.llama(m3, 550);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        
    }
}
//con el extends hago que la el objeto movil sea hija del objeto TarjetaSIM 
//dato curioso: el objeto esta en el archivo TarjetaSimEjercicio pero el extends funciona
class Movil extends TarjetaSIM{
    private String tarifa;
    private int money;

    //constructor
    public Movil(String num, String tarifa) {
        super(num); //utilizo el constructor del padre
        this.tarifa = tarifa;
        this.money = 0;
    }
    //metodos

    public void llama(Movil ts, int t) { //Movil es una TarjetaSim (hija/padre) por lo que puede usar sus metodos
        super.llama(ts, t); //uso el metodo de la clase padre

        this.money = this.money+ t; //añado el tiempo para el que llama

    }
    public String calculaGasto(){
        //dependiendo de que tarifa tenga, tendrá un precio u otro
        double dinero = 3;
        if (tarifa.equals("plata")) {
            dinero = 10;
        }
        if (tarifa.equals("oro")) {
            dinero = 6;
        }
        //formula para que sea euro/min (tenia centimos y segundos) 
        double pagar = (dinero*((double)money/60))/100;//el double es necesario porque al /60 sale decimal
        DecimalFormat df = new DecimalFormat("0.00"); //!!

        return df.format(pagar);
    }
    //iomprimir
    @Override
    public String toString(){
        return super.toString()+" - "+calculaGasto()+" euros de gasto"; //con el super.toString reutilizo el toString de la clase padre
    }
    //get y set
    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    
}
