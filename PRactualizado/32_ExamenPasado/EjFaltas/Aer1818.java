import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public  class Aer1818{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        while (casos !=0) {
            ArrayList<Integer> lista = new ArrayList<>();
            LinkedHashSet<Integer> repetidos = new LinkedHashSet<>();

            for (int i = 0; i < casos; i++) {
                lista.add(sc.nextInt());
            }
            int numTotalRepes= 0;
            
            for (int i = 0; i < (lista.size()); i++) {
                int ultimaPos = lista.size()-i-1;
                int numExaminar= lista.get(ultimaPos);

                if (!repetidos.contains(numExaminar)) {

                    for (int j = 0; j < ultimaPos; j++) {

                        if (lista.get(j) == numExaminar) {
                            numTotalRepes = numTotalRepes+(ultimaPos-j);
                            break;
                        }
                    }
                }   
                repetidos.add(numExaminar);
            }   
            System.out.println(numTotalRepes);
            casos = sc.nextInt();
        }
    }
}