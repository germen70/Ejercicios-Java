
class Motor { //parte
    public void encender() {
        System.out.println("Motor encendido");
    }
}

class Automovil { //todo
    private String modelo;
    private Motor motor;

    public Automovil(String modelo) {
        this.modelo = modelo;
        this.motor = new Motor();  // El motor se crea al crear el automóvil
    }

    public void arrancar() {
        System.out.println("Arrancando el automóvil " + modelo);
        motor.encender();  // El automóvil depende del motor
    }
}

// Clase principal
public class Compo2 {
    public static void main(String[] args) {
        // Crear automóvil
        Automovil auto = new Automovil("Toyota Yaris");

        // Arrancar automóvil
        auto.arrancar();
    }
}