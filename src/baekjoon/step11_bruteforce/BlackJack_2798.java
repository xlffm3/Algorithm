package baekjoon.step11_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BlackJack_2798 {
    private static final String SPACE_DELIMITER = " ";
    private static final int ZERO = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
        int cardCounts = Integer.parseInt(stringTokenizer.nextToken());
        int maxSum = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
        bufferedReader.close();
        int[] arr = new int[cardCounts];
        for (int i = ZERO; i < cardCounts; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(arr);
        int sum = ZERO;
        for (int i = 0; i < cardCounts; i++) {
            for (int j = i + 1; j < cardCounts; j++) {
                for (int k = j + 1; k < cardCounts; k++) {
                    int tmp = arr[i] + arr[j] + arr[k];
                    if (tmp <= maxSum) {
                        sum = Math.max(sum, tmp);
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
