package baekjoon.step16_math3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class FashionKing_9375 {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final String SPACE_DELIMITER = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCaseCounts = Integer.parseInt(bufferedReader.readLine());
        for (int i = ZERO; i < testCaseCounts; i++) {
            int clothesCounts = Integer.parseInt(bufferedReader.readLine());
            Map<String, Integer> clothesMap = new HashMap<>();
            for (int j = ZERO; j < clothesCounts; j++) {
                StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
                stringTokenizer.nextToken();
                String categoryName = stringTokenizer.nextToken();
                clothesMap.put(categoryName, clothesMap.getOrDefault(categoryName, ONE) + ONE);
            }
            long sum = clothesMap.values()
                    .stream()
                    .reduce(1, (a, b) -> a * b) - ONE;
            bufferedWriter.write(String.valueOf(sum));
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
