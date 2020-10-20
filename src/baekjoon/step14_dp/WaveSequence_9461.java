package baekjoon.step14_dp;

import java.io.*;
import java.util.Arrays;

public class WaveSequence_9461 {
    private static final int ZERO = 0;
    private static final int TEST_CASE_RANGE_MAX = 101;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCaseCounts = Integer.parseInt(bufferedReader.readLine());
        long[] waveNumbers = new long[TEST_CASE_RANGE_MAX];
        initiateWaveNumbers(waveNumbers);
        for (int i = ZERO; i < testCaseCounts; i++) {
            int number = Integer.parseInt(bufferedReader.readLine());
            bufferedWriter.write(String.valueOf(waveNumbers[number]));
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    private static void initiateWaveNumbers(long[] waveNumbers) {
        Arrays.fill(waveNumbers, 1, 4, 1);
        Arrays.fill(waveNumbers, 4, 6, 2);
        for (int i = 6; i < TEST_CASE_RANGE_MAX; i++) {
            waveNumbers[i] = waveNumbers[i - 1] + waveNumbers[i - 5];
        }
    }
}
