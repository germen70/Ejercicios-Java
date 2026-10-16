import java.util.Scanner;

public class AER337 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        
        
        
        for (int i = 0; i < casos; i++) {
            int[] superior = new int[6];
            int[] inferior = new int[6];
            boolean fallo = false;
            
            for (int j = 0; j < 6; j++) {

                superior[j] = sc.nextInt();
            }
            //sc.nextLine();
            
            for (int j = 0; j < 6; j++) {

                inferior[j] = sc.nextInt();
        
            }
            int comparar = superior[0]+inferior[0];

            for (int j = 1; j < 6; j++) {
                if(superior[j]+inferior[j] != comparar){
                    fallo = true;
                }
                
            }
            if (fallo == true) {
                System.out.println("NO");
            }else{
                System.out.println("SI");
            }
            
        }
    }
}