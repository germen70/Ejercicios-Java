import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Eje2 {

     public static int turno (ArrayList<Integer>lista, int turnoActual) {
        int manolin = lista.get(0);
        Collections.sort(lista);
        //System.out.println((lista));

        int contador = 0;
        boolean contar = true;//cuento hasta  llegar al turno de manolin

        boolean asd = true; //sacar el primer siguiente turno
        int repetir = 0;
        
        for (int i = 0; i < lista.size(); i++) {
            int turno = lista.get(i); //sacamos cada turno para comparar

            if (turno>turnoActual && contar) {//turno es mayor a turnoactual
                
                //if para saber cual es el PRIMER siguiente turno. SOLO se activa 1 vez y guardo su posicion
                if (asd) {
                    asd = false;
                    repetir = i;
                }

                if(manolin==turno){//manolin es el siguiente (caso 0 personas delante)
                    contar = false;
                }else{//si no es el siguiente: añadimos 1 al contador
                    contador++;
                }
            }
        }
        
        for (int i = 0; i < repetir; i++) {//recorro hasta llegar al PRIMER siguiente numero
            int turno = lista.get(i);
            if (manolin>turno) {
                contador++;
            } 
        }
        
        /* VERSION MEJORADA TRAS LA REVISION DEL EXAMEN: esto sustituye al for de arriba
        if (manolin<turnoActual) {
            int aa = lista.indexOf(manolin);
            for (int i = 0; i < aa; i++) {
                
                contador++;   
            }
        }
        */
        
        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();sc.nextLine();
        
        for (int i = 0; i < casos; i++) {
            ArrayList<Integer> turnos = new ArrayList<Integer>();
            int turnoActual = sc.nextInt(); 
            int t = sc.nextInt(); //turno
            while (t != -1) {
                turnos.add(t);

                t = sc.nextInt();
            }
           
            System.out.println(turno(turnos, turnoActual));
        }

    }
}