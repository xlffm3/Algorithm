package baekjoon.step9_math2;

import java.io.*;
import java.util.StringTokenizer;

public class Turret_1002 {
    private static final int ZERO = 0;
    private static final String SPACE_DELIMITER = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCaseCounts = Integer.parseInt(bufferedReader.readLine());
        for (int i = ZERO; i < testCaseCounts; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
            int x1 = Integer.parseInt(stringTokenizer.nextToken());
            int y1 = Integer.parseInt(stringTokenizer.nextToken());
            int r1 = Integer.parseInt(stringTokenizer.nextToken());
            int x2 = Integer.parseInt(stringTokenizer.nextToken());
            int y2 = Integer.parseInt(stringTokenizer.nextToken());
            int r2 = Integer.parseInt(stringTokenizer.nextToken());
            double distance = Math.sqrt((double) (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            if (x1 == x2 && y1 == y2 && r1 == r2)
                bufferedWriter.write("-1\n");
            else if (distance > r1 + r2 || distance < Math.abs(r1 - r2))
                bufferedWriter.write("0\n");
            else if (distance == r1 + r2 || distance == Math.abs(r1 - r2))
                bufferedWriter.write("1\n");
            else
                bufferedWriter.write("2\n");
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
