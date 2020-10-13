package baekjoon.step7_string;

import java.util.Scanner;

public class Dial_5622 {
    private static final int ZERO = 0;

    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        String[] pattern = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        int[] seconds = {3, 4, 5, 6, 7, 8, 9, 10};
        int inputLength = input.length();
        int totalRequiredSeconds = ZERO;
        for (int i = ZERO; i < inputLength; i++) {
            char currentCharacter = input.charAt(i);
            for (int j = ZERO; j < pattern.length; j++) {
                if (pattern[j].contains(String.valueOf(currentCharacter))) {
                    totalRequiredSeconds += seconds[j];
                    break;
                }
            }
        }
        System.out.println(totalRequiredSeconds);
    }
}
