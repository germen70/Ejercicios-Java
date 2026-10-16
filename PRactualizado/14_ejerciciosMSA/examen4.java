
import java.util.Scanner;

public class examen4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posicion = 0;
        while (sc.hasNext()) {
            
            int planta = sc.nextInt();
            int subo = 0;
            int bajo = 0;
            if(posicion < planta){
                subo = planta - posicion;
                System.out.println("Subiendo "+subo);
            }else{
                bajo = posicion - planta;
                System.out.println("Bajando "+bajo);
            }
            posicion = planta;

            
        }
    }
}
