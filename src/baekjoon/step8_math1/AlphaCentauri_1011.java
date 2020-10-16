package baekjoon.step8_math1;

import java.io.*;
import java.util.StringTokenizer;

public class AlphaCentauri_1011 {
    private static final int ZERO = 0;
    private static final String SPACE_DELIMITER = " ";

    private static int calculateActivationCounts(int x, int y) {
        int distance = y - x;
        double rootOfDistance = Math.sqrt(distance);
        int integerPartFromRootOfDistance = (int) rootOfDistance;

        if (rootOfDistance == integerPartFromRootOfDistance)
            return (2 * integerPartFromRootOfDistance) - 1;
        else if (rootOfDistance - integerPartFromRootOfDistance <= 0.5)
            return (2 * integerPartFromRootOfDistance);
        return (2 * integerPartFromRootOfDistance) + 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCaseCounts = Integer.parseInt(bufferedReader.readLine());
        for (int i = ZERO; i < testCaseCounts; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());
            int activationCounts = calculateActivationCounts(x, y);
            bufferedWriter.write(String.format("%d\n", activationCounts));
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
