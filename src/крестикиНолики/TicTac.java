package крестикиНолики;


import java.util.Random;
import java.util.Scanner;

public class TicTac {
    public static Scanner scanner = new Scanner(System.in);
    public static char NO_WINNER = 0;
    public static char HUMAN = 'x';
    public static char COMPUTER = 'o';

    public static boolean isHuman = true;
    public static char EMPTY = ' ';
    public static char[][] table = new char[][]{
            {EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY}
    };

    public static void main(String[] args) {
        startGame();
        System.out.println("A new game started!");
        while (true) {
            printTable();
            System.out.println("Please type number");
            int number = readHumanTurn();
            if (!handleHumanTurn(number)) {
                break;
            }
        }
    }

    public static void startGame() {
        if (new Random().nextBoolean()) {
            makeRandomComputerTurn();
        }
    }

    private static boolean handleHumanTurn(int number) {//в нужную ячейку устанливаем значение, проверить победителя, проверить есть ли ничья
        makeTurn(number, HUMAN);
        if (getWinner() == HUMAN) {
            System.out.println("Game over: You win!");
            printTable();
            return false;
        }
        if (isDraw()) {
            System.out.println("Game  over: Drawl!");
            printTable();
            return false;
        }
        makeComputerTurn();
        if (getWinner() == COMPUTER) {
            System.out.println("Game over: Computer win!");
            printTable();
            return false;
        }
        if (isDraw()) {
            System.out.println("Game  over: Drawl!");
            printTable();
            return false;
        }
        return true;
    }


    static void makeComputerTurn() {
        if (tryWin(COMPUTER)) {
            return;
        }
        if (tryWin(HUMAN)) {
            return;
        }
        if (tryWinOnNextTurn()) {
            return;
        }
        makeRandomComputerTurn();
    }



    public static boolean handleTrySetResult(int res, int emptyI, int emptyJ) {
        if (res == 2 && emptyI != -1 && emptyJ != -1) {
            table[emptyI][emptyJ] = COMPUTER;
            return true;
        } else {
            return false;
        }
    }


    public static boolean tryWinOnNextTurn() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == COMPUTER) {
                    int[][] variants = getVariants(i, j);
                    int rowIndex = new Random().nextInt(variants.length);
                    for (int k = 0; k < variants.length; k++) {
                        int number = variants[rowIndex][0] * 3 + variants[rowIndex][1] + 1;
                        if (isCellFree(number)) {
                            makeTurn(number, COMPUTER);
                            return true;
                        }
                        rowIndex++;
                        if (rowIndex >= variants.length) {
                            rowIndex = 0;
                        }
                    }
                }
            }
        }
        return false;
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
    static boolean isCellFree(int number) {
        int i = (number - 1) / 3;
        int j = number - i * 3 - 1;
        return table[i][j] == EMPTY;
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
    static void makeTurn(int number, char player) {
        int i = (number - 1) / 3;
        int j = number - i * 3 - 1;
        table[i][j] = player;
    }

    private static int readHumanTurn() { //валидация, проверить, чтобы была пустой ячейка
        while (true) {
            String input = scanner.nextLine();
            if (input.length() != 1 || input.charAt(0) < '1' || input.charAt(0) > '9') {
                System.out.println("Invalid number, should be between 1 and 9");
            } else {
                int number = Integer.parseInt(input);
                if (isCellFree(number)) {
                    return number;
                } else {
                    System.out.println("Cell is not free! Type another number");
                }
            }
        }
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
