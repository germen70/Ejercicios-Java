
import java.util.Scanner;

public class AER467 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();sc.nextLine();
        
        for (int i = 0; i < casos; i++) {
            String a = sc.nextLine();
            a = a.toLowerCase();
            String[] ab = a.split(" ");
            if(ab[0].equals(ab[2])){
                System.out.println("TAUTOLOGIA");
            }else{
                System.out.println("NO TAUTOLOGIA");
            }
        }
    }
}
