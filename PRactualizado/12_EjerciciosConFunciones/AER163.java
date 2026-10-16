//REPASAR PORQUE NO ENTENDI NI EL ENUNIADO DEL PROBLEMA.ESTA MAL COPIADO
// PROBLEMA PARA RESOLVER UN CASO DE SIGUIENTE CASO?
//PROBLEMA DIFICIL POR LO QUE SI NO ENTIENDO, ME VALE CON ENTENDER EL CODIGO (ES UN PROBLEMA FACTORIAL)

import java.util.Scanner;

public class AER163 {
    public static  char siguiente (char c){
        String base = "123456789ABCDEF";
        char nuevo = '0';
        for (int i = 0; i < base.length(); i++) {

            if(base.charAt(i)== c){
                nuevo = base.charAt(i+1);

            }
            
        }

        return nuevo;
    }
    public static  String calcula (String s){
        String base = "123456789ABCDEF";
        String nueva= "";
        boolean noFs = true;

        while(!s.equals("") && noFs){
            char ultimo = s.charAt(s.length()-1); 
            String cadenacorta = s.substring(0,s.length()-1);
            if (ultimo != 'F'){    
                noFs = true;                     // se puede poner directamente if(s.charAt(s.length()-1)){}
                nueva = cadenacorta + siguiente(ultimo); 

            }else{ //NO ENTIENDO EL PORQUE DE ESTE ELSE
                s =  cadenacorta;
                nueva ="0" + nueva;
                nueva =s.substring(0,s.length()-2) + siguiente(ultimo) + 0;
            }
            //SABER COMO USAR .substring()


        }
        if(s.equals("")){ //tambien se puede poner if (noFS){}
            nueva = "1" + nueva;
        }
        
        return nueva;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        while(!s.equals("FIN")){
            System.out.println(calcula(s));

            s = sc.nextLine();
        }
    }
}