package programmers.step1_hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UnfinishedPlayer {
    private static final int ZERO = 0;
    private static final int ONE = 1;

    public static String solution(String[] participant, String[] completion) {
        Map<String, Integer> participantMap = new HashMap<>();
        String answer = null;
        for (String name : participant) {
            participantMap.put(name, participantMap.getOrDefault(name, ZERO) + ONE);
        }
        for (String name : completion) {
            participantMap.put(name, participantMap.get(name) - ONE);
        }
        Set<String> participantNames = participantMap.keySet();
        for (String name : participantNames) {
            if (participantMap.get(name) != ZERO) {
                answer = name;
                break;
            }
        }
        return answer;
    }
}
