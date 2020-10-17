package baekjoon.step10_recursion;

import java.util.Scanner;

public class FibonacciNumbers_10870 {

    public static void main(String[] args) {
        int orderNumber = new Scanner(System.in).nextInt();
        int result = getFibonacciNumbers(orderNumber);
        System.out.println(result);
    }

    private static int getFibonacciNumbers(int orderNumber) {
        if (orderNumber == 0)
            return 0;
        else if (orderNumber == 1)
            return 1;
        return getFibonacciNumbers(orderNumber - 1) + getFibonacciNumbers(orderNumber - 2);
    }
}
