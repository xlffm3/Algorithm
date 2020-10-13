package baekjoon.step3_for;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Star_2439 {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final String STAR = "*";
    private static final String WHITE_SPACE = " ";

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int lineCounts = new Scanner(System.in).nextInt();
        for (int i = ONE; i <= lineCounts; i++) {
            for (int j = i; j < lineCounts; j++)
                bufferedWriter.write(WHITE_SPACE);
            for (int k = ZERO; k < i; k++)
                bufferedWriter.write(STAR);
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
