package baekjoon.step9_math2;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class RightTriangle_4153 {
    private static final String SPACE_DELIMITER = " ";
    private static final int ZERO = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            int c = Integer.parseInt(stringTokenizer.nextToken());
            List<Integer> sides = Arrays.asList(a, b, c);
            Collections.sort(sides);
            if (a == ZERO && b == ZERO && c == ZERO)
                break;
            if (sides.get(2) * sides.get(2) == (sides.get(0) * sides.get(0)) + (sides.get(1) * sides.get(1)))
                bufferedWriter.write("right\n");
            else
                bufferedWriter.write("wrong\n");
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
