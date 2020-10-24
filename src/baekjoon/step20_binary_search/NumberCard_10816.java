package baekjoon.step20_binary_search;

import java.io.*;
import java.util.StringTokenizer;

public class NumberCard_10816 {
    private static final String SPACE_DELIMITER = " ";
    private static final int ZERO = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int cardCounts = Integer.parseInt(bufferedReader.readLine());
        int[] cardNumbers = new int[20_000_001];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
        for (int i = ZERO; i < cardCounts; i++) {
            cardNumbers[Integer.parseInt(stringTokenizer.nextToken()) + 10_000_000]++;
        }
        int inspectorCounts = Integer.parseInt(bufferedReader.readLine());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
        bufferedReader.close();
        for (int i = ZERO; i < inspectorCounts; i++) {
            int number = Integer.parseInt(stringTokenizer.nextToken());
            bufferedWriter.write(String.format("%d ", cardNumbers[number + 10_000_000]));
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
