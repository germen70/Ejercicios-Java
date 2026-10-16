//funcion para contar cuantos digitos tine un int o String
import java.util.Scanner;

public class AER216{

    //tenemos que crear una funcion que se pueda utilizar en este programa:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {
            System.out.println(calcula(sc.nextInt()));
            
        }
    }
    
    //funcion que cuenta cuantos digitos tiene un numero
    public static int cuentaDigitos (int a){
        String numer = String.valueOf(a); //el numero lo convertimos en String
        return numer.length(); //.lenght() te dice cuantos numeros tiene el String (te lo da en digito)
    }

    public static String calcula(int a){
 
        //calculo del tiempo en version sexagesimal
        int h = a /3600; //horas
        int m = (a%3600)/60; //minutos
        int s = ((a%3600)%60); //segundos
        String cadena = "";
        //String cadena = h+":"+m+":"+s;

        if (cuentaDigitos(h)<2){ // si los digitos son menores que 2, añadimos un 0
            cadena = "0"+h+":";
        }else{ //sino, se añade tal cual
            cadena = h+":";
        }
        if (cuentaDigitos(m)<2){ // si los digitos son menores que 2, añadimos un 0
            cadena = cadena+"0"+m+":";
        }else{//sino, se añade tal cual
            cadena = cadena+m+":";
        }
        if (cuentaDigitos(s)<2){// si los digitos son menores que 2, añadimos un 0
            cadena = cadena+"0"+s;
        }else{//sino, se añade tal cual
            cadena = cadena+s;
        }
        return cadena;
    }
}