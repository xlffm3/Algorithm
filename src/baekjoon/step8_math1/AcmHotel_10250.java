package baekjoon.step8_math1;

import java.io.*;
import java.util.StringTokenizer;

public class AcmHotel_10250 {
    private static final int ZERO = 0;
    private static final String SPACE_DELIMITER = " ";

    private static int calculateRoomNumber(int height, int width, int customerOrderNumber) {
        int floor = (customerOrderNumber % height == 0) ? height : customerOrderNumber % height;
        int arc = (customerOrderNumber % height == 0) ? customerOrderNumber / height : customerOrderNumber / height + 1;
        return floor * 100 + arc;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCaseCounts = Integer.parseInt(bufferedReader.readLine());
        for (int i = ZERO; i < testCaseCounts; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
            int height = Integer.parseInt(stringTokenizer.nextToken());
            int width = Integer.parseInt(stringTokenizer.nextToken());
            int customerOrderNumber = Integer.parseInt(stringTokenizer.nextToken());
            int roomNumber = calculateRoomNumber(height, width, customerOrderNumber);
            bufferedWriter.write(String.format("%d\n", roomNumber));
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
