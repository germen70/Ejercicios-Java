import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Eje2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();sc.nextLine();

        TreeSet <Integer> sete = new TreeSet<>(); //cambio a listas para poder usar el Collections.sort()
        List<Integer> set = new ArrayList<>(sete);

        for (int i = 0; i < casos; i++) {
            set.clear();

            int panel = sc.nextInt();
            set.add(panel);
            int manolin = sc.nextInt();
            set.add(manolin);
            int gente = sc.nextInt();

            while (gente != -1) {
                set.add(gente);

                gente = sc.nextInt();

            }
           Collections.sort(set);

           int pospanel = set.indexOf(panel);
           int posmanolin = set.indexOf(manolin);

           
            int solucion = 0;
            if(panel < manolin){
                solucion = posmanolin-pospanel-1;
                
            }else{
                solucion = (set.size()-1-pospanel)+posmanolin;
                
            }
            System.out.println(solucion);

        }

    }
}