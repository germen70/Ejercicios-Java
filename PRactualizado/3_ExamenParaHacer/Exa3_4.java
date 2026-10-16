/*sin terminar, NO SE SI ESTA BIEN PORQUE COPIE RAPIDO Y HAY VARIBLES QUE TIENEN OTRO NOMBRE
 * ADEMAS: ENTENDI LOS NUMERO PERO EL BOCATA MENOS VENDIDOS
*/
import java.util.Scanner;

public class Exa3_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dias;
        

        dias = sc.nextInt();
        sc.nextLine(); //lee el caracter "salto de linea"
        //alternativa: dias = Integer.valueOF(sc.next()); esto convierte la cadena en un numero SI ES POSIBLE.
        // RECUERDA QUE NO ES LO MISMO 32 QUE "32"
        //for para contar los dias 
        for (int i = 0; i < dias; i++) {
            
            String tipomas="";
            int suma= 0;
            String tipotargetas = "RAVN";
            
            int bocatamas = 100;
            String bocadillo = "";
            
             
            bocadillo = sc.nextLine();
            //me salto los espacios
            String[] tarjetas = bocadillo.split(" ");
            //  fon bocata.lenght ya tengo las cantidades que se vendio ese dia
            for (int j = 0; j < tarjetas.length; j++) {
                String[] bocata = tarjetas[j].split("-"); //boca[0] es el numero y boca [1] es la letra
                // convertimos en numero 
                int novendidos = Integer.valueOf(bocata[0]);
                int vendidos = 100 - novendidos;
                suma =suma + vendidos;
                String tipo = bocata[1];

                tipotargetas = tipotargetas.replace(tipo,"");

                if (vendidos>bocatamas) {
                    bocatamas = vendidos;
                    tipomas = tipo;
                    
                }
                if(!tipotargetas.isEmpty()){
                    tipo = tipotargetas.substring(0,1);

                }




            }
            suma = suma + ((4-tarjetas.length) *100);
            System.out.println(suma+" "+tipomas);
            
            
        }

    }
}