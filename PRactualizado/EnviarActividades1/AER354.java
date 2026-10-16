//IMPORTANTE: se usa Math.max( , ); que sirve para comparar cual es el valor mas alto
import java.util.Scanner;

public class AER354 {

    public static int cuantosNinos(int[] a){
        int numN = 1;
        int alturamin = a[0];
        int maximo = a[0];

        for (int i = 1; i < a.length; i++) {
            if (alturamin>=a[i]) {
                numN= i+1;
                alturamin =maximo;
            }else{
                maximo = Math.max(maximo,a[i]);
            }

        }

        
        return numN;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int casos = sc.nextInt();

    while(casos != 0){
        int[] altura = new int[casos];

        for (int i = 0; i < casos; i++) {
            altura[i] = sc.nextInt();
        }
        
        int numNinos = cuantosNinos(altura);
        System.out.println(numNinos);
        casos = sc.nextInt();
    }   
    }
}