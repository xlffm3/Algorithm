package baekjoon.step12_sort;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Coordinate_11651 {
    private static final int ZERO = 0;
    private static final int X_INDEX = 0;
    private static final int Y_INDEX = 1;
    private static final int TWO = 2;
    private static final String SPACE_DELIMITER = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int coordinateCounts = Integer.parseInt(bufferedReader.readLine());
        int[][] coordinates = new int[coordinateCounts][TWO];
        for (int i = ZERO; i < coordinateCounts; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
            coordinates[i][X_INDEX] = Integer.parseInt(stringTokenizer.nextToken());
            coordinates[i][Y_INDEX] = Integer.parseInt(stringTokenizer.nextToken());
        }
        bufferedReader.close();
        Arrays.sort(coordinates, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[X_INDEX] == o2[X_INDEX] && o1[Y_INDEX] == o2[Y_INDEX])
                    return 0;
                return (o1[Y_INDEX] > o2[Y_INDEX] || (o1[Y_INDEX] == o2[Y_INDEX] && o1[X_INDEX] > o2[X_INDEX])) ? 1 : -1;
            }
        });
        for (int[] coordinate : coordinates) {
            bufferedWriter.write(String.format("%d %d\n", coordinate[X_INDEX], coordinate[Y_INDEX]));
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
