import java.util.Scanner;

public class AER149 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		while (sc.hasNext()){
            int toros = sc.nextInt();
            int velToro = sc.nextInt();
            for (int i = 1; i < toros; i++) {

                velToro = Math.max(velToro, sc.nextInt());

            }
            System.out.println(velToro);
		}
	}	
}