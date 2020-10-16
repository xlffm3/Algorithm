package baekjoon.step9_math2;

import java.io.*;

public class BetrandPostulate_4948 {
    private static final int ZERO = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int number = Integer.parseInt(bufferedReader.readLine());
            if (number == ZERO)
                break;
            int primeNumberCounts = ZERO;
            for (int i = number + 1; i <= number * 2; i++) {
                if (isPrimeNumber(i))
                    primeNumberCounts++;
            }
            bufferedWriter.write(String.valueOf(primeNumberCounts));
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    private static boolean isPrimeNumber(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == ZERO)
                return false;
        }
        return true;
    }
}
