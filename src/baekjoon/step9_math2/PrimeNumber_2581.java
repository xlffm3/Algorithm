package baekjoon.step9_math2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber_2581 {
    private static final int ZERO = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = m; i <= n; i++) {
            if (isPrimeNumber(i))
                primeNumbers.add(i);
        }
        if (primeNumbers.size() == ZERO)
            System.out.println(-1);
        else {
            System.out.println(primeNumbers.stream().reduce(0, Integer::sum));
            System.out.println(primeNumbers.get(0));
        }
    }

    private static boolean isPrimeNumber(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == ZERO)
                return false;
        }
        return true;
    }
}
