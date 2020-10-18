package baekjoon.step12_sort;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Statistics_2108 {
    private static final int ZERO = 0;
    private static final int ONE = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberCounts = Integer.parseInt(bufferedReader.readLine());
        List<Integer> numbers = new ArrayList<>();
        for (int i = ZERO; i < numberCounts; i++) {
            numbers.add(Integer.parseInt(bufferedReader.readLine()));
        }
        Collections.sort(numbers);

        long sum = numbers.stream()
                .reduce(ZERO, Integer::sum);
        int absoluteAverage = (int) Math.round((double) sum / numberCounts);

        Map<Integer, List<Integer>> map = numbers.stream()
                .collect(Collectors.groupingBy(n -> n));
        Collection<List<Integer>> values = map.values();
        int modeSize = ZERO;
        for (List<Integer> tmp : values) {
            int tmpModeSize = tmp.size();
            modeSize = Math.max(modeSize, tmpModeSize);
        }
        final int modeSizeFinal = modeSize;
        List<Integer> modes = values.stream()
                .filter(n -> n.size() == modeSizeFinal)
                .map(n -> n.get(ZERO))
                .sorted()
                .collect(Collectors.toList());
        int modeValue = ZERO;
        if (modes.size() == 1)
            modeValue = modes.get(ZERO);
        else
            modeValue = modes.get(ONE);
        int middleValue = numbers.get(numberCounts / 2);
        int range = numbers.get(numberCounts - ONE) - numbers.get(ZERO);

        bufferedWriter.write(String.format("%d\n", absoluteAverage));
        bufferedWriter.write(String.format("%d\n", middleValue));
        bufferedWriter.write(String.format("%d\n", modeValue));
        bufferedWriter.write(String.format("%d\n", range));
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
