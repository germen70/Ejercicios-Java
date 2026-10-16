import java.util.Scanner;

public class AER411ConFunciones {

    static Scanner sc = new Scanner(System.in);  /*si yo coloco esto, ya no hará falta poner el escaner en el main
    y en las funciones ya que el scanner es global*/

    public static int calculaElefantes(int pesomaximo){  /*lo que se pone entre parentesis es una variable de la funcion
        no de main*/
        //Scanner sc = new Scanner(System.in);
        
        int elefante = sc.nextInt();
        int sumaelefante = 0;
        int numeroelefante = 0; //contador

        while (elefante !=0){
            sumaelefante = sumaelefante + elefante;
            if (sumaelefante <= pesomaximo){
                numeroelefante++;
            }
            elefante = sc.nextInt();

        }
        


        return numeroelefante;

    }

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int peso = sc.nextInt();

        while(peso != 0){
            System.out.println(calculaElefantes(peso));


            
            peso = sc.nextInt();
        }
    }
}