//salto de linea usando un fore
//crea o suma valores de un mapa segun la key
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;

public class MapasCreaOSumaKeys_Imprime {
    public static void main(String[] args) {
        try {
            LinkedHashMap<String, Integer> lista= new LinkedHashMap<>();//es necesario el segundo "<>"?
            BufferedReader br = new BufferedReader(new FileReader("dockerfile"));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(" ");
                
                int cantidad = 1;
                
                if (lista.containsKey(partes[0])) {
                    cantidad = lista.get(partes[0])+1;
                }
                lista.put(partes[0], cantidad);
                //forma mas simple. El .put crea o actualiza. el .getOrDefault te da el get si tiene SINO te la el defoult q le pongas.
                //HAY QUE PONER +1 PARA QUE SE ACTUALICE
                lista.put(partes[0], (lista.getOrDefault(partes[0], 0)+1));
                
            }
            br.close();
            int contador=0;//esto importante
            for (String s : lista.keySet()) {
                contador++;
                String frase;
                if (s.equals("#")) {
                    s = "Comentarios";  
                }
                frase = s+" "+lista.get(s);
               //esto para imprimir sin el ultimo salto de linea
                if (contador!=lista.size()) {
                    System.out.println(frase);
                }else{
                    System.out.print(frase);
                }
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
