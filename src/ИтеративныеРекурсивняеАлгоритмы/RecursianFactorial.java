package ИтеративныеРекурсивняеАлгоритмы;

public class RecursianFactorial {
    public static long factorial(int n) {
        if(n <= 1 ) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        long res = factorial(6);
        System.out.println(res);
    }

}
