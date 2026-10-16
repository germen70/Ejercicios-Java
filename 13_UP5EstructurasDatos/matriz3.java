/*IMPORTANTE REPASAR
 * AER151 */

import java.util.Scanner;

public class matriz3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caso = sc.nextInt();
        
        while (caso !=0) {
            
            int[][]m1 = new int[caso][caso];
            
            for (int i = 0; i < m1.length; i++) {

                for (int j = 0; j < m1.length; j++) {
                    
                    m1[i][j] = sc.nextInt();
                }    
            }
            boolean iden = true;
           for (int i = 0; i < m1.length; i++) {

                for (int j = 0; j < m1.length; j++) {
                    
                    if(i ==j){
                        if(m1[i][j] != 1){
                            iden = false;

                        }
                    }else{
                        if (m1[i][j] != 0){
                            iden = false;
                        }
                    }
                }    
            }
            if(iden){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
            
            caso = sc.nextInt();
            
        }
    }
}