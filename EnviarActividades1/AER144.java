import java.util.Scanner;

public class AER144 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        - INICIO
        + FIN
        * VA A LA DERECHA
        3 BORRA (LO DE LA DERECHA) */
        while (sc.hasNext()) {
            String pulsaciones = sc.nextLine();
            char [] letras = new char[pulsaciones.length()];
            

            for (int i = 0; i < letras.length; i++) {
                letras[i] = pulsaciones.charAt(i);
            }

            String palabra = "";
            Boolean finala = true;
            int raton = 0;
            for (int i = 0; i < letras.length; i++) {
                
                if(letras[i] == '3' || letras[i] == '*' ||letras[i] == '+' ||letras[i] == '-'){

                    if(letras[i] == '-'){//va al inicio
                        finala = false;
                        raton = 0;
                    }
                    if(letras[i] == '+'){//va al final
                        finala = true;
                        raton = 0;
                    }
                    if(letras[i] == '*'){//va a la derecha
                        raton++;
                    }
                    if(letras[i] == '3'){//borra lo de la derecha
                     //(desde donde emieza(si incluye), donde acaba(no incluye)) (donde emieza(si incluye)(va hasta el final))   
                        palabra = palabra.substring(0, raton) + palabra.substring(raton + 1); 
                        
                    }
                }else{
                    if(finala){
                        
                        palabra = palabra+letras[i];
                        
                    }else{
                        if (raton == 0) {
                            System.out.println(palabra);
                            palabra = letras[i]+palabra;
                            raton++;
                            System.out.println(palabra);
                        }else{
                            palabra = palabra.substring(0, raton)+letras[i] + palabra.substring(raton); 
                            raton++;
                        }
                    }
                }
            }
            System.out.println(palabra);
        }
    }
}