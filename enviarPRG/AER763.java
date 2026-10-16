import java.util.Scanner;

public class AER763 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int casos = sc.nextInt();sc.nextLine();

       for (int i = 0; i < casos; i++) {
        
        if (sc.nextLine().toLowerCase().equals("colgadas")) {
            System.out.println("Bien");
        }else{
            System.out.println("Mal");
        }
       }
    }
}