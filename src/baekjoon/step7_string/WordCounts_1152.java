package baekjoon.step7_string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCounts_1152 {
    private static final String SPACE_DELIMITER = " ";

    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        int wordCounts = new StringTokenizer(input, SPACE_DELIMITER)
                .countTokens();
        System.out.println(wordCounts);
    }
}
