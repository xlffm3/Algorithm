package baekjoon.step14_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Wine_2156 {
    private static final int ZERO = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int wineCounts = Integer.parseInt(bufferedReader.readLine());
        int[] wineAmounts = new int[wineCounts + 1];
        long[] dp = new long[wineCounts + 1];
        for (int i = 1; i <= wineCounts; i++) {
            wineAmounts[i] = Integer.parseInt(bufferedReader.readLine());
        }
        dp[1] = wineAmounts[1];
        if (wineCounts >= 2)
            dp[2] = dp[1] + wineAmounts[2];
        for (int i = 3; i <= wineCounts; i++) {
            dp[i] = Math.max(dp[i - 2] + wineAmounts[i], dp[i - 3] + wineAmounts[i - 1] + wineAmounts[i]);
            dp[i] = Math.max(dp[i - 1], dp[i]);
        }
        System.out.println(Arrays.stream(dp).max().getAsLong());
    }
}
