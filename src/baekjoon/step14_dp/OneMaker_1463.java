package baekjoon.step14_dp;

import java.util.Scanner;

public class OneMaker_1463 {

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        int[] operationCounts = new int[number + 1];
        for (int i = 2; i <= number; i++) {
            operationCounts[i] = operationCounts[i - 1] + 1;
            if (i % 2 == 0) {
                operationCounts[i] = Math.min(operationCounts[i], operationCounts[i / 2] + 1);
            }
            if (i % 3 == 0) {
                operationCounts[i] = Math.min(operationCounts[i], operationCounts[i / 3] + 1);
            }
        }
        System.out.println(operationCounts[number]);
    }
}
