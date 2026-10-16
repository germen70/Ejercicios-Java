import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Vuelo {
    private String id_vuelo;
    private String origen;
    private String destino;
    private String fecha;
    private Integer capacidad;

    public Vuelo(String id_vuelo,String origen,String destino, String fecha, Integer capacidad){
        this.id_vuelo = id_vuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.capacidad = capacidad;
    }

    public static Connection Conecta(String bd, String usu, String pass){
        //Conexión con la BD
        try{
            Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/"+bd,
                        usu,
                        pass);
            return con;
        }catch(SQLException e){
            System.out.println("Error en la BD");
        }
        return null;
    }

    public boolean altaV(){
        try{
            Connection con = Conecta("ReservaVuelos",
                                     "root","toor");
            Statement st = con.createStatement();
            String sql = "INSERT INTO Vuelos VALUES ('"+id_vuelo+
                                                    "','"+origen+
                                                    "','"+destino+
                                                    "','"+fecha+
                                                    "',"+capacidad+")";                     
            int filas = st.executeUpdate(sql);

            con.close();

            if (filas > 0){
                System.out.println("Vuelo añadido");
                return true;
            }

        }catch(SQLException e){
            System.out.println("FALLO en el INSERT");
        }
        return false;
    }

    public static String ListaVuelo(){
        try{
            Connection con = Conecta("ReservaVuelos",
                                     "root","toor");
            Statement st = con.createStatement();
            String sql = "SELECT id_vuelo,origen,destino FROM Vuelos";                     
            ResultSet rs = st.executeQuery(sql);

            String resultado = "";

            while (rs.next()){
                resultado += rs.getString("id_vuelo") + " - ";
                resultado += rs.getString("origen") + " -- ";
                resultado += rs.getString("destino") + "\n";
            }

            con.close();

            return  resultado;

        }catch(SQLException e){
            System.out.println("FALLO en el SELECT");
        }
        return "";



    }


    public String getId_vuelo() {
        return id_vuelo;
    }
    public void setId_vuelo(String id_vuelo) {
        this.id_vuelo = id_vuelo;
    }
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public Integer getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }


}