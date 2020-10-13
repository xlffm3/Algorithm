package baekjoon.step7_string;

import java.util.Scanner;

public class Alphabet_10809 {
    private static final int ALPHABET_COUNTS = 26;
    private static final int ZERO = 0;

    public static void main(String[] args) {
        char[] word = new Scanner(System.in)
                .nextLine()
                .toCharArray();
        int[] locations = new int[ALPHABET_COUNTS];
        for (int i = ZERO; i < ALPHABET_COUNTS; i++)
            locations[i] = -1;
        for (int i = ZERO; i < word.length; i++) {
            if (locations[word[i] - 'a'] == -1)
                locations[word[i] - 'a'] = i;
        }
        for (int index : locations)
            System.out.print(index + " ");
    }
}
