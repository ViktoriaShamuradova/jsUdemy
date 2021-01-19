package array;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int [] array = new int[] {1, -5, 6, 8, 3};
        int iterationCount=0;

        for(int i=1; i<array.length; i++){
            for(int j=i; j>0&&array[j-1]>array[j]; j--){
                iterationCount++;
                int temp = array[j-1];
                array[j-1]=array[j];
                array[j]=temp;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("length= "+array.length+", iterationCount= "+iterationCount);
    }
}
