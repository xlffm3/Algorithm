package baekjoon.step3_for;

import java.io.*;
import java.util.StringTokenizer;

public class SmallerThanX_10871 {
    private static final String SPACE_DELIM = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIM);
        int number;
        stringTokenizer.nextToken();
        int standardNumber = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIM);
        while (stringTokenizer.hasMoreTokens()) {
            number = Integer.parseInt(stringTokenizer.nextToken());
            if (number < standardNumber)
                bufferedWriter.write(String.format("%d ", number));
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
