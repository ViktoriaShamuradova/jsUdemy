package array;

import java.util.Arrays;

public class Bubble2 {
    public static void main(String[] args) {
        int[] array = new int[]{1, -5, 6, 8, 3};

        int iterationCount = 0;
        int firstIndex = 0;
        while (true) {
            boolean swap = false;
            for (int i = array.length - 1; i > firstIndex; i--) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    swap = true;
                }
                iterationCount++;
            }
            if (swap) {
                firstIndex++;
            } else {
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
