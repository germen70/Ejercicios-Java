import java.util.Scanner;

public class AER216v2{
    
    public static int cuentaDigitos (int a){ //ENTENDER QUE HE HECHO AQUI
        
        String numer = String.valueOf(a);
    
        return numer.length();
        
    }
    //YO HICE ESTO. ESTA MAL PORQUE SIEMPRE ME IMPRIME SIEMPRE UN 0 MAS
    /*public static int cuentaDigitos (int a){
        
        String numer = String.valueOf(a);
        int digit = 0;
        for (int i = 0; i < numer.length(); i++) {
            digit = digit + 1 ; //AQUI ESTABA EL ERROR (yo tenia puesto: digit = digit++) AHORA DEBERIA FUNCIONAR
            
        }
    
        return digit;
        
    } */

    public static String calcula(int a){
        
        int m;
        int s;
        int h;
        h = a /3600;
        m = (a%3600)/60;
        s = ((a%3600)%60);
        String cadena = "";
        //String cadena = h+":"+m+":"+s;

        if (cuentaDigitos(h)<2){
            cadena = "0"+h+":";
        }else{
            cadena = h+":";
        }
        if (cuentaDigitos(m)<2){
            cadena = cadena+"0"+m+":";
        }else{
            cadena = cadena+m+":";
        }
        if (cuentaDigitos(s)<2){
            cadena = cadena+"0"+s;
        }else{
            cadena = cadena+s;
        }
        
        
        return cadena;
    }

    //tenemos que crear una funcion que se pueda utilizar en este programa:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {
            System.out.println(calcula(sc.nextInt()));
            
        }
    }
}