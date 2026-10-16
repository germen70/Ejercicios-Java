import java.util.Scanner;

public class EJReservas {

    public static Scanner sc = new Scanner(System.in);

    public static int menu(){
        System.out.println("1. Alta Vuelo\n"+
                            "2. Alta Pasajero\n"+
                            "3. Reserva Vuelo\n"+
                            "4. Modificar reserva\n"+
                            "5. Baja reserva\n"+
                            "6. Salir\n");

        System.out.print("Elige opcion: ");
        return Integer.valueOf(sc.nextLine());
    }

    public static void altaVuelo(){
        
        System.out.println("Id vuelo");
        String id = sc.nextLine();
        System.out.println("Origen");
        String origen = sc.nextLine();
        System.out.println("Destino");
        String destino = sc.nextLine();
        System.out.println("Fecha");
        String fecha = sc.nextLine();
        System.out.println("Capacidad");
        int capacidad = Integer.valueOf(sc.nextLine());

        Vuelo v = new Vuelo(id,origen,destino,fecha,capacidad);
        v.altaV();

    }

    public static void altaPasajero(){
        
        System.out.println("Id vuelo");
        String id = sc.nextLine();
        System.out.println("Origen");
        String origen = sc.nextLine();
        System.out.println("Destino");
        String destino = sc.nextLine();
        System.out.println("Fecha");
        String fecha = sc.nextLine();
        System.out.println("Capacidad");
        int capacidad = Integer.valueOf(sc.nextLine());

        //Pasajero p = new Vuelo(id,origen,destino,fecha,capacidad);

    }

    public static void reservaVuelo(){
        //Elegir vuelo
        System.out.println(Vuelo.ListaVuelo());
        System.out.println("Elige vuelo");
        String idv = sc.nextLine();

        //Elegir Pasajero
        System.out.println("Id pasajero");
        Integer idp = Integer.valueOf(sc.nextLine());

        //Pedir num asiento
        System.out.println("Num asiento");
        int asiento = Integer.valueOf(sc.nextLine());

        Reserva r = new Reserva(idv, idp, asiento);

        r.addReserva();

    }

    public static void modificaReserva(){
       
        //Elegir Pasajero
        System.out.println("Introduce Id pasajero");
        Integer idp = Integer.valueOf(sc.nextLine());

        System.out.println(Reserva.buscaReserva(idp));
        System.out.println("Elige vuelo");
        String idv = sc.nextLine();
        //Pedir num asiento
        System.out.println("Elige Num asiento nuevo");
        int asiento = Integer.valueOf(sc.nextLine());

        Reserva r = new Reserva(idv, idp, asiento);

        r.updateReserva();

    }
    //sin terminar??
    public static void bajaReserva(){
       
        //Elegir Pasajero
        System.out.println("Introduce Id pasajero");
        Integer idp = Integer.valueOf(sc.nextLine());

        System.out.println(Reserva.buscaReserva(idp));
        System.out.println("Elige vuelo");
        String idv = sc.nextLine();
        //Pedir num asiento
        Reserva.eligeReserva(idv,idp);

    }


    public static void main(String[] args) {

        int op = 0;
        
        do{
            op = menu();
            switch (op) {
                case 1:
                    altaVuelo();
                    break;
                case 2:
                    //altaPasajero();
                    break;
                case 3:
                    reservaVuelo();
                    break;
                case 4:
                    modificaReserva();
                    break;
                case 5:
                    //bajaReserva();
                    break;
                case 6:
                    System.out.println("FIN del PROGRAMA");
                    break;
                default:
                    System.out.println("OPCIÓN NO VALIDA");
                    break;
            }

        }while(op != 6);
        
    }
}