package baekjoon.step10_recursion;

import java.util.Scanner;

public class HanoiTower_11729 {
    static int count = 0;

    public static void main(String[] args) {
        int plateCounts = new Scanner(System.in).nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        moveHanoiTower(plateCounts, 1, 2, 3, stringBuilder);
        System.out.println(count);
        System.out.println(stringBuilder.toString());
    }

    private static void moveHanoiTower(int plateCounts, int from, int by, int to, StringBuilder stringBuilder) {
        count++;
        if (plateCounts == 1) {
            stringBuilder.append(String.format("%d %d\n", from, to));
            return;
        }
        moveHanoiTower(plateCounts - 1, from, to, by, stringBuilder);
        stringBuilder.append(String.format("%d %d\n", from, to));
        moveHanoiTower(plateCounts - 1, by, from, to, stringBuilder);
    }
}
