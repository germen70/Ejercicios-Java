import java.util.Scanner;

public class AER427 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int casos;
        String a;
        String b;

        casos = sc.nextInt(); sc.nextLine();
        
        for (int i = 0; i < casos; i++) {
           
            a = sc.nextLine();
            b = sc.nextLine();

            if (a.equals("Luke") && b.equals("padre")){
                System.out.println("TOP SECRET"); 
            
            }else{
                System.out.println(a+", yo soy tu "+b);
            }

            
        } 

    }
}