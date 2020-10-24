package baekjoon.step20_binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class LanWire_1654 {
    private static final String SPACE_DELIMITER = " ";
    private static final int ZERO = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
        int k = Integer.parseInt(stringTokenizer.nextToken());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int[] lanWires = new int[k];
        for (int i = ZERO; i < k; i++) {
            lanWires[i] = Integer.parseInt(bufferedReader.readLine());
        }
        bufferedReader.close();
        Arrays.sort(lanWires);
        long low = 1;
        long high = lanWires[k - 1];
        while (low <= high) {
            long mid = (low + high) / 2;
            long possibleLanWireCounts = Arrays.stream(lanWires)
                    .mapToLong(length -> length / mid)
                    .sum();
            if (possibleLanWireCounts < n) {
                high = mid - 1;
            } else if (possibleLanWireCounts >= n) {
                low = mid + 1;
            }
        }
        System.out.println(high);
    }
}
