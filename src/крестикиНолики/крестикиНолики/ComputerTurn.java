package крестикиНолики.крестикиНолики;

import java.util.Random;

import static крестикиНолики.TicTac.*;

public class ComputerTurn {
    static void makeTurn(int number, char player) {
        int i = (number - 1) / 3;
        int j = number - i * 3 - 1;
        table[i][j] = player;
    }

    private static boolean tryWin(char ch) {
        for (int i = 0; i < 3; i++) {
            if (trySetToRow(i, ch)) {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (trySetToCol(i, ch)) {
                return true;
            }
        }
        if (trySetToNotMainDiagonal(ch)) {
            return true;
        }
        if (trySetToMainDiagonal(ch)) {
            return true;
        }
        return false;
    }

    public static boolean trySetToRow(int row, char ch) {
        int res = 0;
        int emptyI = -1;
        int emptyJ = -1;
        for (int j = 0; j < 3; j++) {
            if (table[row][j] == ch) {
                res++;
            } else if (table[row][j] == EMPTY) {
                emptyI = row;
                emptyJ = j;
            }
        }
        return handleTrySetResult(res, emptyI, emptyJ);
    }

    public static boolean trySetToCol(int col, char ch) {
        int res = 0;
        int emptyI = -1;
        int emptyJ = -1;
        for (int i = 0; i < 3; i++) {
            if (table[i][col] == ch) {
                res++;
            } else if (table[i][col] == EMPTY) {
                emptyI = i;
                emptyJ = col;
            }
        }
        return handleTrySetResult(res, emptyI, emptyJ);
    }

    public static boolean trySetToNotMainDiagonal(char ch) {
        int res = 0;
        int emptyI = -1;
        int emptyJ = -1;
        for (int i = 0; i < 3; i++) {
            if (table[i][3 - i - 1] == ch) {
                res++;
            } else if (table[i][3 - i - 1] == EMPTY) {
                emptyI = i;
                emptyJ = 3 - i - 1;
            }
        }
        return handleTrySetResult(res, emptyI, emptyJ);
    }

    public static boolean trySetToMainDiagonal(char ch) {
        int res = 0;
        int emptyI = -1;
        int emptyJ = -1;
        for (int i = 0; i < 3; i++) {
            if (table[i][i] == ch) {
                res++;
            } else if (table[i][i] == EMPTY) {
                emptyI = emptyJ = i;
            }
        }
        return handleTrySetResult(res, emptyI, emptyJ);
    }

    public static int[][] getVariants(int i, int j) {
        if (i == 0) {
            if (j == 0) {
                return new int[][]{{0, 1}, {1, 1}, {1, 0}};
            } else if (j == 1) {
                return new int[][]{{0, 2}, {1, 1}, {0, 0}};
            } else {
                return new int[][]{{1, 2}, {1, 1}, {0, 1}};
            }
        } else if (i == 1) {
            if (j == 0) {
                return new int[][]{{0, 0}, {1, 1}, {2, 0}};
            } else if (j == 1) {
                return new int[][]{{0, 1}, {0, 2}, {1, 2}, {2, 2}, {2, 1}, {2, 0}, {1, 0}, {0, 0}};
            } else {
                return new int[][]{{2, 2}, {1, 1}, {0, 2}};
            }
        } else {
            if (j == 0) {
                return new int[][]{{1, 0}, {1, 1}, {2, 1}};
            } else if (j == 1) {
                return new int[][]{{1, 1}, {2, 2}, {2, 0}};
            } else {
                return new int[][]{{1, 2}, {2, 1}, {1, 1}};
            }
        }
    }

    public static void makeRandomComputerTurn() {
        int[] freeCells = new int[9];
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == EMPTY) {
                    freeCells[count++] = i * 3 + j + 1;
                }
            }
        }
        int index = new Random().nextInt(count);
        makeTurn(freeCells[index], COMPUTER);
    }
}
