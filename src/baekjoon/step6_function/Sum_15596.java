package baekjoon.step6_function;

import java.util.Arrays;

public class Sum_15596 {

    public long sum(int[] a) {
        return Arrays.stream(a)
                .mapToLong(number -> (long) number)
                .sum();
    }
}
