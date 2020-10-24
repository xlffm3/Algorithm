package baekjoon.step21_priority_queue;

import java.io.*;
import java.util.PriorityQueue;

public class MinimumHeap_1927 {

    private static final int ZERO = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int operationCounts = Integer.parseInt(bufferedReader.readLine());
        for (int i = ZERO; i < operationCounts; i++) {
            int number = Integer.parseInt(bufferedReader.readLine());
            if (number == 0) {
                if (priorityQueue.isEmpty()) {
                    bufferedWriter.write("0\n");
                } else {
                    bufferedWriter.write(String.format("%d\n", priorityQueue.poll()));
                }
            } else {
                priorityQueue.add(number);
            }
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
