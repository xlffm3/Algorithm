package baekjoon.step5_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Max_2562 {
    private static final int ONE = 1;
    private static final int TEST_CASE_COUNTS = 9;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();
        for (int i = ONE; i <= TEST_CASE_COUNTS; i++)
            numbers.add(Integer.parseInt(bufferedReader.readLine()));
        bufferedReader.close();
        int maxNumber = numbers.stream()
                .max(Comparator.naturalOrder())
                .get();
        System.out.println(maxNumber);
        System.out.println(numbers.indexOf(maxNumber) + 1);
    }
}
