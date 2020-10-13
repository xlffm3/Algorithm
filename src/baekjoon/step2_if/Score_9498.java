package baekjoon.step2_if;

import java.util.Scanner;

public class Score_9498 {
    private static final Scanner SCANNER = new Scanner(System.in);

    private static void printScoreGrade(int examScore) {
        if (examScore >= 90)
            System.out.println("A");
        else if (examScore >= 80)
            System.out.println("B");
        else if (examScore >= 70)
            System.out.println("C");
        else if (examScore >= 60)
            System.out.println("D");
        else
            System.out.println("F");
    }

    public static void main(String[] args) {
        int examScore = SCANNER.nextInt();
        printScoreGrade(examScore);
    }
}
