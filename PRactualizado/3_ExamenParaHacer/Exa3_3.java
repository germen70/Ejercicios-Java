/*hecho por si. ESTA BIEN. aaun asi hay que revisar porque tarde mucho en resolverlo
porque no sabia aun como funciona las cadena*/
import java.util.Scanner;

public class Exa3_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos;
        int alumnos;
        int dia;
        int mes;
        int año;

        casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {

            alumnos = sc.nextInt();
            int contador = 0;

            for (int j = 0; j < alumnos; j++) {
                //esto esta bien pero no se si esta optimizada
                String fecha = sc.next();

                String[] fecha2 = fecha.split("/");
                
                dia = Integer.valueOf(fecha2[0]);
                mes = Integer.valueOf(fecha2[1]);
                año = Integer.valueOf(fecha2[2]);
                
                if (dia % 2 != 0) {
                    if (mes % 2 != 0) {
                        if (año % 2 != 0) {
                            contador++;
                        }
                        
                    }
                    
                }
            
            }
            System.out.println(contador);
            
        }

    }
}