package baekjoon.step16_math3;

import java.io.*;
import java.util.StringTokenizer;

public class MultipleAndDivisor_5086 {
    private static final String SPACE_DELIMITER = " ";
    private static final int ZERO = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
            int firstNumber = Integer.parseInt(stringTokenizer.nextToken());
            int secondNumber = Integer.parseInt(stringTokenizer.nextToken());
            if (firstNumber == ZERO && secondNumber == ZERO)
                break;
            if (secondNumber % firstNumber == 0) {
                bufferedWriter.write("factor\n");
            } else if (firstNumber % secondNumber == 0) {
                bufferedWriter.write("multiple\n");
            } else {
                bufferedWriter.write("neither\n");
            }
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
