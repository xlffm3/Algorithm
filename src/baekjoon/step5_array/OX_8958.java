package baekjoon.step5_array;

import java.io.*;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class OX_8958 {
    private static final int ZERO = 0;
    private static final String DELIMITER_X = "X";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCaseTotal = Integer.parseInt(bufferedReader.readLine());
        for (int i = ZERO; i < testCaseTotal; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), DELIMITER_X);
            int scoreTotal = ZERO;
            while (stringTokenizer.hasMoreTokens()) {
                String rightAnswers = stringTokenizer.nextToken();
                scoreTotal += IntStream.rangeClosed(1, rightAnswers.length())
                        .reduce(0, Integer::sum);
            }
            bufferedWriter.write(String.valueOf(scoreTotal));
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
