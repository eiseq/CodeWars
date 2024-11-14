package codewars.kyu6;

public class NumberInExpandedForm {
    public static String expandedForm(int num)
    {
        StringBuilder result = new StringBuilder();
        String numberStr = Integer.toString(num);
        String[] digits = numberStr.split("");

        for (int i = 0; i < digits.length; i++)
        {
            int digit = Integer.parseInt(digits[i]);
            if (digit != 0)
            {
                result.append(digit);
                result.append("0".repeat(digits.length - 1 - i));
                boolean hasMoreNonZero = false;
                for (int j = i + 1; j < digits.length; j++)
                {
                    if (Integer.parseInt(digits[j]) != 0)
                    {
                        hasMoreNonZero = true;
                        break;
                    }
                }
                if (hasMoreNonZero)
                {
                    result.append(" + ");
                }
            }
        }
        return result.toString();
    }
}
