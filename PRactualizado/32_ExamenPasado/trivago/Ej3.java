
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej3 {
    static Scanner sc = new Scanner(System.in);
    public static int menu(){
        
        System.out.println("1. Ver ofertas de hoteles\n" + //
                        "2. Cambiar Oferta\n" + //
                        "3. Crear Oferta nueva\n" + //
                        "4. Salir");
        return (Integer.valueOf(sc.nextLine()));
    }
    public static void verOfertas(Hotel hotel){
        for (Oferta oferta : listaOferta) {
            if (oferta.getHotel().equals(hotel)){
                System.out.println(oferta);
            }
        }
    }
    public static void cambiarOferta(int codoferta,int precio){
        String sql = "UPDATE Ofertas SET precio = ? WHERE codoferta = ?";
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/muivago","root","toor");
            PreparedStatement ps = con.prepareStatement(sql)){
            
            ps.setInt(1, precio);
            ps.setInt(2, codoferta);

            int filas = ps.executeUpdate();
            if (filas >0) {
                System.out.println("Datos actualizados");
                        
                for (Oferta oferta : listaOferta) {
                    if(oferta.getId() == codoferta){
                        oferta.setPrecio(precio);
                    }
                }   
            }else{
                System.out.println("error");
            }
        }catch(SQLException e){
            System.out.println("error cambiarOferta en sql");
            System.err.println(e);
        }catch(Exception e){
            System.out.println("error cambiarOferta");
            System.err.println(e);
        }
    }
    public static void datos(){
        System.out.println("Introduce el nombre del nuevo hotel");
        String nombreH = sc.nextLine();
        Hotel h = new Hotel(nombreH);

        System.out.println("Introduce el nombre de la nueva agencia");
        String nombreA = sc.nextLine();
        Agencia a = new Agencia(nombreA);
        System.out.println("Introduce el precio de la agencia \""+nombreA+"\" para el hotel \""+nombreH);
        
        nuevaOferta(h, a, Integer.valueOf(sc.nextLine()));

    }
    public static void nuevaOferta(Hotel hotel, Agencia agencia ,int precio){
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/muivago","root","toor");
            Statement st = con.createStatement();
            String sql = "INSERT INTO Hotel (nhotel) VALUES ('"+hotel.getNhotel()+"');";
            int filas= st.executeUpdate(sql);
            sql = "INSERT INTO Agencia (nagencia) VALUES ('"+agencia.getNagencia()+"');";
            filas = filas+ st.executeUpdate(sql);
            sql = "INSERT INTO Ofertas (codhotel, codagencia, precio) VALUES ("+hotel.getCodhotel()+", "+agencia.getCodagencia()+", "+precio+");";
            filas = filas+ st.executeUpdate(sql);

            if (filas >=3) {
                System.out.println("Datos insertados: (hotel,agencia y oferta");
                listaHotel.add(hotel);
                listaAgencia.add(agencia);
                listaOferta.add(new Oferta(hotel, agencia, precio));
            }else{
                System.out.println("error");
            }
            con.close();
            st.close();
        }catch(SQLException e){
            System.out.println("error cargarHotel en sql");
            System.err.println(e);
        }catch(Exception e){
            System.out.println("error cargarHotel");
            System.err.println(e);
        }
    }
    public static ArrayList<Hotel> cargaHoteles(){
        ArrayList<Hotel> lista = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/muivago","root","toor");
            Statement st = con.createStatement();

            String sql = "SELECT * FROM Hotel";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                lista.add(new Hotel(rs.getInt("codhotel"), rs.getString("nhotel")));
            }
            con.close();
            st.close();
        }catch(SQLException e){
            System.out.println("error cargarHotel en sql");
            System.err.println(e);
        }catch(Exception e){
            System.out.println("error cargarHotel");
            System.err.println(e);
        }
        return lista;
    } 
    public static ArrayList<Agencia> cargaAgencias() {
        ArrayList<Agencia> lista = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/muivago","root","toor");
            Statement st = con.createStatement();

            String sql = "SELECT * FROM Agencia";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                lista.add(new Agencia(rs.getInt("codagencia"), rs.getString("nagencia")));
            }
            con.close();
            st.close();
        }catch(SQLException e){
            System.out.println("error cargarAgencia en sql");
            System.err.println(e);
        }catch(Exception e){
            System.out.println("error cargarAgencia");
            System.err.println(e);
        }
        return lista;
    }
    public static ArrayList<Oferta> cargaOfertas(){
        ArrayList<Oferta> lista = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/muivago","root","toor");
            Statement st = con.createStatement();

            String sql = "SELECT * FROM Ofertas";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                
                Agencia agenci = new Agencia();
                for (Agencia age : listaAgencia) {
                    if (age.getCodagencia() == rs.getInt("codagencia")) {
                        agenci = age;
                        break;
                    }
                }
                Hotel hote = new Hotel();
                for (Hotel hot : listaHotel) {
                    if (hot.getCodhotel() == rs.getInt("codhotel")) {
                        hote = hot;
                        break;
                    }
                }
                lista.add(new Oferta(rs.getInt("codoferta"), hote, agenci,  rs.getInt("precio")));
            }
            con.close();
            st.close();
        }catch(SQLException e){
            System.out.println("error cargarOferta en sql");
            System.err.println(e);
        }catch(Exception e){
            System.out.println("error cargarOferta");
            System.err.println(e);
        }
        return lista;
    }
    static ArrayList<Hotel> listaHotel = cargaHoteles();
    static ArrayList<Agencia> listaAgencia = cargaAgencias();
    static ArrayList<Oferta> listaOferta = cargaOfertas();
    public static void main(String[] args) {

        int cas;
        do {
            cas = menu();
            switch (cas) {
                case 1:
                    for (Hotel hot : listaHotel) {
                        System.out.println(hot);
                    }
                    System.out.println("Introduce el codigo del hotel");
                    int hotel = Integer.valueOf(sc.nextLine());
                    for (Hotel hot : listaHotel) {
                        if (hot.getCodhotel() == hotel) {
                            verOfertas(hot);
                            break;
                        }
                    }
                    
                    break;
                case 2:
                    for (Oferta oferta : listaOferta) {
                        System.out.println("ID > "+oferta.getId()+": "+oferta);
                    }
                    System.out.println("introduce el ID que quieres cambiar");
                    int id = sc.nextInt();sc.nextLine();
                    System.out.println("introduce el nuevo precio");
                    int precio = sc.nextInt();sc.nextLine();
                    cambiarOferta(id,precio);
                    break;
                case 3:
                    datos();
                    break;
                default: break;
            }
        } while (cas !=4);   
    }
}
