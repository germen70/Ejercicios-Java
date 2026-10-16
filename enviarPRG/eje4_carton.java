import java.util.ArrayList;

public class eje4_carton {

    public static void main(String[] args) {

        ArrayList<Integer> bolas = new ArrayList<>();

        for (int i = 1; i <= 90; i++) {
           bolas.add(i);
        }

        int[][] carton = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                int pos = (int)(Math.random()*bolas.size());
                int bola = bolas.remove(pos);
                carton[i][j] = bola;
            }
        }

        // Imprimir el cartón
        System.out.println("--------------------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                //System.out.print(carton[i][j] + " ");
                System.out.printf("| %2d ", carton[i][j]);
            }
            System.out.print("|");
            System.out.println();
            System.out.println("--------------------------");
        }
    }
}
