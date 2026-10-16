import java.util.ArrayList;

public class EjLocker{
    public static void main(String[] args) {
        Locker look = new Locker(1, "VLC", "lck.LS", 3, 4, 5);
        //100 30 10
        Paquete p1 = new Paquete("P1", 45);//grande1
        Paquete p2 = new Paquete("P2", 20);//mediano1
        Paquete p3 = new Paquete("P3", 12);//mediano2
        Paquete p4 = new Paquete("P4", 4);//pequeño1
        Paquete p5 = new Paquete("P5", 8);//pequeño2
        Paquete p6 = new Paquete("P6", 30);//mediano1
        look.asignarCOmpartimento(p1);
        look.asignarCOmpartimento(p2);
        look.asignarCOmpartimento(p3);
        look.asignarCOmpartimento(p4);
        look.asignarCOmpartimento(p5);
        look.asignarCOmpartimento(p6);
        //ESTE for me imprime el tamaño del array que creee
        for (Compartimento p : look.grande) {
            System.out.println(p);
        }
        for (Compartimento p : look.mediano) {
            System.out.println(p);
        }
        for (Compartimento p : look.peque) {
            System.out.println(p);
        }


    }
}
class Locker {
    private Integer codigoLock;
    private String direccion;
    private String empresa;
    public ArrayList<Compartimento>  grande; //con un array tendria mas sentino ya que en el constructor pregunto el tamaño que tendra. Aun asi esto tambien es valido
    public ArrayList<Compartimento>  mediano;
    public ArrayList<Compartimento>  peque;
    
    //constructor
    public Locker() {
        codigoLock = 1000;
        direccion = "";
        empresa = "";
        grande = new ArrayList<>();
        mediano = new ArrayList<>();
        peque = new ArrayList<>();

    }
    public Locker(Integer codigoLock, String direccion, String empresa, int nGrandes, int nMediano, int nPeque) {
        
        this.codigoLock = codigoLock;
        this.direccion = direccion;
        this.empresa = empresa;
        grande = new ArrayList<>();
        mediano = new ArrayList<>();
        peque = new ArrayList<>();
        //grande = new ArrayList<>(nGrandes);
        for (int i = 0; i < nGrandes; i++) {
            grande.add(new CompGrande());
        }
        for (int i = 0; i < nMediano; i++) {
            mediano.add(new CompMediano());
        }
        for (int i = 0; i < nPeque; i++) {
            peque.add(new CompPequenyo());
        }

    }
    public int meterEnCompartimento(Paquete p, ArrayList<Compartimento>  c){
        
        for (Compartimento elemento : c) {
            if (elemento.paquete == null) {
                String s = elemento.ponerPaquete(p);
                System.out.println(s); //imprime la etiqueta
                return 1;
            }
        }
        return 0;
    }
    public boolean asignarCOmpartimento(Paquete p){
        if (p != null) {
            if (p.getTamanyo() >100) { //si sobrepasa los 3 tamños de mi compartimento
                System.out.println("TAMAÑO DEMASIADO GRANDE");
                return false;
            }
            //al ser mayor de 30, solo entra en el grande
            if (p.getTamanyo() >30) { 

                if (meterEnCompartimento(p, grande) ==1) {
                    return true;
                }
                
            }
            //al ser mayor que 5, entra en el mediano y grande
            if (p.getTamanyo() >10) {
                
                if (meterEnCompartimento(p, mediano) ==1) {
                    return true;
                }
                if (meterEnCompartimento(p, grande) ==1) {
                    return true;
                }
                
            }
            //es tan pequeño que entra en los 3 locker
            for (Compartimento c : peque) {
                if (c.paquete == null) {
                    String s = c.ponerPaquete(p);
                    System.out.println(s); //imprime la etiqueta
                    return true;
                }
            }
            for (Compartimento c : mediano) {
                if (c.paquete == null) {
                    String s = c.ponerPaquete(p);
                    System.out.println(s); //imprime la etiqueta
                    return true;
                }
            }
            for (Compartimento c : grande) {
                if (c.paquete == null) {
                    String s = c.ponerPaquete(p);
                    System.out.println(s); //imprime la etiqueta
                    return true;
                }
            }
            
        }
        return false;//si el locker esta lleno del todo
    }
    
    
}
abstract class Compartimento {
    protected int capacidad; //pongo protected porque en CompGrande modifico estos datos. Valddria con private pero habria que poner get y set
    protected String codigoComp;
    protected Paquete paquete; // lo mismo aqui. tengo un metodo abstracto(si o si tengo que crearlo en mi hija). en mi hija modifico este atributo.
    
    public Compartimento() {
    
    }
    public abstract String ponerPaquete(Paquete p);//metodo abstracto. Ponemos un paquete

    public Paquete retirarPaquete(Paquete p){//metodo normal. Retiramos un paquete
        //importante saber esta logica. Creo una copia del paquete, pongo el p a null y devuelvo aux. ESTO HARA QUE YO DEVUELVA EL PAQUETE
        // Y VACIE MI PAQUETE. si fuese null(no habia nada dentro) pues tambien valdria
        Paquete aux = p;
        p = null;
        return aux;
    }
    public String toString(){
        return ""+capacidad;
    }

}
class CompGrande extends Compartimento {
    private static int numG = 1;
    private String color = " SIN COLOR " ;
    
    public CompGrande (){
        capacidad = 100;
        codigoComp = "G"+numG;
        numG++;
    }
    
    public String ponerPaquete(Paquete p){
        
        this.paquete = p;
        return codigoComp;
    

    }
    public String toString(){ //ojo a esto: llamo a un metodo de mi super para utilizarmo en un metodo del hijo
        return super.toString()+color+numG;
    }

    
}
class CompMediano extends Compartimento {
    private static int numM = 1;
    private String color =" CON COLOR ";
    
    public CompMediano (){
        capacidad = 30;
        codigoComp = "M"+numM;
        numM++;
    }
    
    public String ponerPaquete(Paquete p){ //me devuelve el codigo del compartimento donde se puso
        
        this.paquete = p;
        return codigoComp;
        

    }
    public String toString(){ //ojo a esto: llamo a un metodo de mi super para utilizarmo en un metodo del hijo
        return super.toString()+color+numM;
    }
}
class CompPequenyo extends Compartimento {
    private static int numP = 1;
    private String color = " A COLOR ";
    
    public CompPequenyo (){
        capacidad = 10;
        codigoComp = "P"+numP;
        numP++;
    }
    
    public String ponerPaquete(Paquete p){
        this.paquete = p;
        return codigoComp;

    }
    public String toString(){ //ojo a esto: llamo a un metodo de mi super para utilizarmo en un metodo del hijo
        return super.toString()+color+numP;
    }

    
}
class Paquete {
    private String codigoP;
    private int tamanyo;

    public Paquete(String codigoP, int tamanyo){
        this.codigoP = codigoP;
        this.tamanyo = tamanyo;
    }
    //get y set (aqui creamos get y set porque sera el cliente el que lo modifique, por eso no ponemos protected )
    public String getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(String codigoP) {
        this.codigoP = codigoP;
    }

    public int getTamanyo() {
        return tamanyo;
    }

    public void setTamanyo(int tamanyo) {
        this.tamanyo = tamanyo;
    }
    
}