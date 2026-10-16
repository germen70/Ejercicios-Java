    import java.util.*;

    public class p826 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            while (sc.hasNext()) {
                int n = sc.nextInt();

                int[] array = new int[n];
                for (int i = 0; i < array.length; i++) {
                    array[i] = sc.nextInt();
                }

                int grupos = 1;

                int ini = array[n-1];

                for (int i = n-2; i >= 0; i--) {
                    int sig = array[i];
                    if (ini >= sig) {
                        ini = sig;
                        grupos++;
                    }
                }
                System.out.println(grupos); 
            }
        }
    }

    