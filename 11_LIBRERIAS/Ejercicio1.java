import Numeros.numeros;

public class Ejercicio1{
    public static void main(String[] args) {

        int a =(int) (Math.random() * 100) + 1;
        int b =(int) (Math.random() * 100) + 1;

        System.out.println(numeros.potencia(a, b));
        System.out.println(numeros.cuentaDigitos(a));
        System.out.println(numeros.volteaNum(a));
        System.out.println(numeros.uneNumeros(a, b));
    }
}