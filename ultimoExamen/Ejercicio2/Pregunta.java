
public class Pregunta {

    private int nPregunta;
    private int idExamen;
    private String nomPregunta;

    public Pregunta(int nPregunta, int idExamen, String nomPregunta) {
        this.nPregunta = nPregunta;
        this.idExamen = idExamen;
        this.nomPregunta = nomPregunta;
    }
    @Override
    public String toString(){
        return (nPregunta+" - "+nomPregunta);
    }

    public int getIdExamen() {
        return idExamen;
    }
}