public class Agencia {
    static int contador = 0;
    private int codagencia;
    private String nagencia;

    public Agencia() {
        this.codagencia = 0;
        this.nagencia = null;
    }
    public Agencia(String nagencia) {
        contador++;
        this.codagencia = contador;
        this.nagencia = nagencia;
    }
    public Agencia(int codagencia, String nagencia) {
        contador++;
        this.codagencia = codagencia;
        this.nagencia = nagencia;
    }
    public String toString() { 
        return "[" + codagencia + "] " + nagencia; 
    }
    public int getCodagencia() { 
        return codagencia; 
    }
    public void setCodagencia(int codagencia) { 
        this.codagencia = codagencia; 
    }
    public String getNagencia() { 
        return nagencia; 
    }
    public void setNagencia(String nagencia) { 
        this.nagencia = nagencia; 
    }
}

