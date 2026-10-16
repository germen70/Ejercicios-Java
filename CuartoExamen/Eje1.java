//esta mal: lo quise hjacer con un String[] q saltase " "  y ":"
import java.util.Scanner;

public class Eje1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();sc.nextLine();

        for (int i = 0; i < casos; i++) {
            String s = sc.nextLine();
            String[] sss = s.split("[ :]"); //mirar expresiones regulares pra q esto funcione

            int[] aaa = new int[sss.length];
            
            for (int j = 0; j < aaa.length; j++) {
                aaa[i] = Integer.valueOf(sss[i]);
            }
            
            int total1 = aaa[0] + aaa[1]*60 + aaa[2];

            int total2 = aaa[3] + aaa[4]*60;

            if (total1 > total2) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
           
            
        }
    }
}

