package baekjoon.step20_binary_search;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FindingNumber_1920 {
    private static final String SPACE_DELIMITER = " ";
    private static final int ZERO = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] numbers = new int[n];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
        for (int i = ZERO; i < n; i++) {
            numbers[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        int m = Integer.parseInt(bufferedReader.readLine());
        int[] inspectors = new int[m];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
        bufferedReader.close();
        for (int i = ZERO; i < m; i++) {
            inspectors[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(numbers);
        for (int inspector : inspectors) {
            int low = ZERO;
            int high = n - 1;
            boolean isExisting = false;
            while (low <= high) {
                int mid = (high + low) / 2;
                if (numbers[mid] < inspector) {
                    low = mid + 1;
                } else if (numbers[mid] > inspector) {
                    high = mid - 1;
                } else {
                    isExisting = true;
                    break;
                }
            }
            if (isExisting) {
                bufferedWriter.write("1\n");
            } else {
                bufferedWriter.write("0\n");
            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
