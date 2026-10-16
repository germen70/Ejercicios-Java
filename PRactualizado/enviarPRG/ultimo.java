import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ultimo {
    public static ArrayList<Integer> divisores (int n){
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1); //se añade el numero 1 poque todo numero dividido por 1, el resto da 0
        
        //empezamos por el numero 2 y solo cantamos hasta n/2 porque >n/2 siempre da decimal.
        for (int i = 2; i <= n/2; i++) { 
            if(n % i == 0){
                lista.add(i);
            }
            
        }
        
        return lista;

    }
    public static long sumaLista (ArrayList<Integer> lista){
        long suma = 0;
        for (Integer valor : lista) { //con este for recoremos todos los elementos de la suma
            suma += valor;
        }
        return suma;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        long suma1 = sumaLista(divisores(n1));
        long suma2 = sumaLista(divisores(n2));
        if(suma1 == n2 && suma2 == n1){
            System.out.printf("%d y %d son amigos\n",n1,n2);
        }else{
            System.out.printf("%d y %d no son amigos\n",n1,n2);
        }


    }
}