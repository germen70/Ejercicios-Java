public class VariablesValores {
    public static void main(String[] args) {
        int p = 10, q = -11; //declaramos 2 ints a la vez

        /*float y double es lo mismo a la hora de utilizar valores decimales */
        float y = 13.25f;  //hay que poner una f al final en el float
        float z = -12.22231f;
        double xa = 12.312121;
        double ax = -12.31;
        double raiz1 = 5.5, raiz2 = -1.111; //otra forma de definir variales en la misma linea

        /*para int MUY LARGOS  y hay que poner al final una  "l"*/
        long contador = 99999999999l;
        /*para  int pequeños de -32768 a 32768
         * para byte va desde -128 al 128*/
        short indicador = 19;
        byte valor = 1;

        /*char va desde 0 a 255 (8 bits) */
        char a = 'a'; 
        char b = 'b';
        //se pude declarar numero pero OJO que no valen lo mismo cuando se haga una conversion (tabla astic)
        char ds = '1'; 

        /*con un int se pierde los primeros 0 que tenga el número */

        // "final" significa q es una constante (no puede ser cambiada su valor)
        final double PI = 3.141592;
    }
}
