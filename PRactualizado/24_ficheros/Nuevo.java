//sin terminar el fori
import java.io.File;
import java.util.Scanner;

public class Nuevo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce nombre del fichero");
        String dir = sc.next();
        File f = new File(dir);
        try {
            if(f.exists() && f.isDirectory()){
                File[] array = f.listFiles();

                for (int i = 0; i < args.length; i++) {
                    array[i].getName(); 
                }
                System.out.println("He creado el fichero "+f.getName());
            }else{
                System.out.println("No se ha podido crear");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}