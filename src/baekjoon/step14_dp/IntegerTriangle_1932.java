package baekjoon.step14_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class IntegerTriangle_1932 {
    private static final String SPACE_DELIMITER = " ";
    private static final int ZERO = 0;
    private static final int ONE = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int triangleSize = Integer.parseInt(bufferedReader.readLine());
        int[][] triangle = new int[triangleSize][triangleSize];
        int[][] dp = new int[triangleSize][triangleSize];
        for (int i = ZERO; i < triangleSize; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
            int tokenCounts = stringTokenizer.countTokens();
            for (int j = ZERO; j < tokenCounts; j++) {
                triangle[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        bufferedReader.close();
        dp[ZERO][ZERO] = triangle[ZERO][ZERO];
        for (int i = ONE; i < triangleSize; i++) {
            for (int j = ZERO; j < i + ONE; j++) {
                if (j == ZERO) {
                    dp[i][j] = dp[i - ONE][j] + triangle[i][j];
                } else if (j == i) {
                    dp[i][j] = dp[i - ONE][j - ONE] + triangle[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i - ONE][j - ONE], dp[i - ONE][j]) + triangle[i][j];
                }
            }
        }
        int maxSum = Arrays.stream(dp[triangleSize - ONE])
                .max()
                .getAsInt();
        System.out.println(maxSum);
    }
}
