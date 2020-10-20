package baekjoon.step14_dp;

import java.util.Arrays;
import java.util.Scanner;

public class StairNumber_10844 {
    private static final int SHARE = 1000000000;

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        long[][] dp = new long[number + 1][10];

        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }
        for (int i = 2; i <= number; i++) {
            dp[i][0] = dp[i - 1][1];
            dp[i][9] = dp[i - 1][8];
            for (int j = 1; j <= 8; j++) {
                dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % SHARE;
            }
        }
        long sum = Arrays.stream(dp[number])
                .sum();
        System.out.println(sum % SHARE);
    }
}
