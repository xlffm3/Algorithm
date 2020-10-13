package baekjoon.step3_for;

import java.io.*;
import java.util.stream.IntStream;

public class N_2741 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        IntStream.rangeClosed(1, Integer.parseInt(bufferedReader.readLine()))
                .forEach(number -> {
                    try {
                        bufferedWriter.write(String.valueOf(number));
                        bufferedWriter.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
