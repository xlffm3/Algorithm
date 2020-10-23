package baekjoon.step18_queue;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Printer_1966 {
    private static final int ZERO = 0;
    private static final int INDEX = 0;
    private static final int PRIORITY_INDEX = 1;
    private static final String SPACE_DELIMITER = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCaseCounts = Integer.parseInt(bufferedReader.readLine());
        for (int i = ZERO; i < testCaseCounts; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
            int documentCounts = Integer.parseInt(stringTokenizer.nextToken());
            int targetIndex = Integer.parseInt(stringTokenizer.nextToken());
            int[] priorities = new int[documentCounts];
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
            for (int j = ZERO; j < documentCounts; j++) {
                priorities[j] = Integer.parseInt(stringTokenizer.nextToken());
            }
            int orderNumber = calculateOrderNumber(priorities, documentCounts, targetIndex);
            bufferedWriter.write(String.format("%d\n", orderNumber));
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    private static int calculateOrderNumber(int[] priorities, int documentCounts, int targetIndex) {
        Deque<int[]> queue = new ArrayDeque<>();
        for (int i = ZERO; i < documentCounts; i++) {
            queue.add(new int[]{i, priorities[i]});
        }
        Arrays.sort(priorities);
        int topPriorityIndex = documentCounts - 1;
        int orderNumber = ZERO;
        while (!queue.isEmpty()) {
            int[] element = queue.poll();
            if (element[PRIORITY_INDEX] == priorities[topPriorityIndex]) {
                orderNumber++;
                topPriorityIndex--;
                if (element[INDEX] == targetIndex) {
                    break;
                }
            } else {
                queue.add(element);
            }
        }
        return orderNumber;
    }
}
