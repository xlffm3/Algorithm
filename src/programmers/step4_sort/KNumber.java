package programmers.step4_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KNumber {
    private static final int START_INDEX = 0;
    private static final int END_INDEX = 1;
    private static final int K_NUMBER_INDEX = 2;
    private static final int ZERO = 0;
    private static final int ONE = 1;

    public static int[] solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();
        for (int[] command : commands) {
            int[] splitArray = Arrays.copyOfRange(array, command[START_INDEX] - ONE, command[END_INDEX]);
            Arrays.sort(splitArray);
            answer.add(splitArray[command[K_NUMBER_INDEX] - ONE]);
        }
        return answer.stream()
                .mapToInt(number -> number)
                .toArray();
    }
}
