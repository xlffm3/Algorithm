package programmers.step1_hash;

import java.util.ArrayDeque;
import java.util.Deque;

public class PhoneBook {
    private static final int ZERO = 0;

    public static boolean solution(String[] phone_book) {
        Deque<String> queue = new ArrayDeque<>();
        int phoneNumberCounts = phone_book.length;
        boolean answer = true;
        for (String phoneNumber : phone_book) {
            queue.add(phoneNumber);
        }
        for (int i = ZERO; i < phoneNumberCounts; i++) {
            String phoneNumber = queue.poll();
            boolean isPrefix = queue.stream()
                    .anyMatch(phoneNumberInQueue -> phoneNumberInQueue.startsWith(phoneNumber));
            if (isPrefix) {
                return false;
            }
            queue.add(phoneNumber);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"119", "9674848", "11930120"}));
        System.out.println(solution(new String[]{"123", "456", "789"}));
        System.out.println(solution(new String[]{"12", "123", "1235", "567", "88"}));
    }
}
