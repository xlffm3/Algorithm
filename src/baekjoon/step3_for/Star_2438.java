package baekjoon.step3_for;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Star_2438 {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final String STAR = "*";

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int lineCounts = new Scanner(System.in).nextInt();
        for (int i = ONE; i <= lineCounts; i++) {
            for (int j = ZERO; j < i; j++)
                bufferedWriter.write(STAR);
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
