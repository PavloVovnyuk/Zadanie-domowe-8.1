package ZadanieDodatkowe;

public class ArrayComparator {


    static boolean compare(int[] tabl, int[] tab2) {
        for (int i = 0; i < tabl.length; i++) {
            if (tabl.length != tab2.length) {
                return false;
            }
            while (tabl[i] != tab2[i]) {
                return false;
            }
        }
        return true;
    }
}
