package baekjoon.step12_sort;

import java.io.*;

public class Sort3_10989 {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TEST_CASE_COUNTS = 10001;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberCounts = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[TEST_CASE_COUNTS];
        for (int i = ZERO; i < numberCounts; i++) {
            arr[Integer.parseInt(bufferedReader.readLine())]++;
        }
        bufferedReader.close();
        for (int i = ONE; i < TEST_CASE_COUNTS; i++) {
            if (arr[i] != ZERO) {
                for (int j = ZERO; j < arr[i]; j++) {
                    bufferedWriter.write(String.valueOf(i));
                    bufferedWriter.newLine();
                }
            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
