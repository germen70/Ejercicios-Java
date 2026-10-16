package EjFaltas;
//
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class EJ3 {
    static Scanner sc = new Scanner(System.in);

    public static int menu(){
        
        System.out.println("1. Alta Alumno/a\n" + //
                        "2. Alta Nueva Sesion\n" + //
                        "3. Introducir falta\n" + //
                        "4. Salir");
        return (Integer.valueOf(sc.nextLine()));
    }
    public static void altaAlumno(){
        System.out.println("NIA");
        String nia = sc.nextLine();
        System.out.println("NOMBRE");
        String nombre = sc.nextLine();
        System.out.println("EDAD");
        int edad = Integer.valueOf(sc.nextLine());
        listaAlumnos.add(new Alumno(nia, nombre, edad));

        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FaltasDAW","root","toor");
            Statement st = con.createStatement();
            String sql = "INSERT INTO Alumnos (NIA, Nombre, Edad) VALUES ('"+nia+"', '"+nombre+"', "+edad+");";
            
            int filas= st.executeUpdate(sql);
            if (filas > 0){
                System.out.println("Alumno/a añadido con exito");
            }else{
                System.out.println("Alumno/a no añadida");
            }
            
            con.close();
            st.close();
        }catch(SQLException e){
            System.out.println("error altaAlumno");
            System.err.println(e);
        }
    }
    public static void altaSesion(){
        int mes;
        do {
            System.out.println("INTRODUCE MES");
            mes = Integer.valueOf(sc.nextLine());
            
        } while (mes<1 || mes>12);
        int dia;
        do {
            System.out.println("INTRODUCE DIA");
            dia = Integer.valueOf(sc.nextLine());
        } while (dia<1 || dia>31);
        int sesion;
        do {
            System.out.println("INTRODUCE SESION");
            sesion = Integer.valueOf(sc.nextLine());
        } while (sesion<1 || sesion>13);
        
        System.out.println("MODULO");
        String modulo = sc.nextLine();

        String cod =""+String.format("%02d", mes)+String.format("%02d", dia)+String.format("%02d", sesion);

        listaSesion.add(new Sesion(cod,modulo));

        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FaltasDAW","root","toor");
            Statement st = con.createStatement();
            String sql = "INSERT INTO Sesiones VALUES ('"+cod+"', '"+modulo+"');";
            
            int filas= st.executeUpdate(sql);
            if (filas > 0){
                System.out.println("Sesion añadida con exito");
            }else{
                System.out.println("Sesion no añadida");
            }
            
            con.close();
            st.close();
        }catch(SQLException e){
            System.out.println("error altaSesion");
            System.err.println(e);
        }
    }
    public static void anyadirFaltas(int num, String ses, int tip, boolean just){

        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FaltasDAW","root","toor");
            Statement st = con.createStatement();
            
            String sql = "INSERT INTO Faltas (NumAlumno, IdSesion, Tipo, Just) VALUES ("+num+", '"+ses+"', "+tip+","+just+") ;";
            
            int filas= st.executeUpdate(sql);
            if (filas > 0){
                System.out.println("Falta añadida con exito");
            }else{
                System.out.println("Falta no añadida no añadida");
            }
            
            con.close();
            st.close();
        }catch(SQLException e){
            System.out.println("error altaAlumno");
            System.err.println(e);
        }
    }
    public static ArrayList<Alumno> cargarAlumnos(){
        ArrayList<Alumno> lista = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FaltasDAW","root","toor");
            Statement st = con.createStatement();

            String sql = "SELECT * FROM Alumnos";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){

                lista.add(new Alumno(rs.getInt("NumAlumno"),rs.getString("NIA"), rs.getString("Nombre"),rs.getInt("Edad")));
            }
            con.close();
            st.close();
        }catch(SQLException e){
            System.out.println("error cargarAlumnos");
            System.err.println(e);
        }
        return lista;
    }
    public static ArrayList<Sesion> cargarSesion(){
        ArrayList<Sesion> lista = new ArrayList<>();
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FaltasDAW","root","toor");
            Statement st = con.createStatement();

            String sql = "SELECT * FROM Sesiones";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next() ){
                
                lista.add(new Sesion(rs.getString("IdSesion"), rs.getString("Modulo")));
            }
            con.close();
            st.close();
        }catch(SQLException e){
            System.out.println("error cargarSesion");
            System.err.println(e);
        }
        return lista;
    
    }
    static ArrayList<Alumno> listaAlumnos = cargarAlumnos();
    static ArrayList<Sesion> listaSesion = cargarSesion();
    public static void main(String[] args) {
        
        int cas;
        do {
            cas = menu();
            switch (cas) {
                case 1:
                    altaAlumno();

                    break;
                case 2:
                    altaSesion();
                    break;
                case 3:
                    for (Alumno alu : listaAlumnos) { 
                        System.out.println(alu);
                    }
                    int num = sc.nextInt();
                    sc.nextLine();
                    for (Sesion ses : listaSesion) {
                        System.out.println(ses);
                    }
                    String ses = sc.nextLine();
                    System.out.println("Elige: 1(Falta) | 2(Retraso)");
                    int tipo = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Justificante: 0(NO) | 1(SI)");

                    int jus = sc.nextInt();
                    sc.nextLine();
                    boolean justificante = false;
                    if(jus==1){
                        justificante = true;
                    }
                    anyadirFaltas(num, ses, tipo, justificante);
                    
                    break;
                default: break;
            }
        } while (cas !=4);
        
    }
}