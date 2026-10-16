import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class EjFormula1{
    static Scanner sc = new Scanner(System.in);

    public static ArrayList<Piloto> LeerPilotos(String fichero){
        ArrayList<Piloto> listaP= new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fichero));
            String s = br.readLine();

            while (s != null) {
                String[] sep = s.split(":");
                listaP.add(new Piloto(sep[0],sep[1],sep[2],sep[3]));
                s = br.readLine();
            }
            br.close();
        } catch (Exception e) {
            System.out.println("error leerPilotos");
        }
        return listaP;
    }
    public static ArrayList<Circuito> LeerCircuitos(String fichero){
        ArrayList<Circuito> listaC= new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fichero));
            String s = br.readLine();

            while (s != null) {
                String[] sep = s.split(":");
                listaC.add(new Circuito(Integer.valueOf(sep[0]),sep[1],sep[2],Integer.valueOf(sep[3])));
                s = br.readLine();
            }
            br.close();
        } catch (Exception e) {
            System.out.println("error LeerCircuitos");
        }

        return listaC;
    }
    public static int menu(){

        System.out.println("1.Agregar\nresultados\n2.Clasificación\n3.Salir");
        int op =sc.nextInt();//ver la opcion donde se añada una letra y no un numero
        return op;
    }

    public static void main(String[] args) {
        ArrayList<Piloto> listaP= LeerPilotos("PILOTOS.TXT");
        ArrayList<Circuito> listaC= LeerCircuitos("circuitos.txt");
        
        int opcion = menu();
        while (opcion!=3) {
            switch (opcion) {
                case 1:
                    ArrayList<ResultadoCarrera> rs = new ArrayList<>();
                    int cir;
                    do {
                        System.out.println("Introduce el número del circuito: ");
                        cir= sc.nextInt();
                    } while (cir<1 && cir>24);

                    Circuito circuito = new Circuito();
                    for (Circuito c : listaC) {
                        if(c.getNum() == cir){
                            circuito = c;
                            System.out.println(">>Has seleccionado el circuito "+c.getNombre());
                            break;
                        }
                    }

                    for (Piloto p : listaP) {
                        System.out.println("Introduce la posición de "+p.getNombre()+":");
                        
                        rs.add(new ResultadoCarrera(circuito, p, sc.nextInt()));
                    }
                    try {
                        //crea el archivo si no existiese(si existe no pasa nada). El true es para decir si sobreescribe o no
                        BufferedWriter bw = new BufferedWriter(new FileWriter("resultados.txt",true));
                        //uso fori para no imprimir un salto de linea al final de mi archivo
                        
                        for (ResultadoCarrera resultC : rs) {
                            bw.write(resultC+""); //poner +""porque sino se piesa q es un objeto y no un String
                            bw.newLine(); //salta de linea"
                            
                        }
                        //bw.newLine(); //salta de linea
                        bw.close(); 
                    } catch (Exception e) {
                        System.out.println("Error escribir resultados");
                    }
                    break;
                case 2: 
                    Clasificacion clasi = new Clasificacion();
                    for (Piloto pilo : listaP) {
                        
                        clasi.addPuntuacionPiloto(new PuntuacionPiloto(pilo));
                    }

                    clasi.ordenaClasificación();
                    System.out.println(clasi.imprimirClasificacion());
                    break;
                default: System.out.println("dime una opción válida"); break;
            }
            opcion = menu();
        }
    }
}