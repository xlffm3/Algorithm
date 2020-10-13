package baekjoon.step7_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupWordChecker_1316 {
    private static final int ZERO = 0;
    private static final int ALPHABET_COUNTS = 26;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCaseTotal = Integer.parseInt(bufferedReader.readLine());
        int groupWordCounts = ZERO;
        for (int i = ZERO; i < testCaseTotal; i++) {
            String word = bufferedReader.readLine();
            int wordLength = word.length();
            int[] wordCounts = new int[ALPHABET_COUNTS];
            boolean isGroupWord = true;
            for (int j = ZERO; j < wordLength; j++) {
                if (wordCounts[word.charAt(j) - 'a'] == 0)
                    wordCounts[word.charAt(j) - 'a']++;
                else {
                    if (word.charAt(j - 1) != word.charAt(j)) {
                        isGroupWord = false;
                        break;
                    }
                }
            }
            if (isGroupWord)
                groupWordCounts++;
        }
        bufferedReader.close();
        System.out.println(groupWordCounts);
    }
}
