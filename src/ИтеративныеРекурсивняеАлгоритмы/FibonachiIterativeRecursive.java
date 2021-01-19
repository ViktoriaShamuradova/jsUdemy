package ИтеративныеРекурсивняеАлгоритмы;

public class FibonachiIterativeRecursive {
    public static void main(String[] args) {
        System.out.println(iterative(5));
        System.out.println(recursive(5));
        System.out.println(iterative(15));
        System.out.println(recursive(15));
    }

    public static int iterative(int index) {
        if(index == 0 || index == 1) {
            return 1;
        }
        int prev0 = 1;
        int prev1 = 1;
        int next = prev0 + prev1;
        for (int i = 2; i < index; i++) {
            prev0 = prev1;
            prev1 = next;
            next = prev0 + prev1;
        }
        return next;
    }

    public static int recursive(int index) {
        if(index == 0 || index == 1) {
            return 1;
        } else {
            return recursive(index - 1) + recursive(index - 2);
        }
    }
}
