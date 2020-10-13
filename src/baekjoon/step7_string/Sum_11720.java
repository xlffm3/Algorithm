package baekjoon.step7_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum_11720 {
    private static final int ZERO = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.readLine();
        char[] numbers = bufferedReader.readLine().toCharArray();
        int sum = ZERO;
        for (char number : numbers)
            sum += number - '0';
        bufferedReader.close();
        System.out.println(sum);
    }
}
