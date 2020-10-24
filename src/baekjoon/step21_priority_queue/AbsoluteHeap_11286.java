package baekjoon.step21_priority_queue;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class AbsoluteHeap_11286 {
    private static final int ZERO = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int operationCounts = Integer.parseInt(bufferedReader.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int absoluteO1 = Math.abs(o1);
                int absoluteO2 = Math.abs(o2);
                if (absoluteO1 > absoluteO2) {
                    return 1;
                } else if (absoluteO1 < absoluteO2) {
                    return -1;
                }
                int intValueO1 = o1.intValue();
                int intValueO2 = o2.intValue();
                if (intValueO1 > intValueO2) {
                    return 1;
                } else if (intValueO1 < intValueO2) {
                    return -1;
                }
                return 0;
            }
        });
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
