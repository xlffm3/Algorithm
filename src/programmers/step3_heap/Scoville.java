package programmers.step3_heap;

import java.util.PriorityQueue;

public class Scoville {
    private static final int ZERO = 0;
    private static final int ONE = 1;

    public static int solution(int[] scoville, int K) {
        PriorityQueue<Integer> scovilleQueue = new PriorityQueue<>();
        int answer = ZERO;
        for (int scovilleScore : scoville) {
            scovilleQueue.add(scovilleScore);
        }
        while (isMixable(scovilleQueue, K)) {
            if (scovilleQueue.size() == ONE && scovilleQueue.peek() < K) {
                return -1;
            }
            int firstScovilleScore = scovilleQueue.poll();
            int secondScovilleScore = scovilleQueue.poll();
            int mixScovilleScore = firstScovilleScore + secondScovilleScore * 2;
            scovilleQueue.add(mixScovilleScore);
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
        System.out.println(solution(new int[]{0, 1}, 2));
        System.out.println(solution(new int[]{0, 1}, 3));
    }

    private static boolean isMixable(PriorityQueue<Integer> scovilleQueue, int k) {
        return scovilleQueue.stream()
                .anyMatch(scovileScore -> scovileScore < k);
    }
}
