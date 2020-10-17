package baekjoon.step11_bruteforce;

import java.util.Scanner;

public class DecompositionSum_2231 {
    private static final int ZERO = 0;
    private static final int TEN = 10;

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        for (int i = ZERO; i < number; i++) {
            int j = i;
            int sum = i;
            while (j != ZERO) {
                sum += j % TEN;
                j /= TEN;
            }
            if (sum == number) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(ZERO);
    }
}
