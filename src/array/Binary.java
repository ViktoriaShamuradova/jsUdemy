package array;

public class Binary {
    public static void main(String[] args) {
        int[] array = {0, 2, 4, 5, 9, 13, 15, 20};
        int find = 5;
        int index=-1;
        int start = 0;
        int end = array.length - 1;
        int middle = (start + end) / 2;
        while (start <= end) {
            if (find < array[middle]) {
                end = middle - 1;
                middle = (start + end) / 2;
            }
            if (find > array[middle]) {
                start = middle + 1;
                middle = (start + end) / 2;
            }
            if(find==array[middle]){
                index=middle;
                break;
            }
        }
        System.out.println(index);

    }
}
