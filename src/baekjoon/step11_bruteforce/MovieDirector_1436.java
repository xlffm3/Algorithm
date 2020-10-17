package baekjoon.step11_bruteforce;

import java.util.Scanner;

public class MovieDirector_1436 {
    private static final int ZERO = 0;
    private static final String APOCALYPSE_PATTERN = "666";

    public static void main(String[] args) {
        int orderNumber = new Scanner(System.in).nextInt();
        int apocalypseNumber = 665;
        while (orderNumber > ZERO) {
            apocalypseNumber++;
            String pattern = String.valueOf(apocalypseNumber);
            if (pattern.contains(APOCALYPSE_PATTERN)) {
                orderNumber--;
            }
        }
        System.out.println(apocalypseNumber);
    }
}
