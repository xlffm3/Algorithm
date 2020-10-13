package baekjoon.step1_io;

import java.util.Scanner;

public class Remainder_10430 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(SCANNER.next());
        int secondNumber = Integer.parseInt(SCANNER.next());
        int thirdNumber = Integer.parseInt(SCANNER.next());
        System.out.println((firstNumber + secondNumber) % thirdNumber);
        System.out.println(((firstNumber % thirdNumber) + (secondNumber % thirdNumber)) % thirdNumber);
        System.out.println((firstNumber * secondNumber) % thirdNumber);
        System.out.println(((firstNumber % thirdNumber) * (secondNumber % thirdNumber)) % thirdNumber);
    }
}
