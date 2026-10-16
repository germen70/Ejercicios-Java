//importante: como crear matrices

import java.util.Arrays;

public class matriz2 {

    public static void main(String[] args) {
        int fila = 3;
        int columna =3;
        int[][]m1 = new int[fila][columna];

        
        for (int i = 0; i < m1.length; i++) {

            for (int j = 0; j < m1.length; j++) {
                
                m1[i][j] =(i*3)+j+1; //se multiplica *3 porque el tamaño de la array es 3
                
                System.out.print(m1[i][j]+" ");
            }
            System.out.println();
        }

    }
}