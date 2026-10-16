public class ejFraccion {

    public static void main(String[] args) {
        Fraccion f1 = new Fraccion(); //con esto instanciamos un objeto. Aqui usamos el constructor por defecto y es 1/1 segun el enunciado
        Fraccion f2 = new Fraccion(2, 5);//aqui usamos el segundo constructor
        Fraccion f3 = new Fraccion(3, 2);//aqui usamos el segundo constructor
        Fraccion f4 = new Fraccion(72, 108);//aqui usamos el segundo constructor

        System.out.println(f1); //puedo hacer esto porque cree el constructor toString
        System.out.println(f2);

        f2.multiplicar(f3);
        f2.simplificar();
        f3.invertir();
        f3.dividir(f4);
        f4.multiplicar(f1);

        System.out.println(f2); //puedo hacer esto porque cree el constructor toString
        System.out.println(f3);
        System.out.println(f4);
        System.out.println("-----");

        f3.sumar(f2);
        System.out.println(f3);
        Fraccion f = Fraccion.sumar(f2, f3);

    }
}
//ver el final, algo esta mal

class Fraccion {
    private Integer numerador;
    private Integer denominador;


    
    public Fraccion() {
        this.numerador = 1; //se puede poner directamente numerador = 1; Ya que aqui no hay confusion
        this.denominador = 1;

    }



    public Fraccion(Integer numerador, Integer denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    

    //getters y setters

    public Integer getNumerador() {
        return numerador;
    }



    public void setNumerador(Integer numerador) {
        this.numerador = numerador;
    }



    public Integer getDenominador() {
        return denominador;
    }



    public void setDenominador(Integer denominador) {
        this.denominador = denominador;
    }
    @Override //sobreescribe un metodo que ya existe(en este caso es para el toString)
    //sirve como una alerta para ver si esta bien

    //para mostrar
    public String toString(){
        return numerador+"/"+denominador;
    }

    //metodo invertir(cambia el num de arriba por el de abajo)
    public void invertir(){ //es un void poque no queremos q devuelva nada
        Integer aux = this.numerador; //usa una variable auxiliar para guardar el numero
        this.numerador = this.denominador;   //cambio
        this.denominador = aux; //cambio (uso la aux)
    }

    //metodo multiplicar
    public void multiplicar(Fraccion f1){  //le pasamos un objeto
        // el numerador nuevo sera el numerador que tenemos multiplicado por el objeto.numerador
        //this.numerador = this.numerador * f1.numerador;  
        this.numerador = this.numerador * f1.getNumerador();  //usamos un get porque es Privada los atributos y para poder usar: getters y setters
        this.denominador = this.denominador * f1.getDenominador();
        
        
        this.simplificar(); //SI ponemos esto, usamos el constructor simplificar al final de este constructor
    }

    //metodo dividir
    public void dividir(Fraccion f1){  //le pasamos un objeto
        //la divi es una multi invertida

        this.numerador = this.numerador * f1.getDenominador(); 
        this.denominador = this.denominador * f1.getNumerador();
        
        /*Esta seria otra forma de dividir usando los constructores que ya tenemos
        f1.invertir(); //obveto.lo invertimos
        this.multiplicar(f1);*/   //lo multiplicamos

        this.simplificar();
    }

    //metodo para simplificar
    public void simplificar(){
        Integer min = Math.min(this.numerador, this.denominador); //usamos math para identificaqr el numero mas pequeño
        int i = 2;
        while (i <= min) {
            if (this.numerador % i == 0 && this.denominador % i == 0) {
                numerador /= i;     //?
                denominador /= i;   //?

                min = Math.min(this.numerador, this.denominador);
                
            }else{//si no es divisible por 2, probamos con el siguiente numero de i
                i = i+1;
            }
        }
    }

    //metodo  para sumar fracciones;
    public void sumar(Fraccion f1){
        Integer n1 = this.numerador * f1.getDenominador();
        Integer n2 = this.denominador * f1.getNumerador();
        this.numerador = n1+n2;
        denominador = f1.getDenominador();
        this.simplificar();
    }
    //otra forma de sumar (sumamos 2 fracciones y devuelve 1 fraccion)
    public static Fraccion sumar(Fraccion f1, Fraccion f2){  //ponemos static: se convierte en un metodo de una clase y no del objeto
        Integer n1 = f1.getNumerador() * f2.getDenominador();
        Integer n2 = f1.getDenominador() * f2.getNumerador();
        Integer n3 = n1+n2;
        Integer d = f1.getDenominador() * f2.getDenominador();
        
        Fraccion f = new Fraccion(n3,d);
        
        f.simplificar();
    }
}