package baekjoon.step17_stack;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Parenthesis_9012 {
    private static final int ZERO = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCaseCounts = Integer.parseInt(bufferedReader.readLine());
        for (int i = ZERO; i < testCaseCounts; i++) {
            Deque<Character> stack = new ArrayDeque<>();
            char[] parenthesises = bufferedReader.readLine()
                    .toCharArray();
            for (char parenthesis : parenthesises) {
                stack.push(parenthesis);
            }
            boolean isCorrectParenthesisString = true;
            int openBracketCounts = ZERO;
            while (!stack.isEmpty()) {
                char bracket = stack.pop();
                if (bracket == ')') {
                    openBracketCounts++;
                } else if (bracket == '(')
                    openBracketCounts--;
                if (openBracketCounts < ZERO) {
                    isCorrectParenthesisString = false;
                    break;
                }
            }
            if (openBracketCounts == ZERO && isCorrectParenthesisString) {
                bufferedWriter.write("YES\n");
            } else {
                bufferedWriter.write("NO\n");
            }
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
