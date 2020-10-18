package baekjoon.step13_backtracking;

import java.io.*;

public class NAndM_15651 {
    private static final BufferedWriter BUFFERED_WRITER = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int ZERO = 0;
    private static final String SPACE_DELIMITER = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = bufferedReader.readLine()
                .split(SPACE_DELIMITER);
        bufferedReader.close();
        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[0]);
        int[] numbers = new int[m];
        conductBackTracking(ZERO, n, m, numbers);
        BUFFERED_WRITER.flush();
        BUFFERED_WRITER.close();
    }

    private static void conductBackTracking(int index, int n, int m, int[] numbers) throws IOException {
        if (index == m) {
            for (int number : numbers) {
                BUFFERED_WRITER.write(String.format("%d ", number));
            }
            BUFFERED_WRITER.newLine();
            return;
        }
        for (int i = 1; i <= n; i++) {
            numbers[index] = i;
            conductBackTracking(index + 1, n, m, numbers);
        }
    }
}
