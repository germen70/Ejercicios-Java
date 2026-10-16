import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class dina2{
    public static void main(String[] args) {
        
        ArrayList<String> listaS = new ArrayList<>();
        
        Collections.sort(listaS,Collections.reverseOrder()); //te lo ordena de forma inversa
        //remove puede borrar tanto el indice como el objeto ""
        listaS.remove("jueves");
        listaS.remove(2); 

        Collections.sort(listaS);  //ordena la lista
        System.out.println(listaS.toString()); // //para visualizar la lista:
        
    }
}