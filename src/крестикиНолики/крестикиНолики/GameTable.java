package крестикиНолики.крестикиНолики;

import static крестикиНолики.TicTac.EMPTY;
import static крестикиНолики.TicTac.table;

public class GameTable {
    static boolean isCellFree(int number) {
        int i = (number - 1) / 3;
        int j = number - i * 3 - 1;
        return table[i][j] == EMPTY;
    }

    public static void printTable() {
        for (int j = 0; j < table.length; j++) {
            printGameFiguraWithVerticalLine(j);
            if (j != table.length - 1) {
                printGorizontalLine();
            }
        }
        System.out.println();
    }

    public static void printGameFiguraWithVerticalLine(int j) {
        for (int k = 0; k < table.length; k++) {
            System.out.print(" " + table[j][k]);
            if (k != table.length - 1) {
                System.out.print(" |");
            }
        }
        System.out.println();
    }

    public static void printGorizontalLine() {
        for (int k = 0; k < table.length; k++) {
            System.out.print("---");
            if (k != table.length - 1) {
                System.out.print("-");
            }
        }
        System.out.println();
    }
}
