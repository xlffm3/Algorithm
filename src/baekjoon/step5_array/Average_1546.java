package baekjoon.step5_array;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Average_1546 {
    private static final String SPACE_DELIMITER = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int subjectCounts = Integer.parseInt(bufferedReader.readLine());
        List<Double> scores = new ArrayList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
        while (stringTokenizer.hasMoreTokens())
            scores.add(Double.parseDouble(stringTokenizer.nextToken()));
        bufferedReader.close();
        double maxScore = scores.stream()
                .max(Comparator.naturalOrder())
                .get();
        double adjustedScoresTotal = scores.stream()
                .map(score -> (score / maxScore) * 100)
                .reduce(0.0, Double::sum);
        bufferedWriter.write(String.valueOf(adjustedScoresTotal / subjectCounts));
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
