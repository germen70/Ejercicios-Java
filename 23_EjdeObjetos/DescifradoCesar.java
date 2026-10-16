//descifro el archivo texto.cf4 y creo un  nuevo archivo llamado: prueba
//solo se le pasa 1 argumento
import java.io.FileReader;
import java.io.FileWriter;

public class DescifradoCesar {

    public static void main(String[] args) {
        if (args.length != 1) { //aqui veo si esta el numero de argumentos que se le pasa
            System.out.println("error en argumentos");
        }else{
            //meterlo en un try cath. comprobar q existe....

        String fichero = args[0];
        int pos  = Integer.valueOf(fichero.substring(fichero.length()-1)); //lo convierto a int(saco el ultimo elemento)
        //pos  = Integer.valueOf(fichero.charAt(fichero.length())); //esto creo que es otra forma de hacerlo pero no estoy seguro
        
        try {
            //BufferedReader //se puede usar buffer o file. La diferencia es q uno lee caracter a caracter y el otro linea a linea
            FileReader fr  = new FileReader(fichero); //borrar esta linea para crear el archivo

            FileWriter fw = new FileWriter("prueba");
            
            //leo el fichero caracter a caracter hasta encontrar un -1
            int c =fr.read();
            while (c != -1) {
                if (c >= 'A' && c <= 'Z') {
                    c-= pos; //le sumo el numero al caracter.Problema: puede ser que me pase, por eso:

                    if (c <65) {
                        c+=26; //26 es el numero de letras en el abecedario
                    }

                }
                //escribir caracter en el fichero
                fw.write(c);
                //fw.flush(); //CREO QUE ESTO HACE SALTO DE LINEA?
                c =fr.read();
                
            }
            fr.close();
            fw.close();
            //otra forma mas optima. no haria falta poner: c =fr.read(); dentro del bucle
            /* 
            int cc;
            while ((cc = fr.read()) != -1) {

            }
            */
        } catch (Exception e) {
            // TODO: handle exception
        }
        }
        
    }
}