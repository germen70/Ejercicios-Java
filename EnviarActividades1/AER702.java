//IMPORTANTE: int mes (juntamos 2 char en un string para hacerlo int)
import java.util.Scanner;

public class AER702{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dinero = new int[12];
        int dine = sc.nextInt();
        int casos = sc.nextInt();sc.nextLine();

        for (int i = 0; i < casos; i++) {
            String movimiento = sc.nextLine();
            String[] mov = movimiento.trim().split(" ");
            int mes =Integer.parseInt(mov[0].charAt(3)+""+mov[0].charAt(4));
            int cantidad = Integer.parseInt(mov[1]);
            
            dinero[mes-1] += cantidad;
                
        }
        dinero[0] += dine;
        System.out.print(dinero[0]);
        for (int i = 1; i < dinero.length; i++) {
            dinero[i] = dinero[i-1]+ dinero[i];
            System.out.print(" "+dinero[i]);
        }
        
        
    }
}