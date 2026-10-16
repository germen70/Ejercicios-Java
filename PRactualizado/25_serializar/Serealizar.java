//digamos que codificamos los datos
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serealizar{
    public static void main(String[] args) {
        Amigo a1 = new Amigo("pepe", 123456);
        Amigo a2 = new Amigo("ana", 987654);
        Amigo a3 = new Amigo("Luisa", 121212);

        //en este try SEREALIZAMOS los objetos Amigo
        try {
            //instanciamos un objeto para guardar los datos
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("amigos.dat")) ;

            //para escribir en ese objeto
            os.writeObject(a1);
            os.writeObject(a2);
            os.writeObject(a3);
            os.writeObject(null); //metemos un señuelo para luego en Deserealizar poder hacerlo

            os.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
