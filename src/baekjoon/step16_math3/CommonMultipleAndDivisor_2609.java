package baekjoon.step16_math3;

import java.util.Arrays;
import java.util.Scanner;

public class CommonMultipleAndDivisor_2609 {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[TWO];
        numbers[ZERO] = scanner.nextInt();
        numbers[ONE] = scanner.nextInt();
        Arrays.sort(numbers);
        int maxDivisor = numbers[ZERO];
        while (maxDivisor >= 1) {
            if (numbers[ZERO] % maxDivisor == 0 && numbers[ONE] % maxDivisor == 0) {
                System.out.println(maxDivisor);
                break;
            }
            maxDivisor--;
        }
        int firstMode = numbers[ZERO] / maxDivisor;
        int secondMode = numbers[ONE] / maxDivisor;
        System.out.println(firstMode * secondMode * maxDivisor);
    }
}
