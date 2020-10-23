package baekjoon.step18_queue;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Queue_18258 {
    private static final int ZERO = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> queue = new ArrayDeque<>();
        int commandCounts = Integer.parseInt(bufferedReader.readLine());
        for (int i = ZERO; i < commandCounts; i++) {
            String command = bufferedReader.readLine();
            if (command.contains("push")) {
                queue.add(Integer.parseInt(command.substring(5)));
            } else {
                int result = analyzeCommand(command, queue);
                bufferedWriter.write(String.format("%d\n", result));
            }
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    private static int analyzeCommand(String command, Deque<Integer> queue) {
        if (command.equals("pop")) {
            return queue.isEmpty() ? -1 : queue.poll();
        } else if (command.equals("size")) {
            return queue.size();
        } else if (command.equals("empty")) {
            return queue.isEmpty() ? 1 : 0;
        }
        if (queue.isEmpty())
            return -1;
        return command.equals("front") ? queue.element() : queue.peekLast();
    }
}
