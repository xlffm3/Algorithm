package baekjoon.step8_math1;

import java.util.Scanner;

public class BeeHive_2292 {

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        if (number == 1) {
            System.out.println(1);
            return;
        }
        int result = 1;
        while (true) {
            int openRange = 2 + ((result * (result - 1) * 6) / 2);
            int closeRange = 2 + (((result + 1) * (result) * 6) / 2);

            if (openRange <= number && number < closeRange) {
                System.out.println(result + 1);
                return;
            }
            result++;
        }
    }
}
