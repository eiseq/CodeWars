package codewars.kyu5;

public class WeightForWeight {
    public static String orderWeight(String strng) {
        if (strng == null || strng.trim().isEmpty()) {
            return "";
        }
        String[] weights = strng.trim().split("\\s+");
        selectionSort(weights);
        return String.join(" ", weights);
    }

    private static void selectionSort(String[] weightsArray) {
        for (int i = 0; i < weightsArray.length - 1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < weightsArray.length; j++) {
                if (compare(weightsArray[j], weightsArray[smallestIndex]) < 0) {
                    smallestIndex = j;
                }
            }
            String temp = weightsArray[i];
            weightsArray[i] = weightsArray[smallestIndex];
            weightsArray[smallestIndex] = temp;
        }
    }

    private static int compare(String weightA, String weightB) {
        int weightSumA = calculateWeight(weightA);
        int weightSumB = calculateWeight(weightB);
        if (weightSumA == weightSumB) {
            return weightA.compareTo(weightB);
        }
        return Integer.compare(weightSumA, weightSumB);
    }

    private static int calculateWeight(String weight) {
        int sum = 0;
        for (int i = 0; i < weight.length(); i++) {
            sum += Character.getNumericValue(weight.charAt(i));
        }
        return sum;
    }
}
