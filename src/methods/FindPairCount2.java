package methods;
//берем каждое число в массиве и считаем сколько раз это число встречается в массиве,
// когда посчитали сколько, делим на 2.
//подзадача 1 было ли число обработано ранее
 //2 количество чисел в массиве
public class FindPairCount2 {
    public static void main(String[] args) {
        int [] array= new int []{2, 2, 3, 3, 4, 5, 6, 4, 3, 3};
        int result =0;

        for(int i=0; i<array.length; i++){
            int number = array[i];
            if(isNumberNotProcessed(number, array, i)){ //если наше число number в этом масиве начиная с индекса i не обработано
             //то должны посчитать количество пар в массиве
             result+=calcPairCount(number, array, i);
            }
        }
        System.out.println(result);
    }
    //если начиная с индекса массива двигаясь влево и если нашли похожее число, то это признак
    //что число было обработано
    public static boolean isNumberNotProcessed(int number, int [] array, int i){
        if(i>0){
            for(int j=i-1; j>=0; j--){ //-1 чтобы не сравнивали с самим собой идем с текущего элемента влево, был такой элемент или нет
                if(array[j]==number){
                    return false;
                }
            }
        }
        return true;
    }

    public static int calcPairCount(int number, int [] array, int i){
        int count=1;//нашли первый элемент
        for(int j=i+1; j<array.length; j++){
            if(array[j]==number){
                count++;
            }
        }
        return count/2;
    }
}
