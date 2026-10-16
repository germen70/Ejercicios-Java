/*se usa un  do{}while() y un case. abajo del todo esta el enunciado
Calcula cuanto tiempo ha pasado desde una fecha hasta otra fecha
*/
import java.util.Scanner;

public class TiempoQueHaPasado{
    public static String diass(int dia){
        
        switch (dia) {
            case 1: return "lunes";
                
            case 2: return  "martes";
                
            case 3: return  "miercoles";
                
            case 4: return  "jueves";
                
            case 5: return  "viernes";
                
            case 6: return  "sabado";
                
            default: return  "domingo";       
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int hora1;
        int dia1;
        int hora2;
        int dia2;

        //primer dato
        do {
            System.out.println("Introduce primera hora:");
            System.out.print("día: ");
            dia1 = sc.nextInt();
            System.out.print("hora: ");
            hora1 = sc.nextInt();
        } while (hora1 < 0 || hora1 > 24 && dia1 < 0 || dia1 > 7);
        //segundo dato
        do{
            System.out.println("Introduce segunda hora:");
            System.out.print("día: ");
            dia2 = sc.nextInt();
            System.out.print("hora: ");
            hora2 = sc.nextInt();
        } while (hora2 < 0 || hora2 > 24 && dia2 < 0 || dia2 > 7);

        int total1 = dia1*24 + hora1;
        int total2 = dia2*24 + hora2;
        if(total1<total2){
            int htotales = total2 - total1;

            String dia1txt= diass(dia1);
            String dia2txt= diass(dia2);
            
            System.out.println("Entre las "+hora1+":00h del "+dia1txt+" y las "+hora2+":00h del "+dia2txt+" hay "+htotales+" horas");
            //   System.out.printf("Entre las %d:00h del %d y las %d:00h del %d hay %d horas\n",hora1,dia1txt,hora2,dia2txt,htotales);
        }
    }
}
/*
Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de la
semana. No se tendrán en cuenta los minutos ni los segundos.
El día de la semana se puede pedir como un número (del 1 al 7)
La hora del día se pedirá como un número (del 0 al 23).
Se debe comprobar que el usuario introduce los datos correctamente y que el segundo día
es posterior al primero.
Ejemplo:
Introduce primera hora:
día: 1
hora: 18
Introduce segunda hora:
día: 2
hora: 20
Entre las 18:00h del lunes y las 20:00h del martes hay 26 horas.
 */