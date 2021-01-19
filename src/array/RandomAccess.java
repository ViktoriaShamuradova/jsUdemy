package array;

public class RandomAccess {
    public static void main(String[] args) {
        int [][] array = new int[9][9]; //нужно заполнить значение на главной диагонали 1, на второстепенной 2
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                int value=0;
                if(i==j){
                   value=1;
                }
                else if(i==array.length-j-1){
                    value=2;
                }
                else {
                    value=0;
                }
                array[i][j]=value;
            }
        }
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}