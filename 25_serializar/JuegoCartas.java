public class JuegoCartas {

    public static void main(String[] args) {
        
    }
}
class Carta{
    private int numero;
    private String signo;
    
    //constructor
    public Carta(int numero, String signo) {
        this.numero = numero;
        this.signo = signo;
    }
    public String toString(){
        return numero+" "+signo;
    }
    
}
class Baraja{

}
class Jugador{

}

abstract class JuegoDeCartas{

}
class JuegoCartaMayor extends JuegoCartas{

}