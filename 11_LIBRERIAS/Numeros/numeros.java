package Numeros;
public class numeros{

    public static int potencia(int base, int expon){
    int resultado = 1;
    for (int i = 0; i < expon; i++) {
        resultado = resultado *base;
    }
    return resultado;
    }
    
    public static int cuentaDigitos (int a){
        
        String numer = String.valueOf(a);
        int digit = 0;
        for (int i = 0; i < numer.length(); i++) {
            digit = digit++;
            
        }
    
        return digit;
        
    }
    public static int volteaNum (int a){
        
        String cadena = String.valueOf(a);
        // NO String[] cadenaV2 = cadena.split(" ");
        String cade = "";

        
        //OJO A ESTO: añadimos por la derecha pero de forma inversa, primero el utlimo hasta el primero
        for (int i = cadena.length()-1; i >= 0; i--) {
            // cade = cadena.concat[i];
            cade =cade + cadena.charAt(i); //añadimos por la derecha (el primero sera 0, el segundo 1etc.)
            
        }
        /*LO PODRIAMOS HABER AÑADIDO POR LA IZQUIERDA EN VEZ DE LA DERECHA. OJO: lo recorreriamos de forma normal
        for (int i = 0; i < cadena.lenght; i++) {
            // cade = cadena.concat[i];
            cade =cadena.charAt(i) + cade; //añadimos por la izquierda (el primero sera 0, el segundo será 0 y el primero 1,etc)
            
        }*/
        int caf = Integer.valueOf(cade); //no se si esta bien eh
        return caf; 
        
    }

    //no esta ni terminado, ni corregido
    public static int esPrimo (int a){ //se puede hacer con un for
        int div = 2;
        boolean primo = true;
        while(primo && div <=a / 2){ //lo de a/2 son cosas matematicas. sirve para ahorrar casos

            if (a %div == 0){
                primo = false;
    
            }
            div++; //esto esta bien?
        }
        return primo;
        
    }
    public static int siguientePrimo(int a){ //esta es una manera de hacerlo
        boolean salir = false;
        do{
            a++; //al numero le sumamos 1
            if(esPrimo(a)){ //al numero lo pasamos por la funcion de arriba, si cumple entra dentro del if
                salir = true;
            }
        }while(salir); //solo salimos del bucle cuando entra dentro del if (salir se convierte en true)
        return a;
    }

    public static int uneNumeros(int a, int b){
        //asi lo hariamos sin usar cadenas y usando las funciones que ya creamos antes
        int c = cuentaDigitos(b); //contamos los digitos que tiene b
        int p = potencia(10, c);    //hacemos la potencia
        int resultado = a *p + b; //sumamos a + la potencia elevada a los digitos que tiene b y sumamos b
        return resultado;
        
        
        //return Integer.valueOf(String.valueOf(a)+String.valueOf(b)); //asi lo hariamos con cadenas en una sola linea
        
    }

}