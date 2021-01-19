package methods;

public class Factorial {
    public static void main(String[] args) {
        showFactorial(5);
    }

    private static long factorial(int x) {
        long result = 1;
        for (int i = 1; i <= x; i++) {
            result = result * i;
        }
        return result;
    }

    public static void showFactorial(int x) {
        System.out.println(x + "! = " + factorial(x));
    }
}
