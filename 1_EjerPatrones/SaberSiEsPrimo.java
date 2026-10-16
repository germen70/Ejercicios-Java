//la linea de esPrimo es IMPORTANTE SABER porque nos dice si es primo cualquier numero de foma sencilla y simplificada

public class SaberSiEsPrimo {
    public static void main(String[] args) {
        
        NumReto a = new NumReto();
      
        System.out.println(a.esPar());
        
        //System.out.println((new NumReto(2882)).esPar()); // IMPRIME (crea objeto. pregunta si es par o no)
        System.out.println(a.esPrimo());

    }
    
}
class NumReto {

    private Long num;

    //constructores
    public NumReto() {
        num = (long)0; //o poner 0l
    }
    public NumReto(Long num) {
        this.num = num;
    } 
    public NumReto(Integer num) {
        this.num = Long.valueOf(num); //probar (long) num 
    }
    //constructores
    public boolean esPar() {
        /* esto es lo mismo como lo del compare to: lo de aqui es lo mismo que lo de abajo
        if (num %2 == 0) return true;
        return false;
        */
        return  (num %2 == 0);
    }
    public boolean esPrimo(){
        boolean primo = true;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                primo = false;
                break; // o poner return false;
            }
        }
        return primo;
    }
    //get y set
    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    } 
    
    
}