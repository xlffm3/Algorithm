package baekjoon.step9_math2;

import java.util.Scanner;

public class TaxiGeometry_3053 {
    private static final double PI = 3.141592653589793238462643383279;

    public static void main(String[] args) {
        int radius = new Scanner(System.in).nextInt();
        System.out.printf("%.6f\n", PI * radius * radius);
        System.out.printf("%.6f\n", (double) 2 * radius * radius);
    }
}
