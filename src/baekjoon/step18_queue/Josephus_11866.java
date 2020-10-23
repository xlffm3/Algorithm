package baekjoon.step18_queue;

import java.util.*;

public class Josephus_11866 {
    private static final int ZERO = 0;
    private static final int ONE = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = ONE; i <= n; i++) {
            queue.add(i);
        }
        int count = ZERO;
        List<Integer> josephusNumbers = new ArrayList<>();
        while (!queue.isEmpty()) {
            int element = queue.poll();
            count++;
            if (count == k || queue.isEmpty()) {
                josephusNumbers.add(element);
                count = ZERO;
            } else {
                queue.add(element);
            }
        }
        stringBuilder.append("<");
        for (int i = ZERO; i < n; i++) {
            stringBuilder.append(josephusNumbers.get(i));
            if (i != n - ONE) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append(">");
        System.out.println(stringBuilder);
    }
}
