public class Oferta {
    static int cont = 0;
    private int id;
    private Hotel hotel;
    private Agencia agencia;
    private int precio;
    public Oferta(Hotel hotel, Agencia agencia, int precio) {
        cont++;
        this.id = cont;
        this.hotel = hotel;
        this.agencia = agencia;
        this.precio = precio;
    }
    public Oferta(int id, Hotel hotel, Agencia agencia, int precio) {
        cont++;
        this.id = id;
        this.hotel = hotel;
        this.agencia = agencia;
        this.precio = precio;
    }
    public int getId() { 
        return id; 
    }
    public Hotel getHotel() { 
        return hotel; 
    }
    public Agencia getAgencia() { 
        return agencia; 
    }
    public int getPrecio() { 
        return precio; 
    }
    public void setPrecio(int nuevoPrecio) {
        this.precio = nuevoPrecio;
    }
    @Override
    public String toString() {
        return agencia.getNagencia() + " -> " + getPrecio();
    }    
}
