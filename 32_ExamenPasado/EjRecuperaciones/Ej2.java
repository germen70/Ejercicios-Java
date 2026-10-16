
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ej2 {
    
    public static int numeroParadas(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Que linea quieres buscar?");
        int linea = Integer.valueOf(sc.nextLine());
        System.out.println("Estacion origen?");
        String origen = sc.nextLine();
        System.out.println("Estacion final?");
        String finall = sc.nextLine();
        
        int posI = 0;

        int posF = 0;
        for (Map.Entry<Integer, Estacion> entry : listaEstacion.entrySet()) {
            String aux = entry.getValue().getNombre();
             if (aux.equals(origen)) {
                posI = entry.getKey();
                System.out.println(posI);
                
            }
            aux = entry.getValue().getNombre();
            if (aux.equals(finall)) {
                posF = entry.getKey();
                System.out.println(posF);
            }
        }
        if (posI == 0 || posF == 0) {
            return -1;
        }
        Linea lin = listaLine.get(linea);
        int inicio = lin.lista.indexOf(posI);
        int fi = lin.lista.indexOf(posF);
        return (fi-inicio-1);

    }
    static TreeMap<Integer, Estacion> listaEstacion = new TreeMap<>();
    static TreeMap<Integer, Linea> listaLine = new TreeMap<>();
    public static void main(String[] args) {
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("estaciones.txt"));
            String s = br.readLine();
            while (s != null) {
                String[] separacion = s.split(":");
                listaEstacion.put(Integer.valueOf(separacion[0]), new Estacion(separacion[1]));
                
                s = br.readLine();
            }
            br =new BufferedReader(new FileReader("lineas.txt"));
            s = br.readLine();
            while (s != null) {
                String[] separacion = s.split(":");
                
                listaLine.put(Integer.valueOf(separacion [0]), new Linea(separacion[1]));
                
                s = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.out.println("error lectura");
            System.err.println(e);
        }

       for (Map.Entry<Integer, Estacion> entry : listaEstacion.entrySet()) {
            
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        for (Map.Entry<Integer, Linea> entry : listaLine.entrySet()) {
            
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println(numeroParadas());
        
    }
}
