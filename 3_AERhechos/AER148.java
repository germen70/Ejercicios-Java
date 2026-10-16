import java.util.Scanner;

public class AER148 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String tiempo = sc.nextLine();
        while (!tiempo.equals("00:00")) {

            String[] partes = tiempo.split(":");

            int totalminutos = (Integer.valueOf(partes [0])*60)+Integer.valueOf(partes[1]); // horas + minutos
                
            System.out.println(1440-totalminutos); //1440 son 24h pasado a minutos
            
            
            tiempo = sc.nextLine();
        }
    }
} 