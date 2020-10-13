package baekjoon.step2_if;

import java.util.Scanner;

public class LeapYear_2753 {

    public static void main(String[] args) {
        int year = new Scanner(System.in)
                .nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
