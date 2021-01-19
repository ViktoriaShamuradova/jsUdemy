package крестикиНолики;
//исправить: проверить на пустцю ячейку
public class CheckWinner {
    public static void main(String[] args) {
        char human = 'x';
        char computer = 'o';
        char[][] gameTable = {
                {human, computer, computer},
                {computer, human, human},
                {computer, human, computer}
        };
        char winner = 0;
        //TODO
        OUTER:
        for (int count = 0; count < 1; count++) {
            for (int i = 0; i < gameTable.length; i++) {
                for (int j = 0; j < 1; j++) {
                    winner = gameTable[i][j];
                    for (int k = 1; k < gameTable.length; k++) {
                        if (gameTable[i][k] != winner) {
                            winner = 0;
                            break;
                        }
                    }
                    if (winner != 0) {
                        break OUTER;
                    }
                }
            }
            for (int i = 0; i < gameTable.length; i++) {
                winner = gameTable[i][0];
                for (int j = 1; j < gameTable.length; j++) {
                    if (gameTable[j][i] != winner) {
                        winner = 0;
                        break;
                    }
                }
                if (winner != 0) {
                    break OUTER;
                }
            }
            for (int i = 1; i < gameTable.length; i++) {
                winner = gameTable[0][0];
                if (winner != gameTable[i][i]) {
                    winner = 0;
                    break;
                }
                if (i == gameTable.length - 1) {
                    if (winner == gameTable[i][i]) {
                        break OUTER;
                    } else {
                        winner = 0;
                    }
                }
            }
            int i = 1;
            int j = gameTable.length - 1 - 1;
            while (i != gameTable.length) {
                winner = gameTable[0][gameTable.length - 1];
                if (winner != gameTable[i][j]) {
                    winner = 0;
                    break;
                }
                if (j == 0) {
                    if (winner == gameTable[i][j]) {
                        break OUTER;
                    } else {
                        winner = 0;
                    }
                }
                j--;
                i++;
            }
        }
        if (winner == human) {
            System.out.println("You win");
        } else if (winner == computer) {
            System.out.println("Game over. Computer win");
        } else {
            System.out.println("Drawl");
        }
    }
}
