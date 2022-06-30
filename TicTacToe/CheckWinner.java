package TicTacToe;

import static TicTacToe.CheckWin.checkWin;

public class CheckWinner {
    public static void checkWinner(char[][] board, int turn) {
        if (checkWin(board)) {
            if (turn % 2 == 1) {
                System.out.println("Player 2 wins");
            } else {
                System.out.println("Player 1 wins");
            }
        } else {
            System.out.println("Draw");
        }
    }
}
