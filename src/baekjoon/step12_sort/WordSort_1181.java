package baekjoon.step12_sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WordSort_1181 {
    private static final int ZERO = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int wordCounts = Integer.parseInt(bufferedReader.readLine());
        List<String> words = new ArrayList<>();
        for (int i = ZERO; i < wordCounts; i++) {
            words.add(bufferedReader.readLine());
        }
        words = words.stream()
                .distinct()
                .collect(Collectors.toList());
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2))
                    return 0;
                int o1Length = o1.length();
                int o2Length = o2.length();
                if (o1Length > o2Length)
                    return 1;
                else if (o1Length == o2Length) {
                    char[] a1 = o1.toCharArray();
                    char[] a2 = o2.toCharArray();
                    for (int i = ZERO; i < o1Length; i++) {
                        if (a1[i] != a2[i])
                            return a1[i] - a2[i];
                    }
                }
                return -1;
            }
        });
        for (String word : words) {
            bufferedWriter.write(word);
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
