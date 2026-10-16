//REPASAR LO DEL MATH.RAMDOM

import libreria.Mates1; //OJO TENEMOS QUE IMPORTAR LA LIBRERIA PARA PODER USAR LAS FUNCIONES DE ESA LIBRERIA
/*OJO: si compilamos este programa (javac Ejemplo1.java) tenemos que tener compilada la libreria tambien,
 * sino da error. Cuando compilemos, la libreria tambien se compila si tenemos el "import"
*/

public class Ejemplo1{
    public static void main(String[] args) {
        int a =(int) (Math.random() * 10) + 1;
        int b =(int) (Math.random() * 10) + 1;

        System.out.println("los números aleatorios son "+a+" y "+b);
        System.out.println(Mates1.sumar(a, b));
        System.out.println(Mates1.restar(a, b));
        System.out.println(Mates1.mayor(a, b));
        System.out.println(Mates1.mayorV2(a, b));



    }
}