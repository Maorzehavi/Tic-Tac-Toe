package TicTacToe;

import static TicTacToe.CheckWin.checkWin;
import static TicTacToe.CheckWinner.checkWinner;
import static TicTacToe.InitBoard.initBoard;
import static TicTacToe.PrintBoard.printBoard;
import static TicTacToe.Admit.admit;

public class Main {
    public static void main(String[] args) {
        char[][] board = initBoard();
        int turn = 1;
        printBoard(board);
        while (!checkWin(board)&&turn<10) {
            if (turn % 2 == 1) {
                System.out.println("Player 1's turn");
                admit(board, 'X');
            } else {
                System.out.println("Player 2's turn");
                admit(board, 'O');
            }
            turn++;
            printBoard(board);
        }
        checkWinner(board, turn);
    }

}
