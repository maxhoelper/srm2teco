import java.util.Arrays;

public class ArrayUtils {
    public static int[] sortArray(int[] array) {
        if (array == null) return null;
        int[] copy = Arrays.copyOf(array, array.length);
        Arrays.sort(copy);
        return copy;
    }
}