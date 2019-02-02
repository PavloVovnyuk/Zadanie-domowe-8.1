package ZadanieSumaLiczb;

public class Main {
    public static void main(String[] args) {
        boolean isCalk = true;
        int result;
        int number = 1999;
        int result2 = 0;
        while (isCalk) {
            result = number % 10;
            number = (number - result) / 10;
            result2 += result;
            if (number < 1) {
                isCalk = false;
            }
        }
        System.out.println (result2);
    }
}


