
package ZadanieDom8LustraneOdbicie;

import java.util.Arrays;
import java.util.Random;

public class MirrorReflection {

    static int[] mirrorRefl(int size) {
        Random random = new Random ();
        int[] tablica1 = new int[size];
        for (int i = 0; i < tablica1.length; i++) {
            tablica1[i] = random.nextInt (10);
        }
        int [] tablica2 = new int[size*2];
        for (int i = 0; i < tablica1.length; i++) {
            tablica2[i]=tablica1[i];
            tablica2[tablica2.length-i-1]=tablica1[i];
        }
        return tablica2;
    }

}


