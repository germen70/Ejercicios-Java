//me crea un archivo/fichero con el nombre que quiera (en este codigo crea: prueba.cf4)
//encripta el archivo que le paso (texto a encriptar: texto.txt   texto encriptado: texto.cf4)
//solo se le pasa 2 argumentos

import java.io.FileReader;
import java.io.FileWriter;

public class CifradoCesarls {

    public static void main(String[] args) {
        
        if (args.length != 2) {
            System.out.println("error en argumentos");
        }else{
            //meterlo en un try cath. comprobar q existe....
        String fichero = args[0];
        int pos = Integer.valueOf(args[1]);

        try {
            //BufferedReader //se puede usar buffer o file. La diferencia es q uno lee caracter a caracter y el otro linea a linea
            FileReader fr  = new FileReader(fichero); //borrar esta linea para crear el archivo

            String nombre = fichero.split("\\.")[0]+".cf"+pos; //hay que poner asi \\. porque si se pone . es una expresion regular
            System.out.println(nombre);

            FileWriter fw = new FileWriter(nombre);
            
            //leo el fichero caracter a caracter hasta encontrar un -1
            int c =fr.read();
            while (c != -1) {
                if (c >= 'A' && c <= 'Z') {
                    c+= pos; //le sumo el numero al caracter.Problema: puede ser que me pase, por eso:

                    if (c >90) {
                        c-=26; //26 es el numero de letras en el abecedario
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