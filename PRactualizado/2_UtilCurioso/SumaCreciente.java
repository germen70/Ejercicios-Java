/*usa una fómula matemática: sumando una secuencia creciente desde n hasta 1 o 1 hasta n
nTriangulo(nTriangulo+1)/2 → suma de 1+2+...+n, o sea, suma del 1 hasta llegar a n
Multiplicar por 3 → cada triángulo tiene 3 lados. Si fuese cuadrados, seria 4(ojo, 
Esta fórmula se usa cuando la figura no comparten lados entre sí, es decir, están separado
AER371
*/
import java.util.Scanner;
public class SumaCreciente {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int nTriangulo = sc.nextInt();
        int cerillas;
        
        while (nTriangulo != 0) {
            cerillas = 3*(nTriangulo*(nTriangulo+1)/2);
            System.out.println(cerillas);
            
            nTriangulo = sc.nextInt();
        }
    }
}
//ASI SERRIA SIN FORMULA MATEMATICA:
/*
import java.util.Scanner;

public class AER371 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int nTriangulo = sc.nextInt();
        
        while (nTriangulo != 0) {
            
            int suma = 0;
            // Sumar 1 + 2 + ... + nTriangulo
            for (int i = 1; i <= nTriangulo; i++) {
                suma += i;
            }
            
            int cerillas = 3 * suma;  // Cada triángulo usa 3 cerillas
            System.out.println(cerillas);
            
            nTriangulo = sc.nextInt();
        }
    }
}
*/
