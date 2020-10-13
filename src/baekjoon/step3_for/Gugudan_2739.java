package baekjoon.step3_for;

import java.util.Scanner;

public class Gugudan_2739 {

    public static void main(String[] args) {
        int numberUnit = new Scanner(System.in).nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(String.format("%d * %d = %d", numberUnit, i, numberUnit * i));
        }
    }
}
