import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Reserva {
    private String idVuelo;
    private Integer idPasajero;
    private Integer nAsiento;

    public Reserva(String idVuelo, Integer idPasajero, Integer nAsiento) {
        this.idVuelo = idVuelo;
        this.idPasajero = idPasajero;
        this.nAsiento = nAsiento;
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

    public boolean addReserva(){
        try{
            Connection con = Conecta("ReservaVuelos",
                                     "root","toor");
            Statement st = con.createStatement();
            String sql = "INSERT INTO VueloPasajero VALUES ('"+idVuelo+
                                                    "',"+idPasajero+
                                                    ","+nAsiento+")";                     
            int filas = st.executeUpdate(sql);

            con.close();

            if (filas > 0){
                System.out.println("Reserva realizada");
                return true;
            }

        }catch(SQLException e){
            System.out.println("FALLO en el INSERT");
        }
        return false;
    }

    public boolean updateReserva(){
        try{
            Connection con = Conecta("ReservaVuelos",
                                     "root","toor");
            Statement st = con.createStatement();
            String sql = "UPDATE VueloPasajero SET Num_Asiento = "+nAsiento+
                                                    " WHERE Id_Vuelo = '"+idVuelo+
                                                    "' AND Id_Pasajero = "+idPasajero;                     
            int filas = st.executeUpdate(sql);

            con.close();

            if (filas > 0){
                System.out.println("Reserva actualizada");
                return true;
            }

        }catch(SQLException e){
            System.out.println("FALLO en el UPDATE");
        }
        return false;
    }


    public static String buscaReserva(Integer idPasajero){
        try{
            Connection con = Conecta("ReservaVuelos",
                                     "root","toor");
            Statement st = con.createStatement();
            String sql = "SELECT * FROM VueloPasajero WHERE Id_Pasajero = "+idPasajero;                     
            ResultSet rs = st.executeQuery(sql);

            String resultado = "";

            while (rs.next()){
                resultado += rs.getString("Id_Vuelo");
                resultado += "Asiento: "+ rs.getInt("Num_Asiento") + "\n";
            }


            con.close();

            return resultado;

        }catch(SQLException e){
            System.out.println("FALLO en el INSERT");
        }
        return "";
    }
    //sin terminar
    public static void deleteReserva(){
       try{
            Connection con = Conecta("ReservaVuelos",
                                     "root","toor");
            Statement st = con.createStatement();
            String sql = "DELETE FROM VueloPasajero WHERE Id_Vuelo = '"++"' AND Id_Pasajero = "+;                     
            ResultSet rs = st.executeQuery(sql);

            String resultado = "";

            while (rs.next()){
                resultado += rs.getString("Id_Vuelo");
                resultado += "Asiento: "+ rs.getInt("Num_Asiento") + "\n";
            }


            con.close();

            return resultado;

        }catch(SQLException e){
            System.out.println("FALLO en el INSERT");
        }
        return "";

    }


    public String getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(String idVuelo) {
        this.idVuelo = idVuelo;
    }

    public Integer getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(Integer idPasajero) {
        this.idPasajero = idPasajero;
    }

    public Integer getnAsiento() {
        return nAsiento;
    }

    public void setnAsiento(Integer nAsiento) {
        this.nAsiento = nAsiento;
    }

    
    
}