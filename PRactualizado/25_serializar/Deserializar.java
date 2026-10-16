//para poder acceder a los datos serealizados
//ALgo esta mal que no me deja imprimirlo creo que el problema esta>
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Deserializar {

    public static void main(String[] args) throws IOException{
        
        ArrayList<Amigo> a = new ArrayList<>();
        try {
            ObjectOutputStream is = new ObjectOutputStream(new FileOutputStream("amigos.dat"));//creo que el problema esta aqui
            //Amigo a = (Amigo) is.readObject();
            //leemos la serealizacion
            /*
            a.add( (Amigo) is.readObject());
            
            System.out.println(a.get(0));

            a.add( (Amigo) is.readObject());
            System.out.println(a.get(1));*/
            Amigo temporal;

            //leemos hasta que no haya mas en la serealizacion
            while ((temporal = (Amigo) is.readObject()) != null) {
                a.add(temporal);
            }

            
            is.close();
        } catch (IOException e) {
            System.out.println("Fin de fichero");
            
        } catch (Exception e) {
            System.out.println("ERROR");
            
        }
        for (Amigo ax : a) {
            System.out.println(ax);
        }
    }
}