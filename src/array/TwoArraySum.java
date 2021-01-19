package array;

public class TwoArraySum {
    public static void main(String[] args) {
        int arr1[] = new int[]{0, 1, 2, 3};
        int arr2[] = new int[]{0, 1, 3};

        int sum = 0;
        for (int i = 0; i < arr1.length && i < arr2.length; i++) {
            sum+=arr1[i]+arr2[i];
        }
       if(arr1.length!=arr2.length){
           int[] array;
           int min;
           int max;
           if(arr1.length>arr2.length){
               array=arr1;
               min=arr2.length;
               max=arr1.length;
           }else{
               array=arr2;
               min=arr1.length;
               max=arr2.length;
           }
           for(int i=min; i<max; i++){
               sum+=array[i];
           }
       }
        System.out.println(sum);
    }
}
