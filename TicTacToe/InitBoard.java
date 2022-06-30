package TicTacToe;

public class InitBoard {
    public static char[][] initBoard() {
        char[][] board = new char[3][3];
        char temp = '1';
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = temp++;
            }
        }
        return board;
    }
}
