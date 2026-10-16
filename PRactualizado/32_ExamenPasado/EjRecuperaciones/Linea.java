
import java.util.ArrayList;

public class Linea{
    ArrayList<Integer> lista;

    public Linea(String lineass) {

        this.lista = cambio(lineass);
    }
    public ArrayList<Integer> cambio(String lineass){
        ArrayList<Integer> numeros = new ArrayList<>();
        String[] num = lineass.split("-");

        for (int i = 0; i < num.length; i++) {
            numeros.add(Integer.valueOf(num[i]));
        }
        
        return numeros;
    }
    
     @Override
    public String toString(){
        String s = "";
        for (Integer num : lista) {
            s = s+num+" ";
        }
        return s;
    }
}