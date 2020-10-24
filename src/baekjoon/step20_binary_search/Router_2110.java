package baekjoon.step20_binary_search;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Router_2110 {
    private static final String SPACE_DELIMITER = " ";
    private static final int ZERO = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
        int houseCounts = Integer.parseInt(stringTokenizer.nextToken());
        int routerCounts = Integer.parseInt(stringTokenizer.nextToken());
        int[] houseCoordinates = new int[200_001];
        for (int i = ZERO; i < houseCounts; i++) {
            houseCoordinates[Integer.parseInt(bufferedReader.readLine())]++;
        }
        Arrays.sort(houseCoordinates);
        int low = 1;
        int high = houseCoordinates[houseCounts - 1];
        while (low <= high) {
            int mid = (low + high) / 2;
            int possibleRouterCounts = ZERO;
            for (int j = 0; j < houseCounts; j++) {

            }
        }
    }
}
