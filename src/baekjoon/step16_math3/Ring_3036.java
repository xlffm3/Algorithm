package baekjoon.step16_math3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Ring_3036 {
    private static final String SPACE_DELIMITER = " ";
    private static final int ZERO = 0;
    private static final int ONE = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int ringCounts = Integer.parseInt(bufferedReader.readLine());
        List<Integer> radiuses = new ArrayList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
        for (int i = ZERO; i < ringCounts; i++) {
            radiuses.add(Integer.parseInt(stringTokenizer.nextToken()));
        }
        bufferedReader.close();
        int maxRadius = radiuses.get(ZERO);
        for (int i = ONE; i < ringCounts; i++) {
            int targetRadius = radiuses.get(i);
            int maxDivisor = getMaxDivisor(maxRadius, targetRadius);
            bufferedWriter.write(String.format("%d/%d\n", maxRadius / maxDivisor, targetRadius / maxDivisor));
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    private static int getMaxDivisor(int bigNumber, int smallNumber) {
        int maxDivisor = ZERO;
        for (int i = smallNumber; i >= ONE; i--) {
            if (bigNumber % i == 0 && smallNumber % i == 0) {
                maxDivisor = i;
                break;
            }
        }
        return maxDivisor;
    }
}
