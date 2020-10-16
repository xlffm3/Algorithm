package baekjoon.step9_math2;

import java.util.Scanner;

public class Sqare_1085 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int minimumVerticalDistance = Math.min(h - y, y);
        int minimumHorizontalDistance = Math.min(w - x, x);
        int minimumDistance = Math.min(minimumHorizontalDistance, minimumVerticalDistance);
        System.out.println(minimumDistance);
    }
}
