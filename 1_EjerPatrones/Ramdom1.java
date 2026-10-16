/*Ejercicio donde se utiliza: Math.random() */
public class Ramdom1 {

    public static void main(String[] args) {
        
        int n = 0;
        int suma = 0;
        
        for (int i = 1; i <= 3; i++) {
            /* Math.random(): genera numeros aleatorios entre el 0 y el 0.9999
             * Math.random() * 6:genera numeros aleatorios entre el 0 y el 0.599999
             * Math.random() * 6 + 1:genera numeros aleatorios entre el 1 y el 5.9999
             * (int)(Math.random() * 6 + 1):genera numeros aleatorios entre el 1 y el 6
            */
            int nAleatorio = (int)(Math.random() * 6 + 1);
            System.out.println(i+"º lanzamiento: "+nAleatorio);
        
            suma = suma+ nAleatorio;
            
        }
        System.out.println("Total: "+suma);
    }
}