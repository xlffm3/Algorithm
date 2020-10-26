package programmers.step5_brute_force;

public class Carpet {

    public static int[] solution(int brown, int yellow) {
        int width = yellow;
        int[] answer = new int[2];
        for (int i = 1; i <= width; i++) {
            width = yellow / i;
            if (yellow % i == 0 && brown == (width * 2) + (i * 2) + 4) {
                answer[0] = width + 2;
                answer[1] = i + 2;
                break;
            }
        }
        return answer;
    }
}
