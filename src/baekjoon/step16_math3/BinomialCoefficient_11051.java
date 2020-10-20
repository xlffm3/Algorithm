package baekjoon.step16_math3;

import java.util.Scanner;

public class BinomialCoefficient_11051 {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int SHARE = 10007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        int[][] dp = new int[n + ONE][n + ONE];
        dp[ONE][ZERO] = ONE;
        dp[ONE][ONE] = ONE;
        for (int i = 2; i <= n; i++) {
            dp[i][ZERO] = ONE;
            dp[i][i] = ONE;
            for (int j = ONE; j < i; j++) {
                dp[i][j] = (dp[i - ONE][j] + dp[i - ONE][j - ONE]) % SHARE;
            }
        }
        System.out.println(dp[n][r]);
    }
}
