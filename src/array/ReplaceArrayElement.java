package array;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceArrayElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 5, 6, 7, 8, 2, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter index");
        int index = scanner.nextInt();
        if (arr == null) {
            System.out.println("Array is empty");
        } else if (arr.length == 1) {
            System.out.println("Is one element in array" + arr[0]);
        } else {
            if (index >= 0 && index < arr.length-1) {
                int newElement;
                if (index == 0) {
                    newElement = arr[1];
                    arr[0] = newElement;
                } else if (index == args.length - 1) {
                    newElement = arr[index - 1];
                    arr[arr.length - 1] = newElement;
                } else {
                    newElement = arr[index - 1] + arr[index + 1];
                    arr[index] = newElement;
                }
            } else {
                System.out.println("Index is unvalid");
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
