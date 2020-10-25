package programmers.step1_stack_queue;

import java.util.Arrays;

public class StockPrice {
    private static final int ZERO = 0;
    private static final int ONE = 1;

    public static int[] solution(int[] prices) {
        int priceCounts = prices.length;
        int[] answer = new int[priceCounts];
        for (int i = ZERO; i < priceCounts - ONE; i++) {
            for (int j = i + ONE; j < priceCounts; j++) {
                answer[i]++;
                if (prices[i] > prices[j]) {
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[]{1, 2, 3, 2, 3}));
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 2, 3})));
    }
}
