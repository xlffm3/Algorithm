package baekjoon.step4_while;

import java.io.*;

public class EOF_10951 {
    private static final String SPACE_DELIM = " ";
    private static final char ZERO = '0';

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        int firstNumber;
        int secondNumber;
        while ((line = bufferedReader.readLine()) != null) {
            firstNumber = line.charAt(0) - ZERO;
            secondNumber = line.charAt(2) - ZERO;
            bufferedWriter.write(String.valueOf(firstNumber + secondNumber));
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
