package baekjoon.step4_while;

import java.util.Scanner;

public class PlusCycle_1110 {
    private static final int ZERO = 0;

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        int calculationResult = number;
        int cycle = ZERO;
        do {
            int digitSum = calculationResult / 10 + calculationResult % 10;
            calculationResult = (calculationResult % 10) * 10 + digitSum % 10;
            cycle++;
        } while (number != calculationResult);
        System.out.println(cycle);
    }
}
