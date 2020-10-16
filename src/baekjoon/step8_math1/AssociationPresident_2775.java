package baekjoon.step8_math1;

import java.io.*;

public class AssociationPresident_2775 {
    private static final int ZERO = 0;
    private static final int WIDTH = 14;
    private static final int HEIGHT = 15;

    private static void initiateApartment(int[][] apartment) {
        for (int i = 0; i < WIDTH; i++) {
            apartment[0][i] = i + 1;
        }
        for (int i = 1; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                int peopleCounts = ZERO;
                for (int k = 0; k <= j; k++) {
                    peopleCounts += apartment[i - 1][k];
                }
                apartment[i][j] = peopleCounts;

            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] apartment = new int[HEIGHT][WIDTH];
        initiateApartment(apartment);
        int testCaseCounts = Integer.parseInt(bufferedReader.readLine());
        for (int i = ZERO; i < testCaseCounts; i++) {
            int floorK = Integer.parseInt(bufferedReader.readLine());
            int arcN = Integer.parseInt(bufferedReader.readLine()) - 1;
            bufferedWriter.write(String.format("%d\n", apartment[floorK][arcN]));
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
