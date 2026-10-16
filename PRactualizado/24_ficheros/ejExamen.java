import java.util.ArrayList;
import java.util.Scanner;

public class ejExamen{
    public static void main(String[] args) {
        Examen e = new Examen("German");
        PreguntaMultiple multiple = new PreguntaMultiple("¿Cuánto es 2+2-2?", 4);//no valdria con Pregunta?
        multiple.anyadirOpciones("a)2");
        multiple.anyadirOpciones("b)0");
        multiple.anyadirOpciones("c)-2");
        multiple.anyadirOpciones("d)4");
        multiple.anyadirOpciones("e)6"); //esta no deberia de ponerse
        multiple.anyadirRespuestaCorrecta('a');
        e.agregarPregunta(multiple);

        PreguntaVerdaderoFalso VoF = new PreguntaVerdaderoFalso("¿Se puede dividir por 0?");
        VoF.anyadirOpciones("a)SI");
        VoF.anyadirOpciones("b)NO");
        VoF.anyadirRespuestaCorrecta('b');
        e.agregarPregunta(VoF);

        e.realizarExamen();

        System.out.println(e.mostrarResultado());
    }
}
class Examen{
    private String nombre;
    private ArrayList<Pregunta> preguntass;
    private int aciertos;
    //constructor
    public Examen(String nombre){
        this.nombre = nombre;
        preguntass =new ArrayList<>();
        aciertos= 0;
    }
    //metodos
    public void agregarPregunta(Pregunta p){
        preguntass.add(p);
    }
    public void realizarExamen(){
        for (Pregunta pp : preguntass) {
            System.out.println(pp.mostrar());
            System.out.println("Dime una Respuesta");
            Scanner sc = new Scanner(System.in);
            char c = sc.next().charAt(0);
            boolean mal = false;
            if (pp.getOpciones().length > c-97) {
                    mal = true;
                }

            while (mal == false) {
                
                if (pp.getOpciones().length > c-97) {
                    mal = true;
                }else{
                System.out.println("Error, dime una respuesta dentro de las opciones");
                c = sc.next().charAt(0);
                }

            }
            
            if(pp.verificarRespuesta(c)){
                aciertos++;
            }
        }
    }
    public String mostrarResultado(){
        return "Total aciertos: "+aciertos;
    }
}
abstract class Pregunta{
    private String enunciado;
    private String[] opciones;
    private char correcta;
    
    //constructor
    public Pregunta(String enunciado,int cantidadOpciones) {
        this.enunciado = enunciado;
        opciones = new String[cantidadOpciones];
    }
    public Pregunta(String enunciado,int cantidadOpciones, char correcta) {
        this.enunciado = enunciado;
        this.correcta = correcta;
        opciones = new String[cantidadOpciones];
    }
    //metodos
    public abstract boolean verificarRespuesta(char respuesta);

    public abstract String mostrar();

    public void anyadirOpciones(String s){
        boolean salir = false;
        for (int i = 0; i < opciones.length && salir == false; i++) {
            if (opciones[i] ==null) { //valdria si se compara con null?
                opciones[i] = s;
                salir = true;
                //return true;
            }
        }
        //return false; //? 
    }

    //getters y setters
    public void anyadirRespuestaCorrecta(char c){
        correcta = c;
    }
    public String getEnunciado() {
        return enunciado;
    }
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
    public String[] getOpciones() {
        return opciones;
    }
    public void setOpciones(String[] opciones) {
        this.opciones = opciones;
    }
    public char getCorrecta() {
        return correcta;
    }
    public void setCorrecta(char correcta) {
        this.correcta = correcta;
    }

}

class PreguntaMultiple extends Pregunta{
    
    //constructor
    public PreguntaMultiple(String enunciado, int cantidadOpciones){
        super(enunciado, cantidadOpciones);

    }

    //metodos

    @Override
    public boolean verificarRespuesta(char respuesta){
        if (this.getCorrecta() == respuesta) {
            return true;
        }
        //int num = c-97;
        return false;
    }
    @Override
    public String mostrar(){
        String a= this.getEnunciado()+"\n";
        for (int i = 0; i < this.getOpciones().length; i++) {
            a+= this.getOpciones()[i]+"\n";
        }

        return a;
    }
}
class PreguntaVerdaderoFalso extends Pregunta{
    //constructor
    public PreguntaVerdaderoFalso(String enunciado){
        super(enunciado, 2);
        //correcta = 'a';
        //this.setCorrecta('a');
    }
    
    //metodos
    @Override
    public boolean verificarRespuesta(char respuesta){
        if (this.getCorrecta() == respuesta) {
            return true;
        }
        //int num = c-97;
        return false;
    }
    @Override
    public String mostrar(){
        String a= this.getEnunciado()+"\n";
        for (int i = 0; i < this.getOpciones().length; i++) {
            a+= this.getOpciones()[i]+"\n";
        }

        return a;
    }
}