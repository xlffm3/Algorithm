package baekjoon.step21_priority_queue;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MiddleValue_1655 {
    private static final int ZERO = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> minimumQueue = new PriorityQueue<>();
        PriorityQueue<Integer> maximumQueue = new PriorityQueue<>(Comparator.reverseOrder());
        int numberCounts = Integer.parseInt(bufferedReader.readLine());
        for (int i = ZERO; i < numberCounts; i++) {
            int number = Integer.parseInt(bufferedReader.readLine());
            if (minimumQueue.size() == maximumQueue.size()) {
                maximumQueue.add(number);
            } else {
                minimumQueue.add(number);
            }
            if (!minimumQueue.isEmpty() && !maximumQueue.isEmpty()) {
                if (maximumQueue.peek() > minimumQueue.peek()) {
                    int tmp = maximumQueue.poll();
                    maximumQueue.add(minimumQueue.poll());
                    minimumQueue.add(tmp);
                }
            }
            bufferedWriter.write(String.valueOf(maximumQueue.peek()));
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
