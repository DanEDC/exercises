package Section6;

public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(2524));
    }

    public static int getEvenDigitSum(int number) {
        if (number >= 0) {
            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                if (digit % 2 == 0) {
                    sum += digit;
                }
                number = number / 10;
            }
            return sum;
        }
        return -1;
    }
}