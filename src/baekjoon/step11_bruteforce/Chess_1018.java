package baekjoon.step11_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chess_1018 {
    private static final String SPACE_DELIMITER = " ";
    private static final int ZERO = 0;
    private static final char[][] STANDARD_CHESS_BOARD_WHITE = {
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}};
    private static final char[][] STANDARD_CHESS_BOARD_BLACK = {
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}};

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
        int height = Integer.parseInt(stringTokenizer.nextToken());
        int width = Integer.parseInt(stringTokenizer.nextToken());
        char[][] chessBoard = new char[height][width];
        for (int i = ZERO; i < height; i++) {
            char[] arr = bufferedReader.readLine()
                    .toCharArray();
            chessBoard[i] = arr;
        }
        bufferedReader.close();
        int minimumRevisionCounts = calculateMinimumRevisionCounts(width, height, chessBoard);
        System.out.println(minimumRevisionCounts);
    }

    private static int calculateMinimumRevisionCounts(int width, int height, char[][] chessBoard) {
        int revisionCounts = width * height;
        for (int i = 0; i <= height - 8; i++) {
            for (int j = 0; j <= width - 8; j++) {
                int standardWhiteRevisionCounts = compareDifference(i, j, chessBoard, STANDARD_CHESS_BOARD_WHITE);
                int standardBlackRevisionCounts = compareDifference(i, j, chessBoard, STANDARD_CHESS_BOARD_BLACK);
                revisionCounts = Math.min(revisionCounts, Math.min(standardBlackRevisionCounts, standardWhiteRevisionCounts));
            }
        }
        return revisionCounts;
    }

    private static int compareDifference(int i, int j, char[][] chessBoard, char[][] standardChessBoard) {
        int differenceCounts = ZERO;
        for (int k = 0; k < 8; k++) {
            for (int p = 0; p < 8; p++) {
                if (chessBoard[i + k][j + p] != standardChessBoard[k][p])
                    differenceCounts++;
            }
        }
        return differenceCounts;
    }
}
