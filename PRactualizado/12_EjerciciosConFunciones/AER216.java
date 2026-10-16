import java.util.Scanner;

public class AER216{

    public static String calcula(int a){
        
        int m;
        int s;
        int h;
        h = a /3600;
        m = (a%3600)/60;
        s = ((a%3600)%60);
        String cadena = "";
        //String cadena = h+":"+m+":"+s;

        if (h<10){
            cadena = "0"+h+":";
        }else{
            cadena = h+":";
        }
        if (m<10){
            cadena = cadena+"0"+m+":";
        }else{
            cadena = cadena+m+":";
        }
        if (s<10){
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