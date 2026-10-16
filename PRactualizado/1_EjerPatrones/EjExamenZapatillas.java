import java.util.ArrayList;
import java.util.Scanner;

public class EjExamenZapatillas {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){

            ArrayList<Zapatilla> zapasTotales = new ArrayList<>();
            //agarramos toda la linea
            String linea = sc.nextLine();
            String[] l = linea.split(" ");

            Zapatilla zapas = new Zapatilla(null, "");

            //creamos el objeto Zapatilla y lo metemos dentro del Array
            for (int j = 0; j < l.length; j++) {
                String aa = l[j];
                
                Integer talla = Integer.valueOf(aa.substring(0,2));
                String lugar = aa.substring(2);

                zapas.setTalla(talla);
                zapas.setPie(lugar);

                
                zapasTotales.add(zapas); //junto con el toString: me imprime el array pero entre [] y con ,

            }

            ArrayList<Zapatilla> salida = new ArrayList<>(); //aqui pondre las zapas impares que encuentre

            //sacamos una zapatilla y vemos si hay su par, si hay se quita sino pues la que saque se cuenta.
            while (!zapasTotales.isEmpty()) { //mientras la lista no este vacia:
                Zapatilla aux  = zapasTotales.get(0); //saco la primera zapatilla
                boolean encontrada = false;
                //comparamos la zapatilla q saque de la lista con el resto de zapatillas de la lista
                for (int i = 1; i < zapasTotales.size(); i++) {//empezamos desde 1 y 
                    if (aux.esPareja(zapasTotales.get(i))){ //ENTENDER ESTA LINEA
                        zapasTotales.remove(i); //primero remuevo la i y luego el 0 porque si fuese alrevez, la i cambia de posicion
                        zapasTotales.remove(0);
                        encontrada = true;
                    }



                }
                if (!encontrada) { //si no encuentro un par para la zapa aux
                    salida.add(aux); //se añade a la otra lista
                    zapasTotales.remove(0); //se elimina esa aux 
                }
                
            }


            System.out.println(zapasTotales);//junto con el toString y el forEach, ya puedo imprimir de la forma q yp quiera (sin [] ni ,)
            for (Zapatilla z : zapasTotales) {
                System.out.print(z+" ");
            }
            System.out.println();
        }
    }
}
class Zapatilla {

    private Integer talla;
    private String pie;
    //constructor
    public Zapatilla(Integer talla, String pie){
        this.talla = talla;
        this.pie = pie;

    }
    //getters y setters necesarios
    public void setTalla(Integer talla) {
        this.talla = talla;
    }
    public void setPie(String pie) {
        this.pie = pie;
    }

    //IMPORTANTE: "Zapatilla z" es una zapatilla que yo meto dentro. Los atributos con this. son la zapatilla de los objetos??
    public Boolean esPareja(Zapatilla z){
        if (this.talla == z.talla && !this.pie.equals(z.pie)) {
            return true;
        }
        return false;
    }

    //para mostrar el objeto: SIEMPRE ES LO MISMO
    public String toString(){
        
        
        return this.talla+this.pie;
    }
}