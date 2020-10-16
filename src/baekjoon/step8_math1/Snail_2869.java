package baekjoon.step8_math1;

import java.util.Scanner;

public class Snail_2869 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ascendingDistance = scanner.nextInt();
        int descendingDistance = scanner.nextInt();
        int treeLength = scanner.nextInt();
        int result = (int) Math.ceil(((double) treeLength - descendingDistance) / (ascendingDistance - descendingDistance));
        System.out.println(result);
    }
}
