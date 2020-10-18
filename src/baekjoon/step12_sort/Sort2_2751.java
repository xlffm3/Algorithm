package baekjoon.step12_sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort2_2751 {
    private static final int ZERO = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberCounts = Integer.parseInt(bufferedReader.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = ZERO; i < numberCounts; i++) {
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }
        bufferedReader.close();
        Collections.sort(list);
        for (int i = ZERO; i < numberCounts; i++) {
            bufferedWriter.write(String.format("%d\n", list.get(i)));
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
