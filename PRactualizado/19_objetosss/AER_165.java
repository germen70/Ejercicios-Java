import java.util.Scanner;

public class AER_165 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        while (casos > 0) {
            
            Num numero = new Num(casos);

            System.out.println(numero.impri());

            casos = sc.nextInt();
        } 
    }
}
class Num{

    private Integer numero;
    
    //constructor
    public Num(Integer numero) {
        this.numero = numero;
    }

    //metodos 
    //el num lo paso a string y con el charAt voy analizando numero por numero
    public boolean hyperPar (){
        String cas = String.valueOf(numero); //el num se convierte en String
        int num = cas.length(); //tamaño del string
        boolean hyperPar = true;

        for (int i = 0; i < num; i++) { //un for que se repite segun el tamaño del string
                
            //int bb = Integer.valueOf(cas.charAt(i)) -48; // esto tambien valdria
            int bb = cas.charAt(i) - 48; //hay q restar 48 por el tema de la tabla ASTIR ya que pasamos de un char a un int
                
            if(bb%2 != 0){ //esto comprueba si es par
                hyperPar = false;
            }
        }
        return hyperPar;
    }
    //el num lo voy dividiendo entre 10 y voy analizando su resto
    public boolean hyperParV2 (){
        int aux = numero;
        boolean hyperPar= true;
        while (aux >0) {
            int resto = aux %10;
            aux = aux /10;
            if (resto % 2 != 0) hyperPar = false;
        }
        return hyperPar;
    }
    //
    public boolean esReversible(){
 
        boolean hyperPar = true;
        if (String.valueOf(numero).length() != String.valueOf(reverso()).length()) {
            int n = numero + reverso();
        }
        
        return  hyperPar;
    } 
    public int reverso(){ //funcion para revertir un numero
        String n = String.valueOf(numero);
        String aux = "";
        for (int i = n.length()-1; i >= 0; i--) { 
            aux = aux+ n.charAt(i);
            
        }
        return Integer.valueOf(aux);
    }
    public String impri() {
        
        if(hyperPar()) return "SI";
        return "NO";
    }
}