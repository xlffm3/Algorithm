package baekjoon.step1_io;

import java.util.Scanner;

public class Multiple_2588 {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int ZERO = 0;
    private static final int TEN = 10;

    private static void printEachLine(int firstNumber, int secondNumber) {
        while (secondNumber != ZERO) {
            int remainder = secondNumber % TEN;
            System.out.println(firstNumber * remainder);
            secondNumber /= TEN;
        }
    }

    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(SCANNER.nextLine());
        int secondNumber = Integer.parseInt(SCANNER.nextLine());
        printEachLine(firstNumber, secondNumber);
        System.out.println(firstNumber * secondNumber);
    }
}
