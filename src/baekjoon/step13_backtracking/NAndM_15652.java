package baekjoon.step13_backtracking;

import java.io.*;

public class NAndM_15652 {
    private static final BufferedWriter BUFFERED_WRITER = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final String SPACE_DELIMITER = " ";
    private static final int ZERO = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = bufferedReader.readLine()
                .split(SPACE_DELIMITER);
        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);
        int[] numbers = new int[m];
        conductBackTracking(0, n, m, numbers);
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
            if (isCorrectNumbers(index, numbers))
                conductBackTracking(index + 1, n, m, numbers);
        }
    }

    private static boolean isCorrectNumbers(int index, int[] numbers) {
        return index == ZERO || numbers[index - 1] <= numbers[index];
    }
}
