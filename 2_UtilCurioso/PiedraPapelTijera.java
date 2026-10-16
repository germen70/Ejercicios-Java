//juego del piedra, papel o tijera
//revisar la forma de leer el while o dowhile (coloca mal las condiciones de salida porque no se como leerlo
import java.util.Scanner;

public class PiedraPapelTijera {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorOrdenador = 0;
        int contadorJugador = 0;
        
        do{ // jugamos hasta que uno de los jugadores consiga 3 puntos
            int ordenador;  //jugador ordenador
            int jugador;    //jugador persona

            ordenador = (int)(Math.random() * 3 + 1);//numero del ordenador
            //imprime el mensaje hasta q el jugador seleccione del 1 al 4
            do{
                System.out.println("\nelige:\n1-piedra\n2-papel\n3-tijera");
                jugador = sc.nextInt();
            }while(jugador <=0 || jugador >=4);
            //muestra lo que a sacado cada uno
            System.out.println("Maquina: "+ordenador+"\nTú: "+jugador);

            if (ordenador == jugador) { //si es empate
                
                System.out.println("empate");
                //si el jugador gana
            } else if(ordenador == 3 && jugador == 1 ||ordenador == 1 && jugador == 2 ||ordenador == 2 && jugador == 3){

                System.out.println("Ganaste");
                contadorJugador++;
            }else{ //si no hay empate, ni yo gano, significa que el ordenador a ganado
                System.out.println("Perdiste");
                contadorOrdenador++;
            }
            //imprime el marcado
            System.out.println("\nMarcador:\nOrdenador: "+contadorOrdenador+"\nJugador: "+contadorJugador);
        }while(contadorJugador < 3 && contadorOrdenador < 3);
        
        //cuando salimos del juego, comparamos la puntuacion y vemos quien ha ganado
        if(contadorJugador > contadorOrdenador){
            System.out.println("FIN DE PARTIDA: GANASTE");
        }else {
            System.out.println("FIN DE PARTIDA: PERDISTE");
        }
        
        
    }
}