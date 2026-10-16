import java.util.Scanner;

public class AER155{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        int altura = sc.nextInt();

        while(base >=0 && altura >=0){
        
            System.out.println(altura * 2 + base * 2);

            base = sc.nextInt();
            altura = sc.nextInt();
        }
    }
}