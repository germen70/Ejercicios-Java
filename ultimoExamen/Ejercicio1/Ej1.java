import java.io.*;
import java.util.ArrayList;

public class Ej1{
    public static void main(String[] args) {
        //leo las habilidades y llo guardo en una lista
        ArrayList<String> habilidades = new ArrayList<>();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("nombredelarchivo.txt", true))) {

            bw.write("nuevo dato");
            bw.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader br = new BufferedReader(new FileReader("nombredelarchivo.txt"))) {

            String s;

            while ((s = br.readLine()) != null) {
                // procesar línea
                s = s.toLowerCase();
                habilidades.add(s);
            }

        } catch (IOException e) {
            System.out.println("error lectura");
            System.err.println(e);
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader("habilidades.txt"));
            String s = br.readLine();
            while (s != null) {
                s = s.toLowerCase();
                habilidades.add(s);
                s = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.out.println("error lectura habilidades");
            System.err.println(e);
        }
        //leo los CVs
        String nombre=""; //el nombre del mejor candidato
        int puntuacion = 0;//puntuacion del mejor candidato
        try {
            BufferedReader br = new BufferedReader(new FileReader("curriculums.txt"));
            String s = br.readLine();
            
            while (s != null) {
                int num=0; //contador para ver cuantos punto tiene
                //Uso 2 String[]. Uno sera para separar ":" y el otro para separar " "
                String[] linea = s.split(":"); //0 persona 1 habilidades
                linea[1] = linea[1].toLowerCase(); //lo hago minuscula
                String[] habil = linea[1].split(" "); // lo separo

                for (int i = 0; i < habil.length; i++) {
                    String asa = habil[i];
                    for (String c : habilidades) {
                        if (c.equals(asa)) {
                            num++;
                        }
                    }
                    if(habilidades.contains(asa)){
                        num++;
                    }
                }
                //este if es para ver si ek  nuevo candidato es mejor q el anterir. Si lo fuese, entonces pasa a ser el mejor candidato
                //si no lo fuese pues nada
                if (num >puntuacion) {
                    puntuacion = num;
                    nombre = linea[0];
                }
                s = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.out.println("error lectura curriculums");
            System.err.println(e);
        }
        //imprimimo
        System.out.println(nombre+" - "+ puntuacion);

    }
}