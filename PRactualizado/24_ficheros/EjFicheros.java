//Crear un programa que permita introducir texto por teclado y lo irá guardando en un fichero. Finalizas con la cadena “eof”
//en vez de usar Scanner se usa un buffer.
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class EjFicheros {

    public static void main(String[] args) {
        try {
        
        BufferedReader fr = new BufferedReader(new InputStreamReader(System.in)); //esto sustituye al Scanner
        String s = fr.readLine();
        PrintWriter pw = new PrintWriter(new FileWriter("ej.txt",true));  //aqui meteremos la info, con el true no sobreescribilos la info q ya estubiese

        while (!s.equals("eof")) {
            pw.printf("%s\n", s);
            
            
            s = fr.readLine();
        }
        pw.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}