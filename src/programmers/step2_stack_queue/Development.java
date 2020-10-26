package programmers.step2_stack_queue;

import java.util.*;

public class Development {
    private static final int ZERO = 0;
    private static final int INDEX = 0;
    private static final int PROGRESS_PERCENT_INDEX = 1;
    private static final int PROGRESS_COMPLETION = 100;

    public static int[] solution(int[] progresses, int[] speeds) {
        Deque<int[]> queue = new ArrayDeque<>();
        List<Integer> answer = new ArrayList<>();
        int developmentTaskCounts = progresses.length;
        for (int i = ZERO; i < developmentTaskCounts; i++) {
            queue.add(new int[]{i, progresses[i]});
        }
        while (!queue.isEmpty()) {
            int ongoingDevelopmentCounts = queue.size();
            for (int i = ZERO; i < ongoingDevelopmentCounts; i++) {
                int[] pollData = queue.poll();
                pollData[PROGRESS_PERCENT_INDEX] += speeds[pollData[INDEX]];
                queue.add(pollData);
            }
            int deployCounts = ZERO;
            while (!queue.isEmpty()) {
                if (queue.peek()[PROGRESS_PERCENT_INDEX] >= PROGRESS_COMPLETION) {
                    queue.poll();
                    deployCounts++;
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
