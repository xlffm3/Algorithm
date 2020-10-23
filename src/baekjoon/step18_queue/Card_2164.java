package baekjoon.step18_queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Card_2164 {
    private static final int ONE = 1;

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = ONE; i <= n; i++) {
            queue.add(i);
        }
        while (queue.size() != ONE) {
            queue.poll();
            queue.add(queue.poll());
        }
        System.out.println(queue.peek());
    }
}
