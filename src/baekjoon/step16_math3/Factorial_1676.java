package baekjoon.step16_math3;

import java.util.Scanner;

public class Factorial_1676 {

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        int twoCounts = 0;
        int fiveCounts = 0;
        for (int i = 1; i <= number; i++) {
            int tmp = i;
            while (tmp % 5 == 0) {
                tmp /= 5;
                fiveCounts++;
            }
            while (tmp % 2 == 0) {
                tmp /= 2;
                twoCounts++;
            }
        }
        System.out.println(Math.min(twoCounts, fiveCounts));
    }
}
