package baekjoon.step13_backtracking;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class NAndM_15649 {
    private static final BufferedWriter BUFFERED_WRITER = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int ZERO = 0;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
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
            if (!isDuplicatedNumbers(index + 1, numbers)) {
                conductBackTracking(index + 1, n, m, numbers);
            }
            numbers[index] = ZERO;
        }

    }

    private static boolean isDuplicatedNumbers(int size, int[] numbers) {
        return Arrays.stream(numbers)
                .filter(number -> number != ZERO)
                .distinct()
                .count() != size;
    }
}
