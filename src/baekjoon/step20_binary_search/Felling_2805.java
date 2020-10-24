package baekjoon.step20_binary_search;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Felling_2805 {
    private static final String SPACE_DELIMITER = " ";
    private static final int ZERO = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
        int treeCounts = Integer.parseInt(stringTokenizer.nextToken());
        int necessaryTreeLength = Integer.parseInt(stringTokenizer.nextToken());
        int[] treeHeights = new int[treeCounts];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
        bufferedReader.close();
        for (int i = ZERO; i < treeCounts; i++) {
            treeHeights[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(treeHeights);
        long low = 1;
        long high = treeHeights[treeCounts - 1];
        while (low <= high) {
            long mid = (low + high) / 2;
            long fellingLength = Arrays.stream(treeHeights)
                    .mapToLong(treeHeight -> Math.max(treeHeight - mid, ZERO))
                    .sum();
            if (fellingLength < necessaryTreeLength) {
                high = mid - 1;
            } else if (fellingLength >= necessaryTreeLength) {
                low = mid + 1;
            }
        }
        System.out.println(high);
    }
}
