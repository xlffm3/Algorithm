package baekjoon.step10_recursion;

import java.util.Scanner;

public class Factorial_10872 {

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        int result = getFactorial(number);
        System.out.println(result);
    }

    private static int getFactorial(int number) {
        if (number == 0)
            return 1;
        return number * getFactorial(number - 1);
    }
}
