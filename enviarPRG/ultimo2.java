//mapas teoria
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ultimo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> numeros = new HashMap <>();
        // SIEMPRE ES : clave, valor
        HashMap<Integer, String> dias = new HashMap <>();
        dias.put(1,"Lunes"); //primero el numero luego el nombre
        dias.put(2,"Martes");
        dias.put(3,"Miércoles");
        dias.put(4,"Jueves");
        dias.put(5,"Viernes");
        dias.put(6,"Sabado");
        dias.put(7,"Domingo");

        numeros.put("uno",1);
        numeros.put("dos",2);
        numeros.put("tres",3);
        numeros.put("cuatro",4);

        System.out.println(dias.size());
        System.out.println(numeros.size());

        System.out.println(dias.get("Jueves")); //dará null porque con el .get hay que dar la clave
        System.out.println(dias.get(6)); //dará null porque no hay ninguna entrada que con el numero

        if(numeros.containsKey("cinco")){ //el .containsKey es un bolean pra ver si existe o no
            System.out.println("El cinco existe");
        }else{
            System.out.println("NO existe ");
        }
        if(numeros.containsValue(5)){ //el .containsValue es un bolean pra ver si existe o no
            System.out.println("El cinco existe");
        }else{
            System.out.println("NO existe ");
        }
        //nos imprime todos los valores
        for (Integer d : dias.keySet()) { //.keyset es un integer osea un valor
            System.out.println(dias.get(d));
            
        }
        int i = 5;
        //cambia los valores de un mapa y con los valores de otro mapa
        for (Map.Entry<Integer,String>  d : numeros.entrySet()) { //.keyset es un integer osea un valor
            d.setValue(0); //añade un 0 
            d.setValue(i--); //añade valores descendentes (5,4,3,2,1)
            
        }

    }
}