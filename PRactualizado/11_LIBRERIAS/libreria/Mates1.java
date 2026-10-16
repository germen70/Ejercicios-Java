package libreria; // Esto aparece porque "Mates1" esta dentro de  la carpeta "libreria"

public class Mates1{
    public static int sumar(int a, int b){ //TANTO "sumar" como "restar"  están bien, 
        int suma;
        suma = a + b;
        return suma;
    }
    public static int restar(int a, int b){ //son dos formas de escribir, utilizar la mas comoda o que entinda
        
        return a - b; 
    }
    public static int mayor(int a, int b){ /*"mayor" y "mayorV2" hacen lo mismo 
    porque en cuanto aparece algun retun, se sale de la funcion*/
        if(a>=b){
            return a;
        }else{
            return b;
        }
    }
    public static int mayorV2(int a, int b){
        if(a>=b){
            return a;
        }
        return b;
        
    }

}