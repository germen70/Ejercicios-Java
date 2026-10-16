
import java.util.ArrayList;
import java.util.Collections;

public class Juego {
    public static void main(String[] args) {
        
    }
}
class Carta{

    private int num;
    private String tipo;

    public Carta(int num, String tipo) {
        this.num = num;
        this.tipo = tipo;
    }
    // get y set
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //imprimir
}
class Baraja{
    private ArrayList<Carta> lista =  new ArrayList<>();

    //constructor
    public Baraja(){
        String [] nom = {"Oros","Copas", "Espadas","Bastos"};
        for (int j = 0; j < nom.length; j++) {

            for (int i = 1; i <= 12; i++) {
                this.lista.add(new Carta(i, nom[j]));
            }
        }
    }
    //metodos
    public void Barajar(){
        
        Collections.shuffle(lista);
    }
    public Carta repartirCarta(){

        Carta aux = lista.getFirst();
        lista.remove(0);
        
        return aux;
    }
}   
class Jugador{

    private ArrayList<Carta> mano =  new ArrayList<>();
    //cosstructor
    public Jugador() {
        
    }
    //metodos

    public void recibeCarta(Baraja bar){
        Carta aux = bar.repartirCarta();
        mano.add(aux);
    }
    public Carta juegaCarta(int num, String tipo){
        int lugar= 0;
        for (Carta carta : mano) {
            if (carta.getNum() == num && carta.getTipo().equals(tipo)) {
                lugar = mano.indexOf(carta);
            }
        }
        Carta aux = mano.get(lugar);
        mano.remove(lugar);
        return aux;
    }
    //get y set   
    public ArrayList<Carta> getMano() {
        return mano;
    }
    public void setMano(ArrayList<Carta> mano) {
        this.mano = mano;
    }
}
///////////////////////////////////////////////////////
/// ME QUEDE AQUI
///////////////////////////////////////////////////////
abstract class JuegoDeCartas{
    public abstract void ganaMano( Carta carta1, Carta carta2);

}
class JuegoX  extends JuegoDeCartas{

    @Override
    public void ganaMano(Carta carta1, Carta carta2){

    }

}