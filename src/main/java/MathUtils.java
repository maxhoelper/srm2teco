public class MathUtils {
    public static int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative number");
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}