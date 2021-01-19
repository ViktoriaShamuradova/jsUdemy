package крестикиНолики.крестикиНолики;

import static крестикиНолики.TicTac.*;

public class WinnerChecker {
    static char getWinner() {
        char winner = getWinnerByRows();
        if (winner != NO_WINNER) {
            return winner;
        }
        winner = getWinnerByColumns();
        if (winner != NO_WINNER) {
            return winner;
        }
        winner = getWinnerByNotMainDiagonal();
        if (winner != NO_WINNER) {
            return winner;
        }
        winner = getWinnerBytMainDiagonal();
        if (winner != NO_WINNER) {
            return winner;
        }
        return NO_WINNER;
    }


    public static char getWinnerByRows() {
        for (int i = 0; i < 3; i++) {
            if (table[i][0] == table[i][1] && table[i][1] == table[i][2] && table[i][2] != EMPTY) {
                return table[i][0];
            }
        }
        return NO_WINNER;
    }

    public static char getWinnerByColumns() {
        for (int j = 0; j < 3; j++) {
            if (table[0][j] == table[1][j] && table[1][j] == table[2][j] && table[2][j] != EMPTY) {
                return table[0][j];
            }
        }
        return NO_WINNER;
    }

    public static char getWinnerByNotMainDiagonal() {
        if (table[0][2] == table[1][1] && table[1][1] == table[2][0] && table[2][0] != EMPTY) {
            return table[0][2];
        }
        return NO_WINNER;
    }

    public static char getWinnerBytMainDiagonal() {
        if (table[0][0] == table[1][1] && table[1][1] == table[2][2] && table[2][2] != EMPTY) {
            return table[0][0];
        }
        return NO_WINNER;
    }

    public static boolean isDraw() { //проверяем все ячейки, и если есть пустая, то сразу возвращаем ложь, значит ничьи нету
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
