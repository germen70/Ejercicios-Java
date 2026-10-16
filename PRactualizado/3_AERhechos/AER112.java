import java.util.Scanner;

public class AER112 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double distancia = sc.nextDouble()/1000; //distancia entre puntos
        double velMax = sc.nextDouble();//esto esta en km/h Señal
        double tiempo = sc.nextDouble()/3600;// lo que ha tardado en recorrer
        while (distancia != 0.0 || velMax != 0.0 || tiempo != 0.0) {

            String texto = "ERROR";
            if (distancia > 0 && velMax > 0 && tiempo > 0 ){

                double vr = distancia / tiempo; //vel del coche que analizamos
                //System.out.println(velMax+" "+vr);
                if(velMax >= vr){
                    texto = "OK";

                }else{
                    texto = "MULTA";
                    if (vr >= velMax* 1.2){
                        texto = "PUNTOS";
                    }
                }
            }
            System.out.println(texto);
            distancia = sc.nextDouble()/1000; //esta en metros y lo paso a km
            velMax = sc.nextDouble();//esto esta en km/h
            tiempo = sc.nextDouble()/3600; //esta en segundos y lo paso a h
        }
    }
}