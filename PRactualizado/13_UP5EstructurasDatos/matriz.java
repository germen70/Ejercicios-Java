//importante: como crear matrices

import java.util.Arrays;

public class matriz {

    public static void main(String[] args) {
        int fila = 3;
        int columna =3;
        int[][]m1 = new int[fila][columna];

        System.out.println(Arrays.toString(m1[0]));
        System.out.println(Arrays.toString(m1[0]));
        System.out.println(Arrays.toString(m1[0]));
        System.out.println(m1[2][2]);

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {

                m1[i][j] = (int) (Math.random()*9)+1;
                System.out.print(m1[i][j]+" ");
            }
            System.out.println();
        }

    }
}