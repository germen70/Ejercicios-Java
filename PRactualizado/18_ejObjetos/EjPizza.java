//usamos un static
//Entender q he hecho aqui porque solo me he limitado a copiar codigo
public class EjPizza {

    public static void main(String[] args) {
        Pizza p1 = new Pizza();
        Pizza p2 = new Pizza("funghi", "familiar");
        p2.servirPizza();
        Pizza p3 = new Pizza("cuatro quesos", "mediana");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.servirPizza();
        System.out.println("pedidas: " + Pizza.getTotalPedidas());
        System.out.println("servidas: " + Pizza.getTotalServidas());
        }
}
class Pizza {

    private String tamanyo;
    private String tipo;
    private String estado;
    public static int totalPedidas = 0;
    public static int totalServidas = 0;

    public Pizza() {
        this.tamanyo = "mediana";
        this.tipo = "margarita";
        this.estado = "pedida";
        totalPedidas++;
    }

    public Pizza(String tipo, String tamanyo) {
        //this(); tambien podria llamar al constructor por defecto 
        this.tamanyo = tamanyo;
        this.tipo = tipo;

        this.estado = "pedida"; //si usase this(); ya no haria falta poner el estado y totalpeidas porque con el constructor ya establezco
        totalPedidas++;
    }
    //constructor
    public void servirPizza(){
        if (estado.equals("pedida")) {
            System.out.println("** Se sirve pizza **");
            estado = "servida";
            totalServidas++;

        }else{
            System.out.println("** esa pizza ya se ha servido **");
        }
      
    }
     //imprimir
    public String toString(){
        return ///this.servirPizza()+
        "pizza "+this.tipo+" "+this.tamanyo+", "+this.estado;
    }

    //getters y setters
    public String getTamanyo() {
        return tamanyo;
    }

    public void setTamanyo(String tamanyo) {
        this.tamanyo = tamanyo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static String getTotalPedidas() {
        return "pedidas: " + totalPedidas;
    }

    public static void setTotalPedidas(int totalPedidas) {
        Pizza.totalPedidas = totalPedidas;
    }

    public static String getTotalServidas() {
        return "servidas: " + totalServidas;
    }

    public static void setTotalServidas(int totalServidas) {
        Pizza.totalServidas = totalServidas;
    }
    
    

}