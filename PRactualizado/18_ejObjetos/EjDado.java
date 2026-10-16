import java.util.Scanner;

public class EjDado {

    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        System.out.println("tiramos un dado normal");

        Dado d1 = new Dado();


        Dado d2 = new Dado(7);

        Dado d3 = new Dado(10,7);


        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        d2.tirarDado(); //esto simula el tirar un dado
        d3.tirarDado();
        
        System.out.println(d2);
        System.out.println(d3);
    }
}
class Dado {

    Integer valor =1;

    Integer caras = 6;


    public Dado() {
        this.valor = (int)(Math.random() * caras+ 1);
    }

    //dado normal
    public Dado(Integer valor) {
        if (valor <= 6 || valor >= 1) {
    
            this.valor = valor;
        }
    }

    //dado caras x
    public Dado(Integer valor, Integer caras) {
        if (valor > caras ) { //este if es por si el valor es menor al dado
    
            this.valor = caras;
        }else{
            this.valor = valor;
        }

        
    }

    //esto simula el tirar dado, cuando lo uso cmabia el valor

    public void tirarDado (){
        this.valor = (int)(Math.random() * caras+ 1);
    }
    
    //PARA IMPRIMIR
    public String toString() {
        
        return "---\n "+this.valor+"\n---";
    }

//getters y setters
    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Integer getCaras() {
        return caras;
    }

    public void setCaras(Integer caras) {
        this.caras = caras;
    }
    
}