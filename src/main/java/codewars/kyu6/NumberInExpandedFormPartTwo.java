package codewars.kyu6;

public class NumberInExpandedFormPartTwo {
    public static String expandedForm(double num) {
        StringBuilder result = new StringBuilder();
        String numberStr = Double.toString(num);
        String[] parts = numberStr.split("\\.");
        String leftDigits = parts[0];
        String rightDigits = parts[1].equals("0") ? "" : parts[1];
        for (int i = 0; i < leftDigits.length(); i++) {
            int digit = Character.getNumericValue(leftDigits.charAt(i));
            if (digit != 0) {
                result.append(digit);
                result.append("0".repeat(leftDigits.length() - 1 - i));
                if (i < leftDigits.length() - 2 || !rightDigits.isEmpty()) {
                    result.append(" + ");
                }
                else
                {
                    return result.toString();
                }
            }
        }
        for (int i = 0; i < rightDigits.length(); i++) {
            int digit = Character.getNumericValue(rightDigits.charAt(i));
            if (digit != 0) {
                result.append(digit);
                result.append("/1");
                result.append("0".repeat(i + 1));
                if (i < rightDigits.length() - 1) {
                    result.append(" + ");
                }
            }
        }
        return result.toString();
    }
}
