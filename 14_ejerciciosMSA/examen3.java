
import java.util.Scanner;

public class examen3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();sc.nextLine();
        int tarde = 0;

        for (int i = 0; i < casos; i++) {
           String info = sc.nextLine();
           String[] in = info.split(" |:"); 
           //info.split("x|y") NO CONFUNDIR CON info.split("x"+"y")
           // para separar usando 2 criterios a la vez
           //con esto me ahorro hacer otro String[] para separar las horas y minutos.
           int hora = Integer.valueOf(in[2]); //tambien se puede usar Integer.parseInt(xx[]);
           int minuto = Integer.parseInt(in[3]);

            if (in[1].equals("M")){
                if(hora >= 6 ){
                    tarde++;
                    
                    if(hora == 6 && minuto == 00){
                    tarde--;
                    }
                }  
            }else{
                if (in[1].equals("T")){
                    if(hora >= 14 ){
                        tarde++;

                        if(hora == 14 && minuto == 00){
                        tarde--;
                        }
                    }
                }else{
                    if(hora >= 22 ){
                        tarde++;

                        if(hora == 22 && minuto == 00){
                        tarde--;
                        }
                    }
                }
            }
        }
        System.out.println(tarde);
    }
}