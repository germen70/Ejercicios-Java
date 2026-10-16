

public class ResultadoCarrera {
    
    private Circuito c;
    private Piloto p;
    private Integer pos;

    //constructor
    public ResultadoCarrera(Circuito c, Piloto p, Integer pos) {
        this.c = c;
        this.p = p;
        this.pos = pos;
    }
    public Circuito getC() {
        return c;
    }
    //imprimir
    @Override
    public String toString(){
        //int aas =this.pos;
        String s = this.getC().getNum()+":"+this.getP().getNombre()+":"+this.getPos();
        return s;
    }
    public Piloto getP() {
        return p;
    }
    public Integer getPos() {
        return pos;
    }    
}
