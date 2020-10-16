package baekjoon.step9_math2;

import java.io.*;

public class GoldbachConjecture_9020 {
    private static final int ZERO = 0;
    private static final int MAX_SIZE = 10001;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCaseCounts = Integer.parseInt(bufferedReader.readLine());
        boolean[] sieveOfEratosthenes = new boolean[MAX_SIZE];
        int firstNumber = ZERO;
        int secondNumber = ZERO;
        initiateSieveOfEratosthenes(sieveOfEratosthenes);
        for (int i = ZERO; i < testCaseCounts; i++) {
            int evenNumber = Integer.parseInt(bufferedReader.readLine());
            for (int j = evenNumber / 2; j >= 2; j--) {
                if (!sieveOfEratosthenes[j] && !sieveOfEratosthenes[evenNumber - j]) {
                    firstNumber = j;
                    secondNumber = evenNumber - j;
                    break;
                }
            }
            bufferedWriter.write(String.format("%d %d\n", firstNumber, secondNumber));
        }
        bufferedWriter.flush();
        bufferedWriter.close();

    }

    private static void initiateSieveOfEratosthenes(boolean[] sieveOfEratosthenes) {
        for (int i = 2; i < MAX_SIZE; i++) {
            for (int j = 2; i * j < MAX_SIZE; j++) {
                sieveOfEratosthenes[i * j] = true;
            }
        }
    }
}
