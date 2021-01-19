package array;

public class DisplayPercentageOfNumbersFromArray {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 1, 2, 2, 3};

        int processedElements[] = new int[arr.length];
        int elementsCount[] = new int[arr.length];
        int count = 0;

        for(int i=0; i<arr.length; i++){
            int value=arr[i];

            boolean processed=false;
            for(int j=0; j<count; j++){
                if(processedElements[j]==value){
                    processed=true;
                    break;
                }
            }
            if(!processed){
                //считаем количество одинаковых элементов
                int number=1;
                for(int j=i+1; j<arr.length; j++){
                    if(value==arr[j]){
                       number++;
                    }
                }
                //заполняем массивы и увел счетчик чисел(счетчик чисел используем как тек индекс в массивах
                processedElements[count]=value;
                elementsCount[count]=number;
                count++;
            }
        }
        for(int j=0; j< count; j++){
            System.out.println(processedElements[j]+"="+(elementsCount[j]*100/arr.length)+"%");
        }
    }
}
