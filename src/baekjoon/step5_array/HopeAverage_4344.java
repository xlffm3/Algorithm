package baekjoon.step5_array;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class HopeAverage_4344 {
    private static final int ZERO = 0;
    private static final String SPACE_DELIMITER = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCaseTotal = Integer.parseInt(bufferedReader.readLine());
        for (int i = ZERO; i < testCaseTotal; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
            List<Integer> scores = new ArrayList<>();
            int studentCounts = Integer.parseInt(stringTokenizer.nextToken());
            while (stringTokenizer.hasMoreTokens())
                scores.add(Integer.parseInt(stringTokenizer.nextToken()));
            double scoreAverage = (double) scores.stream()
                    .reduce(0, Integer::sum) / studentCounts;
            int highScoreStudentCounts = (int) scores.stream()
                    .filter(score -> score > scoreAverage)
                    .count();
            double highScoreStudentRatio = ((double) highScoreStudentCounts / studentCounts) * 100;
            bufferedWriter.write(String.format("%.3f%%\n", highScoreStudentRatio));
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
