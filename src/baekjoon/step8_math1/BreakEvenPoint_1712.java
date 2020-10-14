package baekjoon.step8_math1;

import java.util.Scanner;

public class BreakEvenPoint_1712 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long fixedCost = scanner.nextInt();
        long variableCost = scanner.nextInt();
        long price = scanner.nextInt();
        if (variableCost >= price)
            System.out.println(-1);
        else
            System.out.println(fixedCost / (price - variableCost) + 1);
    }
}
