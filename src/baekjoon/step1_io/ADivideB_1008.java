package baekjoon.step1_io;

import java.util.Scanner;

public class ADivideB_1008 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(SCANNER.next());
        int secondNumber = Integer.parseInt(SCANNER.next());
        System.out.println((double) firstNumber / secondNumber);
    }
}
