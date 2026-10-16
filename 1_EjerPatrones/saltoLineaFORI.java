//hago salto de linea con fori y BufferWrite
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class saltoLineaFORI {
    public static void main(String[] args) {
        try {
            Scanner sc= new Scanner(System.in);
            int casos = sc.nextInt();
            
            BufferedWriter bw = new BufferedWriter(new FileWriter("enlaces.html"));
            String s;
            for (int i = 0; i < casos; i++) {
                bw.write("<a href=\""+sc.next()+"\">"+sc.next()+"</a>");
                //ESTO PARA EL SALTO DE LINEA. CON UN SYSOUT USAR UNA VARIBLE PARA GUARDAR
                if (i!=(casos-1)){
                    bw.newLine();
                }
            }
            bw.close();
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
