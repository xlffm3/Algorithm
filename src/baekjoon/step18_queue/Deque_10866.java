package baekjoon.step18_queue;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_10866 {
    private static final int ZERO = 0;
    private static final String SPACE_DELIMITER = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCaseCounts = Integer.parseInt(bufferedReader.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = ZERO; i < testCaseCounts; i++) {
            String command = bufferedReader.readLine();
            if (command.contains("push")) {
                push(deque, command);
            } else {
                int result = executeCommand(deque, command);
                bufferedWriter.write(String.format("%d\n", result));
            }
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    private static int executeCommand(Deque<Integer> deque, String command) {
        if (command.equals("pop_front")) {
            return deque.isEmpty() ? -1 : deque.pollFirst();
        } else if (command.equals("pop_back")) {
            return deque.isEmpty() ? -1 : deque.pollLast();
        } else if (command.equals("size")) {
            return deque.size();
        } else if (command.equals("empty")) {
            return deque.isEmpty() ? 1 : 0;
        }
        if (deque.isEmpty()) {
            return -1;
        }
        return command.equals("front") ? deque.peekFirst() : deque.peekLast();
    }

    private static void push(Deque<Integer> deque, String command) {
        String[] tokens = command.split(SPACE_DELIMITER);
        if (tokens[0].equals("push_front")) {
            deque.push(Integer.parseInt(tokens[1]));
        } else if (tokens[0].equals("push_back")) {
            deque.add(Integer.parseInt(tokens[1]));
        }
    }
}
