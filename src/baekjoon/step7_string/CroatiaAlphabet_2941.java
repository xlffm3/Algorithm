package baekjoon.step7_string;

import java.util.Scanner;

public class CroatiaAlphabet_2941 {

    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        String[] patterns = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (String pattern : patterns)
            input = input.replaceAll(pattern, " ");
        System.out.println(input.length());
    }
}
