package baekjoon.step16_math3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Factorization_11653 {

    public static void main(String[] args) throws IOException {
        int number = new Scanner(System.in).nextInt();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> divisors = new ArrayList<>();
        int i = 2;
        while (number != 1) {
            if (number % i == 0) {
                divisors.add(i);
                number /= i;
                continue;
            }
            i++;
        }
        for (Integer divisor : divisors) {
            bufferedWriter.write(String.valueOf(divisor));
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
