import java.io.*;
import java.util.*;

class Equipo implements Serializable, Comparable<Equipo> {
    private String nombre;
    private int puntos;

    public Equipo(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    @Override
    public String toString() {
        return nombre + " - " + puntos + " puntos";
    }
    
    public int compareTo(Equipo r){
        
        //si no son iguales: ordena por la distancia
        return  r.puntos - this.puntos; //?
    }
}

public class Clasificacion implements Serializable { //implementa serializable 
    private List<Equipo> equipos;

    public Clasificacion() {
        equipos = new ArrayList<>();
    }

    public void addEquipo(Equipo equipo) {
        equipos.add(equipo);
        
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void imprimirClasificacion() {
        System.out.println("Clasificación");
        for (Equipo equipo : equipos) {
            System.out.println(equipo);
        }
    }

    public void serializar(String archivo) {
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))) {
            out.writeObject(this);
            System.out.println("Clasificación serializada en " + archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //aqui uso elo .sort pero el metodo lo creo en equipo
    public static Clasificacion deserializar(String archivo) {
        
        Clasificacion clasificacion = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            clasificacion = (Clasificacion) in.readObject();
            Collections.sort(clasificacion.equipos);//de la clasificacion, ordeno los equipos
            System.out.println("Clasificación deserializada de " + archivo);
            //si no se usase el .sort: con esta ya valdria
            
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clasificacion;
    }
}
