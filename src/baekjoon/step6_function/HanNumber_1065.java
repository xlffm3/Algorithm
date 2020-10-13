package baekjoon.step6_function;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HanNumber_1065 {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TEN = 10;
    private static final int ONE_HUNDRED = 100;

    private static boolean isHanNumber(int number) {
        if (number < ONE_HUNDRED)
            return true;
        List<Integer> digits = new ArrayList<>();
        while (number != ZERO) {
            digits.add(number % TEN);
            number /= TEN;
        }
        int size = digits.size();
        int tolerance = ZERO;
        for (int i = ZERO; i < size - ONE; i++) {
            int difference = digits.get(i + 1) - digits.get(i);
            if (i == ZERO) {
                tolerance = difference;
                continue;
            }
            if (tolerance != difference)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        int hanNumberCounts = ZERO;
        for (int i = ONE; i <= number; i++) {
            if (isHanNumber(i))
                hanNumberCounts++;
        }
        System.out.println(hanNumberCounts);
    }
}
