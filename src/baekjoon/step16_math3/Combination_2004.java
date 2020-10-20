package baekjoon.step16_math3;

import java.util.Scanner;

public class Combination_2004 {
    private static final int TWO_COUNTS_INDEX = 0;
    private static final int FIVE_COUNTS_INDEX = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long[] nDivisors = getZeroCounts(n);
        long[] mDivisors = getZeroCounts(m);
        long[] nMinusMDivisors = getZeroCounts(n - m);
        System.out.println(Math.min(nDivisors[TWO_COUNTS_INDEX] - mDivisors[TWO_COUNTS_INDEX] - nMinusMDivisors[TWO_COUNTS_INDEX],
                nDivisors[FIVE_COUNTS_INDEX] - mDivisors[FIVE_COUNTS_INDEX] - nMinusMDivisors[FIVE_COUNTS_INDEX]));
    }

    private static long[] getZeroCounts(int n) {
        long twoCounts = 0;
        long fiveCounts = 0;
        for (long i = 2; i <= n; i *= 2) {
            twoCounts += n / i;
        }
        for (long i = 5; i <= n; i *= 5) {
            fiveCounts += n / i;
        }
        return new long[]{twoCounts, fiveCounts};
    }
}
