package codewars.kyu4;

public class Interval {
    public static int sumIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        selectionSort(intervals);
        int totalLength = 0;
        int currentStart = intervals[0][0];
        int currentEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int intervalStart = intervals[i][0];
            int intervalEnd = intervals[i][1];
            if (intervalStart <= currentEnd) {
                currentEnd = Math.max(currentEnd, intervalEnd);
            } else {
                totalLength += currentEnd - currentStart;
                currentStart = intervalStart;
                currentEnd = intervalEnd;
            }
        }
        totalLength += currentEnd - currentStart;
        return totalLength;
    }

    private static void selectionSort(int[][] intervals) {
        for (int i = 0; i < intervals.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[j][0] < intervals[minIndex][0]) {
                    minIndex = j;
                }
            }
            int[] temp = intervals[i];
            intervals[i] = intervals[minIndex];
            intervals[minIndex] = temp;
        }
    }
}
