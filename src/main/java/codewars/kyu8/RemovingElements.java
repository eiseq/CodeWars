package codewars.kyu8;

public class RemovingElements {
    public static Object[] removeEveryOther(Object[] arr) {
        int size = arr.length / 2 + (arr.length % 2);
        Object[] resultArray = new Object[size];
        int index = 0;
        for (int i = 0; i < arr.length; i += 2)
            resultArray[index++] = arr[i];
        return resultArray;
    }
}
