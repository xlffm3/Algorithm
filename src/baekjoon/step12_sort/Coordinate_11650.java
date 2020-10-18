package baekjoon.step12_sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Coordinate_11650 {
    private static final int ZERO = 0;
    private static final String SPACE_DELIMITER = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int coordinateCounts = Integer.parseInt(bufferedReader.readLine());
        List<Coordinate> coordinates = new ArrayList<>();
        for (int i = ZERO; i < coordinateCounts; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
            coordinates.add(
                    new Coordinate(Integer.parseInt(stringTokenizer.nextToken()),
                            Integer.parseInt(stringTokenizer.nextToken())));
        }
        bufferedReader.close();
        Collections.sort(coordinates);
        for (Coordinate coordinate : coordinates) {
            bufferedWriter.write(String.format("%d %d\n", coordinate.x, coordinate.y));
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    static class Coordinate implements Comparable<Coordinate> {
        private final int x;
        private final int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Coordinate o) {
            if (x == o.x && y == o.y)
                return 0;
            return (x > o.x || (x == o.x && y > o.y)) ? 1 : -1;
        }
    }
}
