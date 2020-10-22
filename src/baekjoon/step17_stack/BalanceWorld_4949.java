package baekjoon.step17_stack;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class BalanceWorld_4949 {
    private static final String END_COMMAND = ".";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Character> stack = new ArrayDeque<>();
        while (true) {
            String line = bufferedReader.readLine();
            if (line.equals(END_COMMAND)) {
                break;
            }
            char[] arr = line.toCharArray();
            for (char c : arr) {
                if (c != '(' && c != '[' && c != ')' && c != ']') {
                    continue;
                }
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
            if (stack.isEmpty()) {
                bufferedWriter.write("yes\n");
            } else {
                bufferedWriter.write("no\n");
            }
            stack.clear();
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
