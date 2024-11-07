package codewars.kyu8;

public class SquareSum {
    public static int squareSum(int[] n)
    {
        int sum = 0;
        for (int i : n) {
            sum += (int) Math.pow(i, 2);
        }
        return sum;
    }
}
