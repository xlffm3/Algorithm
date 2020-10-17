package baekjoon.step11_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Size_7568 {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final String SPACE_DELIMITER = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int peopleCounts = Integer.parseInt(bufferedReader.readLine());
        int[] heights = new int[peopleCounts];
        int[] weights = new int[peopleCounts];
        int[] ranks = new int[peopleCounts];
        Arrays.fill(ranks, ONE);
        for (int i = ZERO; i < peopleCounts; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
            weights[i] = Integer.parseInt(stringTokenizer.nextToken());
            heights[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        bufferedReader.close();
        for (int i = ZERO; i < peopleCounts; i++) {
            for (int j = i + ONE; j < peopleCounts; j++) {
                if (heights[i] > heights[j] && weights[i] > weights[j])
                    ranks[j]++;
                else if (heights[i] < heights[j] && weights[i] < weights[j])
                    ranks[i]++;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int rank : ranks) {
            stringBuilder.append(rank);
            stringBuilder.append(SPACE_DELIMITER);
        }
        System.out.println(stringBuilder.toString());
    }
}
