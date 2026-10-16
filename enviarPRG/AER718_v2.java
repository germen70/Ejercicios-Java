//se puede hacer tambien con un mapa, pero utilizamos un set q es mas facil
import java.util.Scanner;
import java.util.TreeSet;

public class AER718_v2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        

        while (n != 0) {
            //se puede meter fuera del while pero abria que usar el set.clear() para limpiarlo
            TreeSet<Integer> set = new TreeSet<>(); 
            int pareja = 0;
            for (int i = 0; i < n; i++) {
                int v = sc.nextInt();
                //entener este if. el .add aparte de añadir tambien se comporta como un boolean.
                //si no puede añadir el numero porque ya esta ese numero, te devuelve un bolean false
                //otros comandos te devuelven un error/exception
                if (!set.add(v)){//si entra dentro del if significa que ya existe ese numero dentro de la lista
                    pareja++;//como ya existe ese numero, se suma una pareja a nuestro acumulador
                    set.remove(v);//removemos el numero porque ya tenemos una pareja
                }
            }
            System.out.println(pareja);
            n = sc.nextInt();
        }
    }
}