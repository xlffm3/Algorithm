package baekjoon.step5_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class MinAndMax_10818 {
    private static final String SPACE_DELIMITER = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberCounts = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
        bufferedReader.close();
        List<Integer> numbers = new ArrayList<>();
        while (stringTokenizer.hasMoreTokens())
            numbers.add(Integer.parseInt(stringTokenizer.nextToken()));
        numbers.sort(Comparator.naturalOrder());
        System.out.printf("%d %d\n", numbers.get(0), numbers.get(numberCounts - 1));
    }
}
