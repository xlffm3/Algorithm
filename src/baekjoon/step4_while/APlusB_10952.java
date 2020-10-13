package baekjoon.step4_while;

import java.io.*;
import java.util.StringTokenizer;

public class APlusB_10952 {
    private static final String SPACE_DELIM = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;
        int firstNumber;
        int secondNumber;
        while (true) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIM);
            firstNumber = Integer.parseInt(stringTokenizer.nextToken());
            secondNumber = Integer.parseInt(stringTokenizer.nextToken());
            if (firstNumber == 0 && secondNumber == 0)
                break;
            bufferedWriter.write(String.valueOf(firstNumber + secondNumber));
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
