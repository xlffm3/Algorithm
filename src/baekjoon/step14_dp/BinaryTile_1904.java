package baekjoon.step14_dp;

import java.util.Scanner;

public class BinaryTile_1904 {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int SHARE = 15746;

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        long firstCounts = ONE;
        long secondCounts = TWO;
        long remainder = ZERO;
        for (int i = 3; i <= number; i++) {
            remainder = (firstCounts + secondCounts) % SHARE;
            firstCounts = secondCounts;
            secondCounts = remainder;
        }
        if (number == 1)
            remainder = ONE;
        else if (number == 2)
            remainder = TWO;
        System.out.println(remainder);
    }
}
