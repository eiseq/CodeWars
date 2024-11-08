package codewars.kyu7;

public class SquareDigit {
    public int squareDigits(int n) {
        String digits = Integer.toString(n);
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < digits.length(); i++)
        {
            int digit = Character.getNumericValue(digits.charAt(i));
            digit *= digit;
            resultString.append(digit);
        }
        return Integer.parseInt(resultString.toString());
    }
}
