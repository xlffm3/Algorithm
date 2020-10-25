package baekjoon.step20_binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Router_2110 {
    private static final String SPACE_DELIMITER = " ";
    private static final int ZERO = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
        int houseCounts = Integer.parseInt(stringTokenizer.nextToken());
        int routerCounts = Integer.parseInt(stringTokenizer.nextToken());
        int[] houseCoordinates = new int[houseCounts];
        for (int i = ZERO; i < houseCounts; i++) {
            houseCoordinates[i] = Integer.parseInt(bufferedReader.readLine());
        }
        bufferedReader.close();
        Arrays.sort(houseCoordinates);
        long left = 1;
        long right = houseCoordinates[houseCounts - 1] - houseCoordinates[ZERO];
        long distance = ZERO;
        long answer = ZERO;
        while (left <= right) {
            long mid = (left + right) / 2;
            long start = houseCoordinates[ZERO];
            int count = 1;
            for (int i = 1; i < houseCounts; i++) {
                distance = houseCoordinates[i] - start;
                if (distance >= mid) {
                    count++;
                    start = houseCoordinates[i];
                }
            }
            if (count >= routerCounts) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(answer);
    }
}
