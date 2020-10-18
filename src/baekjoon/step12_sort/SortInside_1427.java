package baekjoon.step12_sort;

import java.util.*;

public class SortInside_1427 {
    private static final int ZERO = 0;
    private static final int TEN = 10;

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        List<Integer> digits = new ArrayList<>();
        while (number != ZERO) {
            digits.add(number % TEN);
            number /= TEN;
        }
        Collections.sort(digits, Comparator.reverseOrder());
        StringBuilder stringBuilder = new StringBuilder();
        digits.forEach(digit -> stringBuilder.append(digit));
        System.out.println(stringBuilder.toString());
    }
}
