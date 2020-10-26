package programmers.step4_sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BigNumber {
    private static final String ZERO = "0";

    public static String solution(int[] numbers) {
        List<String> list = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted((a, b) -> Integer.parseInt(b + a) - Integer.parseInt(a + b))
                .collect(Collectors.toList());
        StringBuilder stringBuilder = new StringBuilder();
        list.forEach(stringBuilder::append);
        String answer = stringBuilder.toString();
        return (answer.startsWith(ZERO)) ? ZERO : answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{6, 10, 2}));
        System.out.println(solution(new int[]{3, 30, 34, 5, 9}));
        System.out.println(solution(new int[]{1, 0, 0, 9}));
        System.out.println(solution(new int[]{1, 0, 10, 11, 101, 10, 100}));
    }
}
