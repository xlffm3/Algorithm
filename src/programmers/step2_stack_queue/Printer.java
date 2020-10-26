package programmers.step2_stack_queue;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;

public class Printer {
    private static final int ZERO = 0;
    private static final int LOCATION_INDEX = 0;
    private static final int PRIORITY_INDEX = 1;

    public static int solution(int[] priorities, int location) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        Deque<int[]> waitingPrinterQueue = new ArrayDeque<>();
        int answer = ZERO;
        int documentCounts = priorities.length;
        for (int i = ZERO; i < documentCounts; i++) {
            priorityQueue.add(priorities[i]);
            waitingPrinterQueue.add(new int[]{i, priorities[i]});
        }
        while (!waitingPrinterQueue.isEmpty()) {
            int topPriority = priorityQueue.peek();
            int[] pollPrinterData = waitingPrinterQueue.poll();
            if (pollPrinterData[PRIORITY_INDEX] == topPriority) {
                priorityQueue.poll();
                answer++;
                if (pollPrinterData[LOCATION_INDEX] == location) {
                    break;
                }
            } else {
                waitingPrinterQueue.add(pollPrinterData);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 3, 2}, 2));
        System.out.println(solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }
}
