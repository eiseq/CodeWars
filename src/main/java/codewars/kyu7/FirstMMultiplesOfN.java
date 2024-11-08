package codewars.kyu7;

public class  FirstMMultiplesOfN {
    public static int[] multiples(int m, int n) {
        int[] arr = new int[m];
        for(int i = 0; i < m; i++)
        {
            arr[i] = n * (i + 1);
        }
        return arr;
    }
}
