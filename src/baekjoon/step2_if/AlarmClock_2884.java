package baekjoon.step2_if;

import java.time.LocalDateTime;
import java.util.Scanner;

public class AlarmClock_2884 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        LocalDateTime time = LocalDateTime.of(1, 1, 1, hour, minute, 0)
                .minusMinutes(45);
        System.out.println(time.getHour() + " " + time.getMinute());
    }
}
