package programmers.step3_heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class DoublePriorityQueue {
    private static final String INSERTION = "I";
    private static final String MAX_DELETION = "D 1";
    private static final String MIN_DELETION = "D -1";
    private static final int NUMBER_START_INDEX = 2;
    private static final int MAX_INDEX = 0;
    private static final int MIN_INDEX = 1;

    public int[] solution(String[] operations) {
        PriorityQueue<Integer> minimumHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maximumHeap = new PriorityQueue<>(Comparator.reverseOrder());
        int[] answer = new int[2];
        for (String operation : operations) {
            if (operation.startsWith(INSERTION)) {
                int number = Integer.parseInt(operation.substring(NUMBER_START_INDEX));
                minimumHeap.add(number);
                maximumHeap.add(number);
            } else if (operation.equals(MAX_DELETION) && !maximumHeap.isEmpty()) {
                deleteNumber(minimumHeap, maximumHeap.poll());
            } else if (operation.equals(MIN_DELETION) && !minimumHeap.isEmpty()) {
                deleteNumber(maximumHeap, minimumHeap.poll());
            }
        }
        if (!maximumHeap.isEmpty()) {
            answer[MAX_INDEX] = maximumHeap.poll();
        }
        if (!minimumHeap.isEmpty()) {
            answer[MIN_INDEX] = minimumHeap.poll();
        }
        return answer;
    }

    private void deleteNumber(PriorityQueue<Integer> heap, int number) {
        List<Integer> list = new ArrayList<>();
        while (!heap.isEmpty()) {
            int tmp = heap.poll();
            if (tmp == number) {
                break;
            }
            list.add(tmp);
        }
        heap.addAll(list);
    }
}
