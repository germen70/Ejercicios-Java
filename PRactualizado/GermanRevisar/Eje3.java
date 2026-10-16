import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Eje3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            
            String linea = sc.nextLine();
            String[] l = linea.split(" ");
            HashMap<Integer, int[]> zapas = new HashMap<Integer, int[]>();

            for (int j = 0; j < l.length; j++) {//meto en el mapa todas las zapatillas
                String aa = l[j];
                //String talla =  aa.substring(0,2);
                Integer talla = Integer.valueOf(aa.substring(0,2));
                String lugar = aa.substring(2);
                int[] qwe = new int[2];

                if (!zapas.containsKey(talla)){//si no existe esa talla: la creo
                    
                    if (lugar.equals("D")) {//dependiendo si es D o I entrara en la posicion del array
                        
                        qwe[0] = 1;//la posicion 0 es derecha
                    }else{
                        
                        qwe[1] = 1;//la posicion 1 es izquierda
                    }
                    
                }else{//si  existe esa talla: la modifico

                    qwe = zapas.get(talla); //vuelco los valores al array
                    if (lugar.equals("D")) {
                        qwe[0]++; //lo sumo a la derecha
                    } else {
                        qwe[1]++; //lo sumo a la izquierda
                    }
                }
                zapas.put(talla,qwe); //cuando salga del ifelse, se añade al mapa

            }
            int[] ccc = new int[2];
            ArrayList <String> mostrar = new ArrayList<>();//aqui volcare los valores del mapa SOLO si son impares
            
            for (Integer clave : zapas.keySet()) {//recorro el mapa
                int nu = 0;//representa la cantidad de zapatos desiguales que habrá
                String di = "D";
                ccc = zapas.get(clave);//la clave representa la talla y con el .get vuelco el array
                
                if (ccc[0] != ccc[1]) {//si es distinto la cantidad de zapatos del lado derecho y izquierdo
                    if (ccc[0] > ccc[1]) {//derecho mayor que izquierdo
                        nu = ccc[0]-ccc[1];
                        
                    } else {//izquierdo mayor que derecho
                        nu = ccc[1]-ccc[0];
                        di = "I";
                    }

                    for (int i = 0; i < nu; i++) {//dependiendo de la cantidad, se añadirá el valor en el array
                        mostrar.add(clave+""+di);
                    }
                } 
                /* VERSION MEJORADA/OPTIMIZADA? DEL IF de arriba
                nu = ccc[0]-ccc[1];
                if(nu<0){
                    nu = (-1)*nu;
                    di = "I";
                }
                for (int i = 0; i < nu; i++) {//dependiendo de la cantidad, se añadirá el valor en el array
                    mostrar.add(clave+""+di);
                }
                    */
            }

            //muestro el resultado
            int tamaño = mostrar.size();//tamaño del array
            
            if (tamaño ==0) {//si el array no contiene nada significa que todos los zapatos son pares
                System.out.println();
            } else {//si contiene algo significa que hay tallas de zapatos que estan incompletas
                
                //esta parte es para que no haya un " " al final de cada linea al mostrar
                if (tamaño==1) {//si es uno: se imprime normal
                    System.out.println(mostrar.get(tamaño));
                }else{//si es mas de uno
                    for (int ii = 0; ii < tamaño-1; ii++) { //recorremos todo menos el ultimo
                        System.out.print(mostrar.get(ii)+" "); //siempre le ponemos un " "
                    }
                    System.out.println(mostrar.get(tamaño-1));//pero en el ultimo no
                }
            } 
            
            /* VERSION MEJOR PRESENTADA
            if (!mostrar.isEmpty()) {//si no esta vacio: imprimimos lo que haya dentro
            
                if (tamaño==1) {//si es uno: se imprime normal
                    System.out.print(mostrar.get(tamaño));
                }else{//si es distinto de 1
                    for (int ii = 0; ii < tamaño-1; ii++) { //recorremos todo menos el ultimo
                        System.out.print(mostrar.get(ii)+" "); //siempre le ponemos un " "
                    }
                    System.out.print(mostrar.get(tamaño-1));//pero en el ultimo no
                }
            }
            System.out.println();
            */
        }
    }
}