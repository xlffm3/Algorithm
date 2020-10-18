package baekjoon.step13_backtracking;

import java.util.Scanner;

public class NQueen_9663 {
    private static final int ZERO = 0;
    private static final int QUEEN_SPACE = 1;
    private static final int EMPTY_SPACE = 0;
    private static int ANSWER_COUNTS;

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        int[][] chessBoard = new int[number][number];
        ANSWER_COUNTS = ZERO;
        findNQueenAnswer(ZERO, number, chessBoard);
        System.out.println(ANSWER_COUNTS);
    }

    private static void findNQueenAnswer(int col, int number, int[][] chessBoard) {
        if (col == number) {
            ANSWER_COUNTS++;
            return;
        }
        for (int i = ZERO; i < number; i++) {
            chessBoard[col][i] = QUEEN_SPACE;
            if (isCorrectPosition(i, col, number, chessBoard)) {
                findNQueenAnswer(col + 1, number, chessBoard);
            }
            chessBoard[col][i] = EMPTY_SPACE;
        }
    }

    private static boolean isCorrectPosition(int row, int col, int number, int[][] chessBoard) {
        if (col == ZERO)
            return true;
        for (int i = col - 1; i >= 0; i--) {
            if (chessBoard[i][row] == QUEEN_SPACE)
                return false;
        }
        int tmpRow = row - 1;
        int tmpCol = col - 1;
        while (tmpRow >= ZERO && tmpCol >= ZERO) {
            if (chessBoard[tmpCol][tmpRow] == QUEEN_SPACE)
                return false;
            tmpRow--;
            tmpCol--;
        }
        tmpRow = row + 1;
        tmpCol = col - 1;
        while (tmpRow < number && tmpCol >= ZERO) {
            if (chessBoard[tmpCol][tmpRow] == QUEEN_SPACE)
                return false;
            tmpRow++;
            tmpCol--;
        }
        return true;
    }
}
