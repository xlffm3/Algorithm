package baekjoon.step3_for;

import java.io.*;
import java.util.StringTokenizer;

public class APlusB_11021 {
    private static final int ZERO = 0;
    private static final String WHITE_SPACE = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCaseTotal = Integer.parseInt(bufferedReader.readLine());
        for (int i = ZERO; i < testCaseTotal; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), WHITE_SPACE);
            int firstNumber = Integer.parseInt(stringTokenizer.nextToken());
            int secondNumber = Integer.parseInt(stringTokenizer.nextToken());
            bufferedWriter.write(String.format("Case #%d: %d\n", i + 1, firstNumber + secondNumber));
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
