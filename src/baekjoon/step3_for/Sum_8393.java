package baekjoon.step3_for;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Sum_8393 {

    public static void main(String[] args) {
        int maxNumber = new Scanner(System.in).nextInt();
        int result = IntStream.rangeClosed(1, maxNumber)
                .sum();
        System.out.println(result);
    }
}
