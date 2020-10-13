package baekjoon.step5_array;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class NumberCounts_2577 {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int NUMBER_COUNTS = 3;
    private static final int MAXIMUM_NUMER = 9;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        long multipleResult = ONE;
        for (int i = ZERO; i < NUMBER_COUNTS; i++)
            multipleResult *= Long.parseLong(bufferedReader.readLine());
        List<Character> numbers = String.valueOf(multipleResult).chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
        for (int i = ZERO; i <= MAXIMUM_NUMER; i++) {
            final char convertedNumber = (char) (i + '0');
            int count = (int) numbers.stream()
                    .filter(t -> t.equals(convertedNumber))
                    .count();
            bufferedWriter.write(String.valueOf(count));
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
