package baekjoon.step8_math1;

import java.util.Scanner;

public class Sugar_2839 {
    private static final int ZERO = 0;

    public static void main(String[] args) {
        int sugarWeight = new Scanner(System.in).nextInt();
        int fiveCounts = sugarWeight / 5;
        while (fiveCounts >= ZERO) {
            int threeCounts = (sugarWeight - (fiveCounts * 5)) / 3;
            if ((sugarWeight - (fiveCounts * 5)) % 3 == 0) {
                System.out.println(threeCounts + fiveCounts);
                return;
            }
            fiveCounts--;
        }
        System.out.println(-1);
    }
}
