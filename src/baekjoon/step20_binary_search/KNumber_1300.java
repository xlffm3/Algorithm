package baekjoon.step20_binary_search;

import java.util.Scanner;

public class KNumber_1300 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Long.parseLong(scanner.nextLine());
        long k = Long.parseLong(scanner.nextLine());
        long left = 1;
        long right = k;
        long answer = 0;
        while (left <= right) {
            long mid = (left + right) / 2;
            int cnt = 0;
            for (int i = 1; i <= n; i++) {
                cnt += Math.min(mid / i, n);
            }
            if (cnt < k) {
                left = mid + 1;
            } else if (cnt >= k) {
                answer = mid;
                right = mid - 1;
            }
        }
        System.out.println(answer);
    }
}
