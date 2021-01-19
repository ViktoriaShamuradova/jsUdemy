package крестикиНолики;

public class CheckWinner2 {
    public static void main(String[] args) {
        char human = 'x';
        char computer = 'o';
        char emty = ' ';
        char[][] gameTable = {
                {human, computer, computer},
                {computer, human, computer},
                {computer, human, computer}
        };
        char winner = 0;
        //check rows
        for (int i = 0; i < 3; i++) {
            if (gameTable[i][0] == gameTable[i][1] && gameTable[i][1] == gameTable[i][2] && gameTable[i][2] != emty) {
                winner = gameTable[i][0];
                break;
            }
        }
        if (winner == 0) {
            //check columns
            for (int j = 0; j < 3; j++) {
                if (gameTable[0][j] == gameTable[1][j] && gameTable[1][j] == gameTable[2][j] && gameTable[2][j] != emty) {
                    winner = gameTable[0][j];
                    break;
                }
            }
            if (winner == 0) {
                //check not main diagonal
                if (gameTable[0][2] == gameTable[1][1] && gameTable[1][1] == gameTable[2][0] && gameTable[2][0] != emty) {
                    winner = gameTable[0][2];
                } else { //check main diagoal
                    if (gameTable[0][0] == gameTable[1][1] && gameTable[1][1] == gameTable[2][2] && gameTable[2][2] != emty) {
                        winner = gameTable[0][0];
                    }

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
}
