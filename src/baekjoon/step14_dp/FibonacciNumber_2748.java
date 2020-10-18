package baekjoon.step14_dp;

import java.util.Scanner;

public class FibonacciNumber_2748 {
    private static final int ZERO = 0;
    private static final int ONE = 1;

    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        long firstNumber = ZERO;
        long secondNumber = ONE;
        long result = ZERO;
        for (int i = ONE; i < num; i++) {
            result = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = result;
        }
        if (num == ONE)
            result = ONE;
        System.out.println(result);
    }
}
