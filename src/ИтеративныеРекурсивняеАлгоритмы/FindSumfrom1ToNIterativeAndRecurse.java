package ИтеративныеРекурсивняеАлгоритмы;

public class FindSumfrom1ToNIterativeAndRecurse {
    public static void main(String[] args) {
        long t = System.currentTimeMillis();
        int n = 10000;
        System.out.println("iterative: " + iterativeSum(n) + "->" + (System.currentTimeMillis() - t));
        t = System.currentTimeMillis();
        System.out.println("recursive: " + recursiveSum(n) + "->" + (System.currentTimeMillis() - t));
        t = System.currentTimeMillis();
        System.out.println("analitic: " + analiticSum(n) + "->" + (System.currentTimeMillis() - t));
    }

    public static long iterativeSum(long n) {
        long res = 0;
        for (int i = 0; i < n; i++) {
            res += (i + 1);
        }
        return res;
    }
    // -Xss10024m - увеличение памяти для стека


    public static long recursiveSum(long n) {
        if (n == 1) {
            return 1;
        } else {
            return n + recursiveSum(n - 1);
        }

    }

    public static long analiticSum(long n) {
        return ((1 + n) * n) / 2;
    }
}
