package baekjoon.step14_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGBStreet_1149 {
    private static final String SPACE_DELIMITER = " ";
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int R_INDEX = 0;
    private static final int G_INDEX = 1;
    private static final int B_INDEX = 2;
    private static final int RGB_COUNTS = 3;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int houseCounts = Integer.parseInt(bufferedReader.readLine());
        int[][] costs = new int[houseCounts][RGB_COUNTS];
        int[][] dp = new int[houseCounts][RGB_COUNTS];
        for (int i = ZERO; i < houseCounts; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
            costs[i][R_INDEX] = Integer.parseInt(stringTokenizer.nextToken());
            costs[i][G_INDEX] = Integer.parseInt(stringTokenizer.nextToken());
            costs[i][B_INDEX] = Integer.parseInt(stringTokenizer.nextToken());
        }
        bufferedReader.close();
        dp[ZERO][R_INDEX] = costs[ZERO][R_INDEX];
        dp[ZERO][G_INDEX] = costs[ZERO][G_INDEX];
        dp[ZERO][B_INDEX] = costs[ZERO][B_INDEX];
        for (int i = ONE; i < houseCounts; i++) {
            dp[i][R_INDEX] = Math.min(dp[i - 1][G_INDEX], dp[i - 1][B_INDEX]) + costs[i][R_INDEX];
            dp[i][G_INDEX] = Math.min(dp[i - 1][R_INDEX], dp[i - 1][B_INDEX]) + costs[i][G_INDEX];
            dp[i][B_INDEX] = Math.min(dp[i - 1][R_INDEX], dp[i - 1][G_INDEX]) + costs[i][B_INDEX];
        }
        System.out.println(Math.min(dp[houseCounts - ONE][R_INDEX],
                Math.min(dp[houseCounts - ONE][G_INDEX], dp[houseCounts - ONE][B_INDEX])));
    }
}
