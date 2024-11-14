package codewars.kyu6;

public class DigitalRoot {
    public static int digital_root(int n) {
        int sumOfDigits = 0;
        while (n > 0 || sumOfDigits > 9) {
            if (n == 0) {
                n = sumOfDigits;
                sumOfDigits = 0;
            }
            sumOfDigits += n % 10;
            n /= 10;
        }
        return sumOfDigits;
    }
}
