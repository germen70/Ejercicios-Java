//terminado
import java.util.Scanner;

public class AER_750 {
    public static int eliminaCeros(int num){
        char dar;
        String n =String.valueOf(num);
        String limpio ="";

        for (int i = 0; i < n.length(); i++) {
            dar = n.charAt(i);
            if(dar != '0'){
                limpio = limpio+ dar+"";
            }
        }
        return Integer.valueOf(limpio);
    }
    public static int contarCeros(int num){
        
        int zerosTOtal =0;
        while (num/10 >0) {
            if (num%10 ==0) {
                zerosTOtal++;
            }
            num = num/10;
        }
        return zerosTOtal;
    }
    public static int multi(int num){
        String n =String.valueOf(num);
        int limpio = 1;

        for (int i = 0; i < n.length(); i++) {
    
            limpio = limpio * ((n.charAt(i))-48);
        }
        return limpio;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caso = sc.nextInt();

        while (caso != 0) {
            int ceros=0;

            ceros+= contarCeros(caso);
            caso =eliminaCeros(caso);

            while (String.valueOf(caso).length() >1) {
                caso = multi(caso);
                ceros+= contarCeros(caso);
                caso =eliminaCeros(caso);

            }
            System.out.println(caso+""+ceros);
            caso = sc.nextInt();
        }
    }   
}