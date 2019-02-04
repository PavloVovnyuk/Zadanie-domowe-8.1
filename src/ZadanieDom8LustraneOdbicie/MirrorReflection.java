
package ZadanieDom8LustraneOdbicie;

import java.util.Arrays;
import java.util.Random;

public class MirrorReflection {

    static void mirrorRefl(int tablica) {
        Random random = new Random ();
        int[] tablica1 = new int[tablica];
        for (int i = 0; i < tablica1.length; i++) {
            tablica1[i] = random.nextInt (10);
        }
        for (int i = 0; i <tablica1.length; i++) {
            System.out.print (tablica1[i]+""+ tablica1[tablica1.length-1-i]);
         }
    }
}

