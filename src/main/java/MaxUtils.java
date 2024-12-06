public class MaxUtils {
    public static int findMax(int[] array) {
        if (array == null || array.length == 0) throw new IllegalArgumentException("Array is empty or null");
        int max = array[0];
        for (int num : array) {
            if (num > max) max = num;
        }
        return max;
    }
}