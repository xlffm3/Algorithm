package baekjoon.step6_function;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class SelfNumber_4673 {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TEN = 10;
    private static final int TEST_CASE_MAXIMUM = 10000;

    private static int conductFunctionD(int i) {
        int result = i;
        while (i != ZERO) {
            result += i % TEN;
            i /= TEN;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        boolean[] isSelfNumbers = new boolean[TEST_CASE_MAXIMUM];
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = ONE; i <= TEST_CASE_MAXIMUM; i++) {
            int sum = conductFunctionD(i);
            if (sum <= TEST_CASE_MAXIMUM)
                isSelfNumbers[sum - 1] = true;
            if (isSelfNumbers[i - 1] == false) {
                bufferedWriter.write(String.valueOf(i));
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
