
import java.util.Scanner;

public class examen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fila = sc.nextInt();
        int columnas = sc.nextInt();
        int[][] hotel = new int[fila][columnas]; //matrices: primero filas luego columnas
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columnas; j++) {
                hotel[i][j] = sc.nextInt();
            }
            
        }
        int consulta = sc.nextInt();
        for (int i = 0; i < consulta; i++) {
            int h = sc.nextInt();
            if(hotel[h/100-1][h%100-1] == 0){ //hay q restar 1 porque en nuestra matriz hay hab y planta 0
                System.out.println(h+" LIBRE");
            }else{
                if(hotel[h/100][h%100] == 1){
                System.out.println(h+" RESERVADA");
                }else{
                    System.out.println(h+" OCUPADA");
                }

            }
        }
    }
    
}
