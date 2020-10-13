package baekjoon.step5_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Remainder_3052 {
    private static final int ZERO = 0;
    private static final int TEST_CASE_COUNTS = 9;
    private static final int REMAIN_NUMBER = 42;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> remainders = new ArrayList<>();
        for (int i = ZERO; i <= TEST_CASE_COUNTS; i++)
            remainders.add(Integer.parseInt(bufferedReader.readLine()) % REMAIN_NUMBER);
        bufferedReader.close();
        remainders = remainders.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(remainders.size());
    }
}
