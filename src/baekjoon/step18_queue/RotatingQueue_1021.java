package baekjoon.step18_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class RotatingQueue_1021 {
    private static final String SPACE_DELIMITER = " ";
    private static final int ZERO = 0;
    private static final int ONE = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
        bufferedReader.close();
        int[] targetNumbers = new int[m];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = ZERO; i < m; i++) {
            targetNumbers[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        for (int i = ONE; i <= n; i++) {
            deque.add(i);
        }
        int minimumOperationCounts = ZERO;
        for (int number : targetNumbers) {
            int firstElement = deque.peek();
            if (firstElement == number) {
                deque.pop();
            } else {
                int index = new ArrayList<>(deque)
                        .indexOf(number);
                if (index <= deque.size() / 2) {
                    while (deque.peek() != number) {
                        deque.add(deque.pop());
                        minimumOperationCounts++;
                    }
                } else {
                    while (deque.peek() != number) {
                        deque.push(deque.pollLast());
                        minimumOperationCounts++;
                    }
                }
                deque.pop();
            }
        }
        System.out.println(minimumOperationCounts);
    }
}
