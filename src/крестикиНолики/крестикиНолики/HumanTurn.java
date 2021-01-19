package крестикиНолики.крестикиНолики;

import java.util.Scanner;

import static крестикиНолики.TicTac.table;
import static крестикиНолики.крестикиНолики.GameTable.isCellFree;

public class HumanTurn {
    private static int readHumanTurn() { //валидация, проверить, чтобы была пустой ячейка
        while (true) {
            Scanner scanner = new Scanner(System.in);
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

    static void makeTurn(int number, char player) {
        int i = (number - 1) / 3;
        int j = number - i * 3 - 1;
        table[i][j] = player;
    }

}
