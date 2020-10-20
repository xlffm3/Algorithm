package baekjoon.step14_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stair_2579 {
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int stairCounts = Integer.parseInt(bufferedReader.readLine());
        int[] scores = new int[stairCounts + ONE];
        int[] dp = new int[stairCounts + ONE];
        for (int i = ONE; i <= stairCounts; i++) {
            scores[i] = Integer.parseInt(bufferedReader.readLine());
        }
        bufferedReader.close();
        dp[ONE] = scores[ONE];
        if (stairCounts >= TWO) {
            dp[TWO] = dp[ONE] + scores[TWO];
        }
        for (int i = THREE; i <= stairCounts; i++) {
            dp[i] = Math.max(dp[i - TWO] + scores[i], dp[i - THREE] + scores[i - ONE] + scores[i]);
        }
        System.out.println(dp[stairCounts]);
    }
}
