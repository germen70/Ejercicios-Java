import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Formula1 {
    public static List<Piloto> leerPilotos(String fichero){
        List<Piloto> listap = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fichero));
            String c;
            while ((c = br.readLine()) != null) {
                String[] datos = c.split(":");
                listap.add(new Piloto(datos[0], datos[1], datos[2], datos[3]));
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return listap;
    }
    public static List<Circuito> leerCircuitos(String fichero){
        List<Circuito> listac = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fichero));
            String c;
            while ((c = br.readLine()) != null) {
                String[] datos = c.split(":");
                
                listac.add(new Circuito(Integer.valueOf(datos[3]), datos[1], datos[2], Integer.valueOf(datos[0])));
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return listac;
    }
    //main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Piloto> pilotosss = leerPilotos("PILOTOS.TXT");
        List<Circuito> circuitosss = leerCircuitos("circuitos.txt");
    
        System.out.println("Introduce numero de circuito");
        int num = sc.nextInt();
        Circuito = c;
        for (Circuito circuito : circuitosss) {
            if (circuito.getNumCircuito() == num) {
                c = circuito;
                break;
            }
        }
        List<ResultadoCarrera> resultadosss = new ArrayList<>();

        for (Piloto p : pilotosss) {
            System.out.println("Introduce la posicion de "+piloto.getNombre());
            int pos = sc.nextInt();
            resultadosss.add(new ResultadoCarrera(c, piloto, pos));
        }


    }
}

class Piloto{
    
    private String nombre;
    private String siglas;
    private String pais;
    private String equipo;
    
    public Piloto(String nombre, String siglas, String pais, String equipo) {
        this.nombre = nombre;
        this.siglas = siglas;
        this.pais = pais;
        this.equipo = equipo;
    }
}
class Circuito{

    private int num;
    private String inicio;
    private String fin;
    private int metros;    
    
    public Circuito(int num, String inicio, String fin, int metros) {
        this.num = num;
        this.inicio = inicio;
        this.fin = fin;
        this.metros = metros;
    } 
}
