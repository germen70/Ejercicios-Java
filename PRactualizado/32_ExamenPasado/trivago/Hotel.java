public class Hotel {
    static int contador= 0;
    private int codhotel;
    private String nhotel;
    public Hotel() {
        this.codhotel = 0;
        this.nhotel = null;
    }
    public Hotel(String nhotel) {
        contador++;
        this.codhotel = contador;
        this.nhotel = nhotel;
    }
    public Hotel(int codhotel, String nhotel) {
        contador++;
        this.codhotel = codhotel;
        this.nhotel = nhotel;
    }
    
    public String toString() { 
        return "[" + codhotel + "] " + nhotel; 
    }
    public int getCodhotel() { 
        return codhotel; 
    }
    public void setCodhotel(int codhotel) { 
        this.codhotel = codhotel; 
    }
    public String getNhotel() { 
        return nhotel; 
    }
    public void setNhotel(String nhotel) { 
        this.nhotel = nhotel; 
    }
}
