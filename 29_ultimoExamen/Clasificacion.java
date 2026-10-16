
import java.util.ArrayList;
import java.util.Collections;

public class Clasificacion {
    ArrayList<PuntuacionPiloto> lista;

    public Clasificacion() {    
        this.lista = new ArrayList<>();
    }
    //metodo
    public void addPuntuacionPiloto(PuntuacionPiloto p){
        
        lista.add(p);
    }
    public void ordenaClasificación(){
        Collections.sort(lista);
    }
     public String imprimirClasificacion(){
        String s ="";
        
        for (int i = 0; i < lista.size()-1; i++) {
            s+=lista.get(i)+"\n";
        }
        s+=lista.getLast();
        return s;
     }
}
