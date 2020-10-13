package baekjoon.step7_string;

import java.io.*;
import java.util.StringTokenizer;

public class StringLoop_2675 {
    private static final int ZERO = 0;
    private static final String SPACE_DELIMITER = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCaseTotal = Integer.parseInt(bufferedReader.readLine());
        for (int i = ZERO; i < testCaseTotal; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
            int loopCounts = Integer.parseInt(stringTokenizer.nextToken());
            char[] words = stringTokenizer.nextToken()
                    .toCharArray();
            for (char word : words) {
                for (int j = ZERO; j < loopCounts; j++)
                    bufferedWriter.write(word);
            }
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
