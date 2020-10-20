package baekjoon.step16_math3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Divisor_1037 {
    private static final String SPACE_DELIMITER = " ";
    private static final int ZERO = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divisorCounts = Integer.parseInt(scanner.nextLine());
        int[] divisors = new int[divisorCounts];
        StringTokenizer stringTokenizer = new StringTokenizer(scanner.nextLine(), SPACE_DELIMITER);
        for (int i = ZERO; i < divisorCounts; i++) {
            divisors[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(divisors);
        System.out.println(divisors[0] * divisors[divisorCounts - 1]);
    }
}
