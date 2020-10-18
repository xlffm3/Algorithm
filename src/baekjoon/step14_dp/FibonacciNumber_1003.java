package baekjoon.step14_dp;

import java.io.*;

public class FibonacciNumber_1003 {
    private static final int ZERO = 0;
    private static final int ONE = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCaseCounts = Integer.parseInt(bufferedReader.readLine());
        for (int i = ZERO; i < testCaseCounts; i++) {
            int number = Integer.parseInt(bufferedReader.readLine());
            int zeroCounts = ONE;
            int oneCounts = ZERO;
            for (int j = ZERO; j < number; j++) {
                int sum = zeroCounts + oneCounts;
                zeroCounts = oneCounts;
                oneCounts = sum;
            }
            bufferedWriter.write(String.format("%d %d\n", zeroCounts, oneCounts));
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
