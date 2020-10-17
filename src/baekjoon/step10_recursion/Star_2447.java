package baekjoon.step10_recursion;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Star_2447 {

    public static void main(String[] args) throws IOException {
        int size = new Scanner(System.in).nextInt();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        char[][] stars = new char[size][size];
        for (char[] row : stars) {
            Arrays.fill(row, ' ');
        }
        initiateStars(0, 0, size, stars);
        for (char[] row : stars) {
            for (char c : row)
                bufferedWriter.write(String.valueOf(c));
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    private static void initiateStars(int x, int y, int n, char[][] stars) {
        if (n == 1) {
            stars[y][x] = '*';
            return;
        }
        int m = n / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1)
                    continue;
                initiateStars(x + m * i, y + m * j, m, stars);
            }
        }
    }
}
