import java.util.Scanner;

public class EjMazmorras{
    public static Personaje hero(int num, String n){
        switch (num) {
            case 1: return new Guerrero(n);
            case 2: return new Mago(n);
            case 3: return new Enano(n);
            default: return new Guerrero(n);
        }
    }
    public static String nomm(int n){
        switch (n) {
            case 1: return "Guerrero";
            case 2: return "Mago";
            case 3: return "Enano";
            default: return "Guerrero";
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p;
        do { 
            System.out.println("Del 1 al 3, elige tu Heroe:\n1)Guerrero\n2)Mago\n3)Enano");
            p = sc.nextInt();
        } while (p <1 || p >3);
        System.out.println("Nombre del "+nomm(p)+":");
        sc.nextLine();
        String nomPj = sc.nextLine();
        Personaje h = hero(p,nomPj);

        do { 
            System.out.println("Del 1 al 4, elige la Arma de "+nomPj+":\n1)Hechizo\n2)Arco\n3)Hacha\n4)Espada");
            p = sc.nextInt();
        } while (p <1 || p >4);
        //preguntar esto
        ((Heroe)h).armaHeroe(p); //polimorfismo o casting. Tratamos la clase padre como si fuera hija para poder usar sus metodos
        
        do { 
            System.out.println("Del 1 al 3, elige la dificultad\n1)Facil:3 Monstuos\n2)Intermedio: 6 Monstruos\n3)Dificil: 9 Monstruos");
            p = sc.nextInt();
        } while (p <1 || p >3);

        Pasillo mundo = new Pasillo();
        mundo.entraHero(h);
        mundo.entraMonst(p);
        
        boolean seguir = true;
        int cont =1;
        while (cont <40 && seguir) { 
            if(mundo.camino[cont] == null){
                mundo.camino[0].vida++;
                System.out.println(mundo.camino[0].vida);
            }else{
                System.out.print(mundo.camino[cont].nombre+" ");
                seguir = mundo.combate(mundo.camino[cont]);

                System.out.println(mundo.camino[0].vida);

            }
            cont++;
            
        }
        if (mundo.camino[0].vida >0 && cont ==40) {
            System.out.println("Ganaste, completaste todos los pasillos");
        }else{
        System.out.println("Perdiste, llegaste hasta el pasillo "+ cont);
        }

    }   
}
//pasillo
class Pasillo{
    protected  Personaje[] camino;

    public Pasillo(){
        camino = new Personaje[40];
    }
    //metodos
    public void entraHero(Personaje h){
        camino[0] = h;
    }
    public void entraMonst(int n){
        n = 3*n;
        Personaje pp;
        for (int i = 0; i < n; i++) {
            int random = (int)(Math.random()*3+1);
            switch (random) {
                case 1: pp = new Orco();
                case 2: pp = new Dragon();
                case 3: pp = new Zombie();
                default: pp = new Orco();
            }
            int r = (int)(Math.random()*39+1);
            while (camino[r] != null) { 
                r = (int)(Math.random()*39+1);
            }
            camino[r] = pp;
        }
    }
    public boolean combate(Personaje p){
        
        while (this.camino[0].vida > 0 && p.vida >0) {
            p.vida = p.vida - this.camino[0].ar.danyoArma();
            if (p.vida >0) {
                this.camino[0].vida = this.camino[0].vida -p.ar.danyoArma();
            }
        }
        if(this.camino[0].vida > p.vida){
            return true;
        }
        return false;
    }
}

abstract class Personaje{
    protected  String nombre;
    protected  int vida;
    protected  Arma ar;
    
    public Personaje(String nombre){
        this.nombre=nombre;
        vida =0;
        ar = null;
    }
    public Personaje(){
        this.nombre="";
        vida =0;
        ar = null;
    }
}
//BUENOS
abstract class Heroe extends Personaje{

    public Heroe(String nombre){
        super(nombre);
        vida = (int)(Math.random()*6+5);
        
    }
    //metodo
    public void armaHeroe(int n){
        
        switch (n) {
            case 1: ar = new Espada(); break;
            case 2: ar = new Arco(); break;
            case 3: ar = new Hacha(); break;
            default: ar = new Hechizo(); break;
        }
    }
}
class Mago extends Heroe{
    public Mago(String nombre){
        super(nombre);
        vida = (int)(Math.random()*6+3);
    }
}
class Guerrero extends Heroe{
    public Guerrero(String nombre){
        super(nombre);
    }
}
class Enano extends Heroe{
    public Enano(String nombre){
        super(nombre);
    }
}
//MALOS
class Monstruo extends Personaje{
    //constructor
    public Monstruo(){
        super();
        vida = (int)(Math.random()*16+5);
        ar = armaMons();
    }
    //metodo
    public Arma armaMons(){
        
        int r = (int)(Math.random()*4+1);
        switch (r) {
            case 1: return new Espada(); 
            case 2: return new Arco(); 
            case 3: return new Hacha();
            default: return new Hechizo();
        }
    }
}
class Orco extends Monstruo{

    public Orco() {
        super();
        nombre = "Orco";
    }
}
class Dragon extends Monstruo{

    public Dragon() {
        super();
        nombre = "Dragon";
    }
}
class Zombie extends Monstruo{

    public Zombie() {
        super();
        nombre = "Zombie";
    }
}

//armamento
class Arma{    
    protected  int danyomax;
    private int danyomin;

    public Arma() {
        this.danyomin = 1;
    }
    //metodo
    public int danyoArma(){
    
        return ((int)(Math.random()*danyomax+danyomin));

    }
}
class Espada extends Arma{

    public Espada() {
        super();
        danyomax = 5;
    }
}
class Arco extends Arma{
    public Arco() {
        super();
        danyomax = 7;
    }
}
class Hacha extends Arma{
    public Hacha() {
        super();
        danyomax = 6;
    }
}
class Hechizo extends Arma{
    public Hechizo() {
        super();
        danyomax = 10;
    }
}