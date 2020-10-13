package baekjoon.step7_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WordStudy_1157 {
    private static final int ALPHABET_COUNTS = 26;
    private static final int ZERO = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char[] words = bufferedReader.readLine()
                .toUpperCase()
                .toCharArray();
        int[] wordCounts = new int[ALPHABET_COUNTS];
        for (char word : words)
            wordCounts[word - 'A']++;
        int maximumUsingCounts = ZERO;
        int index = ZERO;
        for (int i = ZERO; i < ALPHABET_COUNTS; i++) {
            if (wordCounts[i] > maximumUsingCounts) {
                maximumUsingCounts = wordCounts[i];
                index = i;
            }
        }
        Arrays.sort(wordCounts);
        if (wordCounts[ALPHABET_COUNTS - 2] == maximumUsingCounts)
            System.out.println("?");
        else
            System.out.println((char) (index + 'A'));
    }
}
