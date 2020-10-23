package baekjoon.step18_queue;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class AC_5430 {
    private static final int ZERO = 0;
    private static final String COMMA = ",";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCaseCounts = Integer.parseInt(bufferedReader.readLine());
        for (int i = ZERO; i < testCaseCounts; i++) {
            char[] functions = bufferedReader.readLine()
                    .toCharArray();
            int numberCounts = Integer.parseInt(bufferedReader.readLine());
            String line = bufferedReader.readLine();
            String numbers = line.substring(1, line.length() - 1);
            StringTokenizer stringTokenizer = new StringTokenizer(numbers, COMMA);
            Deque<Integer> deque = new ArrayDeque<>();
            for (int j = ZERO; j < numberCounts; j++) {
                deque.add(Integer.parseInt(stringTokenizer.nextToken()));
            }
            boolean isReverse = false;
            boolean isError = false;
            for (char function : functions) {
                if (function == 'R') {
                    isReverse = !isReverse;
                } else if (function == 'D') {
                    if (deque.size() == ZERO) {
                        isError = true;
                        break;
                    }
                    if (isReverse) {
                        deque.pollLast();
                    } else {
                        deque.pop();
                    }
                }
            }
            if (isError) {
                bufferedWriter.write("error\n");
            } else {
                bufferedWriter.write(getAnswer(deque, isReverse));
                bufferedWriter.newLine();
            }
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    private static String getAnswer(Deque<Integer> deque, boolean isReverse) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        while (!deque.isEmpty()) {
            if (isReverse) {
                stringBuilder.append(deque.pollLast());
            } else {
                stringBuilder.append(deque.pop());
            }
            if (!deque.isEmpty()) {
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
