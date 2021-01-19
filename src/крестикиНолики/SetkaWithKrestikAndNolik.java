package крестикиНолики;

public class SetkaWithKrestikAndNolik {
    public static void main(String[] args) {
        int column = 5;
        int rows = 4;
        char c = ' ';
        for (int k = 0; k < 3; k++) {
            for (int i = 0; i < rows * 2 - 1; i++) {
                for (int j = 0; j < column; j++) {
                    if (i % 2 == 0) {
                        if (j != column - 1) {
                            System.out.print(c + "|");
                        } else {
                            System.out.print(c);
                        }
                    } else {
                        if (j != column - 1) {
                            System.out.print("- ");
                        } else {
                            System.out.print("-");
                        }
                    }
                }
                System.out.println();
            }
            System.out.println();
            c = k == 1 ? '0' : 'x';

        }
    }
}
