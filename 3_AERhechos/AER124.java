import java.util.Scanner;

public class AER124 {
    public static String rellenar0(int tamaño, String num){
        int t = 0;
        if (tamaño > num.length()) {
            t = tamaño - num.length();
        }
        for (int i = 0; i < t ; i++) {
            num = "0"+num;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n1 = sc.next(); 
        String n2 = sc.next();

        while(!n1.equals("0") || !n2.equals("0")){
            int acarreo = 0;

            int mayor = Math.max(n2.length(), n1.length());
            n1 = rellenar0(mayor, n1);
            n2 = rellenar0(mayor, n2);

            
            int sumo1 = 0;
            for (int i = mayor-1; i >= 0; i--){
        
                if (((n1.charAt(i)-48) + (n2.charAt(i)-48) +sumo1)>9){//-48 porque es un char
                    acarreo++;
                    sumo1 = 1;
                }else{
                    sumo1 = 0;
                }
            }
            System.out.println(acarreo);
            
            n1 = sc.next();
            n2 = sc.next(); 
        }
    }
}