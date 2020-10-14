package baekjoon.step8_math1;

import java.util.Scanner;

public class Fraction_1193 {

    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        int n = 0;
        while (n * (n + 1) < number * 2)
            n++;
        System.out.println(n);
        int i = 0;
        int j = 0;

        if ((n - 1) % 2 == 0) {

        }
        /*
        대각선의 합
        2
            3
                4
                    5
                        6
                            7...

                            대충 숫자가 들어오면 1 ~ n까지의 합 n(n+1)/2 를 통해 i/j 형태에서 i+j의 값은 확인 가능.
                            그럼 대충 1/i+j-1인지 i+j-1/1인지 위치는알수있음..

                            n*n+1 <= number * 2
         */

    }

}
