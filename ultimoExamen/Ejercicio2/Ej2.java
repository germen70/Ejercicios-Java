/*
Operación	Método	SQL
INSERT	executeUpdate()	INSERT INTO
UPDATE	executeUpdate()	UPDATE ... SET ... WHERE
DELETE	executeUpdate()	DELETE FROM ... WHERE */
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej2 {
    //sustitulo del Scanner: BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    static Scanner sc = new Scanner(System.in);
    public static int menu(){
        
        System.out.println("1. Mostrar Examen\n" + //
                        "2. Poner Notas\n" + //
                        "3. Salir");
        return (Integer.valueOf(sc.nextLine()));
    }
    //coneccion
    public static Connection cargarConnection() throws SQLException {
    return DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/examenes",
        "root",
        "toor"
        );
    }
    //cargar alumnos
    public static ArrayList<Alumno> cargaAlumnos(){
        ArrayList<Alumno> lista = new ArrayList<>();
        try(Connection con = cargarConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Alumno"))
            {
            while (rs.next()){
                lista.add(new Alumno(rs.getInt("idAlumno"), rs.getString("nombre")));
            }
            
        }catch(SQLException e){
            System.out.println("error cargarExamen en sql");
            e.printStackTrace();
        }
        return lista;
    }
    //cargar los examenes
    public static ArrayList<Examen> cargaExamenes(){
        ArrayList<Examen> lista = new ArrayList<>();
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examenes","root","toor");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Examen"))
            {
            while (rs.next()){
                
                Examen e = new Examen(rs.getInt("idExamen"), rs.getString("titulo"));
                //
                for (Pregunta pregun : listaPreguntas) {
                    if (pregun.getIdExamen() == e.getIdExamen()) {
                        e.listaP.add(pregun);
                    }
                }
                
                lista.add(e);
            }

        }catch(SQLException e){
            System.out.println("error cargarExamen en sql");
            e.printStackTrace();
        }
        return lista;
    }
    //cargar preguntas
    public static ArrayList<Pregunta> cargaPregunta(){
        ArrayList<Pregunta> lista = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examenes","root","toor");
            Statement st = con.createStatement();

            String sql = "SELECT * FROM Pregunta;";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
               lista.add(new Pregunta(rs.getInt("nPregunta"), rs.getInt("idExamen"), rs.getString("nomPregunta")));
            }
            con.close();
            st.close();
        }catch(SQLException e){
            System.out.println("error cargaPregunta en sql");
            System.err.println(e);
        }catch(Exception e){
            System.out.println("error cargaPregunta");
            System.err.println(e);
        }
        return lista;
    }
    //opcion 1
    public static void mostra(){
        for (Examen examm : listaExamens) {
                System.out.println(examm);
            }
            System.out.println("Dime el id del examen:");
        int iddd = Integer.valueOf(sc.nextLine());
        System.out.println(listaExamens.get(iddd-1).getTitulo());

        for (Examen exa : listaExamens) {
            if (exa.getIdExamen() == iddd) {
                exa.imprimirLista();
            }
        }
    }
    //opcion 2
    public static void poner(){
        int ejemplo1 = 10;
        int ejemplo2 = 1;
        int ejemplo3 = 28;
        try
            (Connection con = cargarConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO Nota (col1, col2, col3) VALUES (?,?,?)")
            ){
            ps.setInt(1, ejemplo1);
            ps.setInt(2, ejemplo2);
            ps.setDouble(3, ejemplo3);
            
            int filas= ps.executeUpdate();

            if (filas >0) {
                System.out.println("Datos insertados correctamente");
                
            }else{
                System.out.println("No se insertaron filas");
            }
            
        }catch(SQLException e){
            System.out.println("error poner en sql");
            e.printStackTrace();
        }
    }
    //IMPORTANTE EL ORDEN. Primero cargo preguntas y luego examenes porque en examenes hago una busqueda
    //en la lista de preguntas(la lista debe estar ya con todas las preguntas para poder buscar)
    static ArrayList<Pregunta> listaPreguntas = cargaPregunta();
    static ArrayList<Alumno> listaAlumnos = cargaAlumnos();
    static ArrayList<Examen> listaExamens = cargaExamenes();
    
    public static void main(String[] args) {
        
        int cas;
        do {
            cas = menu();
            switch (cas) {
                case 1:
                    mostra();
                    break;
                case 2:
                    poner();
                    break;
                case 3:
                    System.out.println("Bye");
                    break;
                default: break;
            }
        } while (cas !=3);   
    }
}
