//PuntuacionPiloto tiene que ser un extend  de piloto?

import java.io.BufferedReader;
import java.io.FileReader;

public class PuntuacionPiloto implements Comparable<PuntuacionPiloto>{
    private Piloto ppp;
    private Integer puntos;
    //constructor
    public PuntuacionPiloto(Piloto ppp) {
        this.ppp = ppp;
        this.puntos = calculaPuntos(ppp.getNombre());
    }
    //metodos
    public Integer puntos(int posii){
        switch (posii) {
            case 1: return 25;
            case 2: return 18;
            case 3: return 15;
            case 4: return 12;
            case 5: return 10;
            case 6: return 8;
            case 7: return 6;
            case 8: return 4;
            case 9: return 2;
            case 10: return 1;
            default: return 0;
        }
    }
    public Integer calculaPuntos(String nombrePiloto){
        int pun= 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("resultados.txt"));
            String s = br.readLine();
            
            while (s != null) {
                String[] sep = s.split(":");
                if(nombrePiloto.equals(sep[1])){        
                    pun = pun + (puntos(Integer.valueOf(sep[2])));
                }
                s = br.readLine();
            }
            br.close();
        } catch (Exception e) {
            System.out.println("error puntuacionPiloto");
        }
        return pun;
    }
    //para ordenarlos por el menor numero o sino por la D primero (luego la I)
    @Override
    public int compareTo(PuntuacionPiloto pr){
        
        return pr.puntos - this.puntos  ; //de mayor a menor
    }
    @Override
    public String toString(){
        String s =this.getPpp().getNombre()+" - "+this.getPuntos();
        return s;
    }
    //get y set
    public Piloto getPpp() {
        return ppp;
    }
    public Integer getPuntos() {
        return puntos;
    }
}
