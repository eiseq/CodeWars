package codewars.kyu4;

import java.util.ArrayList;
import java.util.List;

public class SnailSort {
    public static int[] snail(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        List<Integer> resultList = new ArrayList<>();
        int topRow = 0;
        int bottomRow = matrix.length - 1;
        int leftColumn = 0;
        int rightColumn = matrix[0].length - 1;
        while (topRow <= bottomRow && leftColumn <= rightColumn) {
            for (int column = leftColumn; column <= rightColumn; column++) {
                resultList.add(matrix[topRow][column]);
            }
            topRow++;
            for (int row = topRow; row <= bottomRow; row++) {
                resultList.add(matrix[row][rightColumn]);
            }
            rightColumn--;
            if (topRow <= bottomRow) {
                for (int column = rightColumn; column >= leftColumn; column--) {
                    resultList.add(matrix[bottomRow][column]);
                }
                bottomRow--;
            }
            if (leftColumn <= rightColumn) {
                for (int row = bottomRow; row >= topRow; row--) {
                    resultList.add(matrix[row][leftColumn]);
                }
                leftColumn++;
            }
        }
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        return resultArray;
    }
}
