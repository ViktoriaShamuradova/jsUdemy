package array;

import java.util.Arrays;

public class MaxMinSwap {
    public static void main(String[] args) {
        int arr[] = new int[]{5, 9, -15, 3, 0, -5};
        int max = 0;
        int min = 0;
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexMax=i;
            }
            if (arr[i] < min) {
                min = arr[i];
                indexMin=i;
            }
        }
        arr[indexMax]=min;
        arr[indexMin]=max;
        System.out.println(max + " " + min);
        System.out.println(Arrays.toString(arr));
    }
}
