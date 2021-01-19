package array;

public class Hourglass {
    public static void main(String[] args) {
        int col = 16;
        int row = 7;


        for (int j = 0; j < row; j++) {
            int value = j < row / 2 ? j + 1 : row - j;
            int shift = j < row / 2 ? j * 2 : (row - j - 1) * 2;
            for (int i = 0; i < shift; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < col - shift * 2; i++) {
                System.out.print(value);
            }
//            for(int i=0; i<shift; i++){
//                System.out.print(" ");
//            }
            System.out.println();
        }
    }
}
