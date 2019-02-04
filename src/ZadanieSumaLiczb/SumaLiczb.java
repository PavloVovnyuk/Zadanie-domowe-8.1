package ZadanieSumaLiczb;

public class SumaLiczb {
   static int Calculate(int number){
        boolean isCalk = true;
        int result;
        int result2 = 0;
        while (isCalk) {
            result = number % 10;
            number = (number - result) / 10;
            result2 += result;
            if (number < 1) {
                isCalk = false;
            }
        }
        return result2;
    }
}


