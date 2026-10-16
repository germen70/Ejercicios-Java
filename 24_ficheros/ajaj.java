import java.io.File;
import java.io.IOException;

public class ajaj {

    public static void main(String[] args) {
       File f = new File("fichero1.txt");

       try{
            if(f.createNewFile()){
                System.out.println("he creado el fichero: "+f.getName());
            }else{
                System.out.println("NO se ha podido crear");
            }
        }catch(IOException e){
            System.out.println("ERROR: creacion de fichero");
        }catch(Exception e){
            e.printStackTrace();
        }
        int num = 'a';
        System.out.println(num);
    }
}