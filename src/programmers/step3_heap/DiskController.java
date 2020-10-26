package programmers.step3_heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DiskController {
    private static final int CALL_INDEX = 0;
    private static final int TIME_INDEX = 1;

    public int solution(int[][] jobs) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(o -> o[TIME_INDEX]));
        Arrays.sort(jobs, Comparator.comparingInt(o -> o[CALL_INDEX]));
        int answer = 0;
        return answer;

    }
}
