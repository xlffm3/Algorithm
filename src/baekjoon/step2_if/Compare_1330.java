package baekjoon.step2_if;

import java.util.Scanner;

public class Compare_1330 {
    private static final Scanner SCANNER = new Scanner(System.in);

    private static void printCompareCharacter(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber)
            System.out.println("<");
        else if (firstNumber > secondNumber)
            System.out.println(">");
        else
            System.out.println("==");
    }

    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(SCANNER.next());
        int secondNumber = Integer.parseInt(SCANNER.next());
        printCompareCharacter(firstNumber, secondNumber);
    }
}
