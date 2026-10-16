 
//revisar la forma de leer el while o dowhile (coloca mal las condiciones de salida porque no se como leerlo
import java.util.Scanner;

public class PiedraPapelTijeraLagSpok {

    public static void main(String[] args) {
        
        int contadorOrdenador = 0;
        int contadorJugador = 0;
        do{
            
            //variables definidas
            Scanner sc = new Scanner(System.in);
            int ordenador;
            int jugador;
            int tipo;
            String nombre = "";
            boolean caso = true;
            
            //eleccion del ordenador
            ordenador = (int)(Math.random() * 5 + 1);
            do{
                
                System.out.println("\nElige:\n1-piedra\n2-papel\n3-tijera\n4-Lagarto\n5-Spock");
                jugador = sc.nextInt();
            }while(jugador <=0 || jugador >=6);
            

            tipo = jugador;
            for (int i = 0; i < 2; i++) {

                switch (tipo) {
                    case 1:
                        nombre = "piedra";
                        break;
                    case 2:
                        nombre ="papel";
                        break;
                    case 3:
                        nombre = "tijera";
                        break;
                    case 4:
                        nombre = "lagarto";
                        break;
                    case 5:
                        nombre = "Spock";
                        break;
                    default:
                        break;
                }
                if(caso){
                    System.out.print("Tú elegiste: "+nombre+" ");
                    caso = false;
                }else{
                    System.out.println("----vs----- El ordenador eligió: "+nombre);
                }
                tipo = ordenador;
                
            }
            
            
            if (ordenador == jugador) { //si la elección del jugador y del ordenador son  las mismas significa que hay empate
                
                System.out.println("Empate");
            } else if(jugador == 1 &&  ordenador == 3||jugador == 1 && ordenador == 4 || //piedra gana tijera  y piedra gana lagarto
                jugador == 2 && ordenador == 1 || jugador == 2 && ordenador == 5 ||     //papel gana piedra y papel gana Spock
                jugador == 3 && ordenador == 2 || jugador == 3 && ordenador == 4 ||     //lagartlo gana Spock y lagarto gana papel
                jugador == 4 && ordenador == 5 || jugador == 4 && ordenador == 2 ||     //tijera gana papel y tijera gana a lagarto
                jugador == 5 && ordenador == 3 || jugador == 5 && ordenador == 1){      //Spock gana tijera y Spock gana piedra
                
                System.out.println("Ganaste contra el ordenador");
                contadorJugador++;
            }else{
                //El resto de casos significa que perdiste
                System.out.println("Perdiste contra el ordenador");
                contadorOrdenador++;
            }
            System.out.println("\nOrdenador: "+contadorOrdenador+"\nJugador: "+contadorJugador);
        }while((contadorOrdenador <2) && (contadorJugador <2));

        if(contadorJugador > contadorOrdenador){
            System.out.println("FIN DE PARTIDA: GANASTE");
        }else {
            System.out.println("FIN DE PARTIDA: PERDISTE");
        }
            
        
        
    }
}