package baekjoon.step13_backtracking;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sudoku_2580 {
    private static final BufferedWriter BUFFERED_WRITER = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final String SPACE_DELIMITER = " ";
    private static final int SUDOKU_SIZE = 9;
    private static final int EMPTY_SPACE = 0;
    private static final int ONE = 1;
    private static final int ZERO = 0;
    private static boolean flag = false;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[][] sudokuBoard = new int[SUDOKU_SIZE][SUDOKU_SIZE];
        for (int i = ZERO; i < SUDOKU_SIZE; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
            for (int j = ZERO; j < SUDOKU_SIZE; j++) {
                sudokuBoard[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        fillSudokuBoard(ZERO, ZERO, sudokuBoard);
        BUFFERED_WRITER.flush();
        BUFFERED_WRITER.close();
    }

    private static void fillSudokuBoard(int row, int col, int[][] sudokuBoard) {
        if (col == SUDOKU_SIZE) {
            for (int[] line : sudokuBoard) {
                System.out.println(Arrays.toString(line));
            }
            flag = true;
            return;
        }
        for (int i = row; i < SUDOKU_SIZE; i++) {
            if (sudokuBoard[col][i] == EMPTY_SPACE) {
                for (int j = ONE; j <= SUDOKU_SIZE; j++) {
                    sudokuBoard[col][i] = j;
                    if (isValidSudokuNumber(col, i, j, sudokuBoard)) {
                        if (isMovableToNextColumn(sudokuBoard[col])) {
                            fillSudokuBoard(ZERO, col + 1, sudokuBoard);
                        } else {
                            fillSudokuBoard(row + 1, col, sudokuBoard);
                        }
                    }
                    sudokuBoard[col][i] = EMPTY_SPACE;
                    if (flag)
                        return;
                }
            }
        }
    }

    private static boolean isMovableToNextColumn(int[] line) {
        for (int number : line) {
            if (number == EMPTY_SPACE)
                return false;
        }
        return true;
    }

    private static boolean isValidSudokuNumber(int col, int row, int number, int[][] sudokuBoard) {
        for (int i = ZERO; i < row; i++) {
            if (sudokuBoard[col][i] == number)
                return false;
        }
        for (int i = row + 1; i < SUDOKU_SIZE; i++) {
            if (sudokuBoard[col][i] == number)
                return false;
        }
        for (int i = ZERO; i < col; i++) {
            if (sudokuBoard[i][row] == number)
                return false;
        }
        for (int i = col + 1; i < SUDOKU_SIZE; i++) {
            if (sudokuBoard[i][row] == number)
                return false;
        }
        return true;
    }


}
