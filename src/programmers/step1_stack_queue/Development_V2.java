package programmers.step1_stack_queue;

import java.util.*;

public class Development_V2 {
    private static final int ZERO = 0;
    private static final int PROGRESS_COMPLETION_PERCENT = 100;

    public static int[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> queue = new ArrayDeque<>();
        List<Integer> answer = new ArrayList<>();
        int developmentTaskCounts = progresses.length;
        for (int i = ZERO; i < developmentTaskCounts; i++) {
            queue.add(i);
        }
        while (!queue.isEmpty()) {
            int priorityDevelopmentTaskIndex = queue.peek();
            for (int i = priorityDevelopmentTaskIndex; i < developmentTaskCounts; i++) {
                progresses[i] += speeds[i];
            }
            int deployCounts = ZERO;
            for (int i = priorityDevelopmentTaskIndex; i < developmentTaskCounts; i++) {
                if (progresses[i] >= PROGRESS_COMPLETION_PERCENT) {
                    deployCounts++;
                    queue.poll();
                } else {
                    break;
                }
            }
            if (deployCounts != ZERO) {
                answer.add(deployCounts);
            }
        }
        return answer.stream()
                .mapToInt(deployCount -> deployCount)
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{93, 30, 55}, new int[]{1, 30, 5})));
        System.out.println(Arrays.toString(solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1})));
        System.out.println(Arrays.toString(solution(new int[]{50}, new int[]{1})));
    }
}
