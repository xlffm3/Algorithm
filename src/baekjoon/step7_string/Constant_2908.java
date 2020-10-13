package baekjoon.step7_string;

import java.util.Scanner;

public class Constant_2908 {
    private static final int ZERO = 0;

    private static int reverseOrder(char[] numbers) {
        int length = numbers.length;
        for (int i = ZERO; i < length / 2; i++) {
            char tmp = numbers[i];
            numbers[i] = numbers[length - 1 - i];
            numbers[length - 1 - i] = tmp;
        }
        return Integer.parseInt(new String(numbers));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] firstNumber = scanner.next().toCharArray();
        char[] secondNumber = scanner.next().toCharArray();
        int reverseFirstNumber = reverseOrder(firstNumber);
        int reverseSecondNumber = reverseOrder(secondNumber);
        if (reverseFirstNumber > reverseSecondNumber)
            System.out.println(reverseFirstNumber);
        else
            System.out.println(reverseSecondNumber);
    }
}
