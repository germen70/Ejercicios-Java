//Crear un programa que pida un nombre de usuario y contraseña y lo guarde en un fichero con el formato

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class EjFicheros2{
    public static void main(String[] args) {

        try {
            
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //esto sustituye al Scanner
        String nom = br.readLine();
        String contra = br.readLine();

        while(contra.length()<5 && !contra.contains("!@#~%&/")){

            contra = br.readLine();
        }

        PrintWriter pw = new PrintWriter(new FileWriter("passwd.txt",true));  //aqui meteremos la info, con el true no sobreescribilos la info q ya estubiese

        
        pw.printf("%s:%s\n", nom, contra);
        // tambien vale usar pw.write(nom)
            
        pw.close();

        ////////////////////////////////////////////
        
        BufferedReader ab = new BufferedReader(new FileReader("passwd.txt"));

        System.out.println("DIME TU USUARIO: ");
        nom = br.readLine(); //leo
        String[] qwe;
        boolean noExiste = true;
        boolean login = false;

        do {
            String s = ab.readLine();
            qwe = s.split(":");

            if (nom.equals(qwe[0])) {
                noExiste = false;
                contra = br.readLine(); //leo

                if (contra.equals(qwe[1])) {
                    login = true;
                }
            }
            
        } while (nom.equals(qwe[0]) || noExiste == true);
        


        if (noExiste) {
            System.out.println("Usuario no existe");
        }else{
            if (login) {
               
                System.out.println("Login correcto");
            }else{
                System.out.println("Contra equivocada");
            }
        }
    
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}