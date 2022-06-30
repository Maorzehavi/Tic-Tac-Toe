package TicTacToe;

import java.util.Scanner;

public class Admit {
    public static void admit(char[][] board, char player) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 9");
        int number = input.nextInt();
        switch (number) {
            case 1:
                if (board[0][0] == '1') {
                    board[0][0] = player;
                } else {
                    System.out.println("This space is taken");
                    admit(board, player);
                }
                break;
            case 2:
                if (board[0][1] == '2') {
                    board[0][1] = player;
                } else {
                    System.out.println("This space is taken");
                    admit(board, player);
                }
                break;
            case 3:
                if (board[0][2] == '3') {
                    board[0][2] = player;
                } else {
                    System.out.println("This space is taken");
                    admit(board, player);
                }
                break;
            case 4:
                if (board[1][0] == '4') {
                    board[1][0] = player;
                } else {
                    System.out.println("This space is taken");
                    admit(board, player);
                }
                break;
            case 5:
                if (board[1][1] == '5') {
                    board[1][1] = player;
                } else {
                    System.out.println("This space is taken");
                    admit(board, player);
                }
                break;
            case 6:
                if (board[1][2] == '6') {
                    board[1][2] = player;
                } else {
                    System.out.println("This space is taken");
                    admit(board, player);
                }
                break;
            case 7:
                if (board[2][0] == '7') {
                    board[2][0] = player;
                } else {
                    System.out.println("This space is taken");
                    admit(board, player);
                }
                break;
            case 8:
                if (board[2][1] == '8') {
                    board[2][1] = player;
                } else {
                    System.out.println("This space is taken");
                    admit(board, player);
                }
                break;
            case 9:
                if (board[2][2] == '9') {
                    board[2][2] = player;
                } else {
                    System.out.println("This space is taken");
                    admit(board, player);
                }
                break;
            default:
                System.out.println("Invalid number");
                admit(board, player);
                break;

        }
    }
}
