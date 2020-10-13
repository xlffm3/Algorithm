package baekjoon.step3_for;

import java.io.*;
import java.util.stream.IntStream;

public class N_2742 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int maxNumber = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();
        IntStream.rangeClosed(0, maxNumber - 1)
                .forEach(number -> {
                    try {
                        bufferedWriter.write(String.valueOf(maxNumber - number));
                        bufferedWriter.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
