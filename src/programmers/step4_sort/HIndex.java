package programmers.step4_sort;

import java.util.Arrays;

public class HIndex {
    private static final int ONE = 1;
    private static final int ZERO = 0;

    public static int solution(int[] citations) {
        int articleCounts = citations.length;
        int hIndex = articleCounts;
        Arrays.sort(citations);
        while (hIndex > ZERO) {
            int citationSum = ZERO;
            boolean isHIndexFound = false;
            for (int i = articleCounts - ONE; i >= ZERO; i--) {
                if (citations[i] >= hIndex) {
                    citationSum++;
                }
                if (citationSum == hIndex) {
                    isHIndexFound = true;
                    break;
                }
            }
            if (isHIndexFound) {
                break;
            }
            hIndex--;
        }
        return hIndex;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 0, 6, 1, 5}));
    }
}
