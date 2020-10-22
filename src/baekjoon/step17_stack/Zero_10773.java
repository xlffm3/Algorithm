package baekjoon.step17_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Zero_10773 {
    private static final int ZERO = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCaseCounts = Integer.parseInt(bufferedReader.readLine());
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = ZERO; i < testCaseCounts; i++) {
            int number = Integer.parseInt(bufferedReader.readLine());
            if (number == ZERO) {
                stack.pop();
            } else {
                stack.push(number);
            }
        }
        bufferedReader.close();
        int sum = (stack.isEmpty()) ? ZERO : stack.stream()
                .reduce(ZERO, Integer::sum);
        System.out.println(sum);
    }
}
