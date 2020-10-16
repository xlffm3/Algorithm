package baekjoon.step8_math1;

import java.util.Scanner;

public class Fraction_1193 {
    private static final int ZERO = 0;

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        int lineNumber = ZERO;
        while (lineNumber * (lineNumber + 1) < number * 2)
            lineNumber++;
        int i = ZERO;
        int j = ZERO;
        boolean flag = false;
        if ((lineNumber - 1) % 2 == ZERO) {
            flag = true;
            i = lineNumber;
            j = 1;
        } else {
            i = 1;
            j = lineNumber;
        }
        int remainder = number - (lineNumber * (lineNumber - 1) / 2);
        for (int k = 1; k < remainder; k++) {
            if (flag) {
                i--;
                j++;
            } else {
                i++;
                j--;
            }
        }
        System.out.println(String.format("%d/%d", i, j));
    }
}
