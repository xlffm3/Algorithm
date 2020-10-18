package baekjoon.step12_sort;

import java.io.*;

public class Sort_2750 {
    private static final int ZERO = 0;
    private static final int ONE = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberCounts = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[numberCounts];
        for (int i = ZERO; i < numberCounts; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        bufferedReader.close();
        for (int i = ONE; i < numberCounts; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                if (arr[j] > key) {
                    arr[j + 1] = arr[j];
                }
                j--;
            }
            arr[j + 1] = key;
        }
        for (int number : arr) {
            bufferedWriter.write(String.format("%d\n", number));
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
