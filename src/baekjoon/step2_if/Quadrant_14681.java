package baekjoon.step2_if;

import java.util.Scanner;

public class Quadrant_14681 {

    private static void printNegativeXQuadrant(int y) {
        if (y > 0)
            System.out.println("2");
        else
            System.out.println("3");
    }

    private static void printPositiveXQuadrant(int y) {
        if (y > 0)
            System.out.println("1");
        else
            System.out.println("4");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x > 0)
            printPositiveXQuadrant(y);
        else
            printNegativeXQuadrant(y);
    }
}
