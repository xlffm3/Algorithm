package baekjoon.step3_for;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class APlusB_10950 {
    private static final int ZERO = 0;
    private static final String WHITE_SPACE = " ";

    private static int calculate(String line) {
        StringTokenizer stringTokenizer = new StringTokenizer(line, WHITE_SPACE);
        int firstNumber = Integer.parseInt(stringTokenizer.nextToken());
        int secondNumber = Integer.parseInt(stringTokenizer.nextToken());
        return firstNumber + secondNumber;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCaseTotal = Integer.parseInt(bufferedReader.readLine());
        List<String> lines = new ArrayList<>();
        for (int i = ZERO; i < testCaseTotal; i++)
            lines.add(bufferedReader.readLine());
        bufferedReader.close();
        List<Integer> calculationResults = lines.stream()
                .map(APlusB_10950::calculate)
                .collect(Collectors.toList());
        for (Integer result : calculationResults) {
            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();
    }
}
