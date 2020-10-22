package baekjoon.step17_stack;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Stack_10828 {
    private static final int ZERO = 0;
    private static final String SPACE_DELIMITER = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> stack = new ArrayDeque<>();
        int commandCounts = Integer.parseInt(bufferedReader.readLine());
        for (int i = ZERO; i < commandCounts; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
            String command = stringTokenizer.nextToken();
            if (command.equals("push")) {
                int number = Integer.parseInt(stringTokenizer.nextToken());
                stack.push(number);
            } else {
                bufferedWriter.write(getStackState(command, stack));
                bufferedWriter.newLine();
            }
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();

    }

    private static String getStackState(String command, Deque<Integer> stack) {
        if (command.equals("size"))
            return String.valueOf(stack.size());
        else if (command.equals("empty"))
            return stack.isEmpty() ? "1" : "0";
        if (stack.isEmpty())
            return "-1";
        return command.equals("pop") ? String.valueOf(stack.pop()) : String.valueOf(stack.peek());
    }
}
