//HAY ALGO QUE ESTA MAL. EJERCICIO HECHO POR EL PROFESOR
//el aqui se cambia el arraylist por el hashset. La principal diferencia es que lo que se mete en la lista no es
//repetido (si ya existe en la lista, no se añade)
//El programa no funciona porque en hashset no hay el .ger(), .charat(), etc

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class AER109_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String categoria = sc.nextLine();
        
        while(!categoria.equals("FIN")){ //condicion de salida del programa

            String partido = sc.nextLine();

            HashSet<String> equipos = new HashSet<>();
            ArrayList<String> partidos = new ArrayList<>();

            while (!partido.equals("FIN")) { //condicion de salida de cada caso
                partidos.add(partido);  //guardo cada partido en una lista

                //guardo en otra lista el nombre de los partidos (sin repetir)
                String[] datosPartido = partido.split(" "); 
                //esto es lo que me ahorro si uso un hashset y no un arraylist
                /*if(!equipos.contains(datosPartido[0])){
                    
                }
                if(!equipos.contains(datosPartido[2])){
                    equipos.add(datosPartido[2]);
                }*/
                equipos.add(datosPartido[0]);
                equipos.add(datosPartido[2]);
                partido = sc.nextLine();
            }
            //numero de pratidos jugados de la liga
            int npartidos = partidos.size();
            //numero de partidos de una liga con esos equipos
            int totalPartidos = ((equipos.size()-1) * 2) * (equipos.size()/2); //FORMULA MATEMATICA

            int[] puntos = new int[equipos.size()];  

            for (String p : partidos) { //calcula los puntos de cada equipo
                //extraigo los datos de cada partido
                String[] datos = p.split(" ");
                String equipo1 = datos[0];
                int p1 = Integer.valueOf(datos[1]);
                String equipo2 = datos[2];
                int p2 = Integer.valueOf(datos[3]);
                //averiguo quien es el ganador y el perdedor
                int ganador, perdedor;
                if(p1>p2){
                    ganador = equipos.indexOf(equipo1);
                    perdedor = equipos.indexOf(equipo2);
                    
                }else{
                    ganador = equipos.indexOf(equipo1);
                    perdedor = equipos.indexOf(equipo2);
                }
                //asigno los puntos a cada equipo
                puntos[ganador]+=2;
                puntos[perdedor]+=1;
            }
            //System.out.println(equipos);
            //System.out.println(Arrays.toString(puntos));
            partidos.clear();
            int mayor = 0;
            int posicion = 0;
            boolean empate = false;

            for (int i = 0; i < puntos.length; i++) { //tambien vale el de .size()
                
                if(puntos[i] > mayor){
                    mayor = puntos[i];
                    posicion = i;
                    empate = false;
                }else{
                    if (puntos[i] == mayor){
                        empate = true;
                    }
                }
            }
            if (empate) {
                System.out.print("EMPATE ");
            }else{
                System.out.println(equipos.get(posicion)+" ");
            }
            
            System.out.println(totalPartidos - npartidos);
            
            categoria = sc.nextLine();
        }
    }
}