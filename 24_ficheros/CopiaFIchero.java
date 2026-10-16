//copiar ficheros y ponerlos en un nuevo fichero. 2 formas (uno binario y otro para caracteres)
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CopiaFIchero {

    public static void main(String[] args) {
        
        try {
            FileReader fr = new FileReader("fichero1.txt");
            FileWriter fw = new FileWriter("fichero2.txt"); //con el write machaca y sobreescribe el fichero
            FileWriter fw2 = new FileWriter("fichero3.txt", true); //escribe desde el final del fichero
            int c = fr.read();
            
            
            while (c != -1) {
                fw.write(c);
                fw2.write(c);
                c = fr.read();
            }

            /////////////////
             
            BufferedReader br = new BufferedReader(new FileReader("fichero1.txt")); //aqui leemos el fichero del cual luego copiamos
            PrintWriter pw = new PrintWriter(new FileWriter("fichero4.txt",true));  //aqui copiamos el fichero
            String s = br.readLine();
            int cont = 1; //contamos cuantas lineas tine

            while (s != null) {
                pw.printf("%d %s\n",cont++, s);
                
                s = br.readLine();
            }

            fw.close(); //importante cerrarlo para que se guarde los datos
            fw2.close(); 

            br.close();
            pw.close();

        } catch (Exception e) {
            System.out.println(e+" - ERROR");
        }
    }
}