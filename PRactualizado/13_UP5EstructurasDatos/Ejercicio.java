/* IMPORTANTE REPASAR
crea un progama con funciones que permita generar 10 mun aleatorios
 * y guardarlos en un array y calcular la media*/

import java.util.Scanner;

public class Ejercicio {
    //genera array del tamaño que yo le diga y añade numeros aleatorios
    public static int[] generaArray (int tamanyo){
        int[] num = new int[tamanyo];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random()*10+1);
        }
    
        return num;
    }
    public static double media (int[] a){
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma = suma + a[i];
        }
        double media = (double)suma / a.length; 

        return media;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el tamaño");//meter un try cath para cuando no me metan numeros

        int[] num = generaArray(sc.nextInt());
        
        System.out.println(String.valueOf(num)); //Esto esta mal. ver como mostrar los valores
        System.out.println(media(num));
        System.out.printf("%.2f\n10",media(num));
        /* media sin funcion
        int suma = 0;
        for (int i = 0; i < num.length; i++) {
            suma = suma+num[i];

        }
        double media = (double)suma / array.length;

        System.out.println(media);*/

 
    }
}