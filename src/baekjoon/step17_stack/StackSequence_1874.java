package baekjoon.step17_stack;

import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class StackSequence_1874 {
    private static final int ZERO = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine());
        List<Integer> numbers = new ArrayList<>();
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = ZERO; i < n; i++) {
            int number = Integer.parseInt(bufferedReader.readLine());
            numbers.add(number);
        }
        bufferedReader.close();
        StringBuilder stringBuilder = new StringBuilder();
        int k = 1;
        for (Integer number : numbers) {
            int intValue = number.intValue();
            if (k <= intValue) {
                while (k <= intValue) {
                    stack.push(k);
                    k++;
                    stringBuilder.append("+\n");
                }
            }
            if (stack.peek() == intValue) {
                stack.pop();
                stringBuilder.append("-\n");
            }
        }
        bufferedWriter.write(stack.isEmpty() ? stringBuilder.toString() : "NO\n");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
