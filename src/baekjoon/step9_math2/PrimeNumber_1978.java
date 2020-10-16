package baekjoon.step9_math2;

import java.io.*;
import java.util.StringTokenizer;

public class PrimeNumber_1978 {
    private static final int ZERO = 0;
    private static final String SPACE_DELIMITER = " ";

    private static boolean isPrimeNumber(int targetNumber) {
        if (targetNumber <= 1)
            return false;
        for (int i = 2; i * i <= targetNumber; i++) {
            if (targetNumber % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCaseCounts = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
        int primeNumberCounts = ZERO;
        while (stringTokenizer.hasMoreTokens()) {
            int targetNumber = Integer.parseInt(stringTokenizer.nextToken());
            if (isPrimeNumber(targetNumber))
                primeNumberCounts++;
        }
        bufferedWriter.write(String.format("%d\n", primeNumberCounts));
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
