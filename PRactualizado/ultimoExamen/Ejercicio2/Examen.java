import java.util.ArrayList;

public class Examen {

    private Integer idExamen;
    private String titulo;
    ArrayList<Pregunta> listaP;

    public Examen(Integer idExamen, String titulo) {
        this.idExamen = idExamen;
        this.titulo = titulo;
        this.listaP = new ArrayList<>();
    }
    
    @Override
    public String toString(){
        String s = idExamen+" - "+titulo;
        return s;
    }
    //get y set
    public Integer getIdExamen() {
        return idExamen;
    }
    public void imprimirLista(){
        for (Pregunta pregunta : listaP) {
            System.out.println(pregunta);
        }
    }
    public String getTitulo() {
        return titulo;
    }

}