package programmers.step1_hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Camouflage {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int CATEGORY_INDEX = 1;

    public static int solution(String[][] clothes) {
        Map<String, Integer> clothesMap = new HashMap<>();
        int answer = ONE;
        for (String[] item : clothes) {
            clothesMap.put(item[CATEGORY_INDEX], clothesMap.getOrDefault(item[CATEGORY_INDEX], ZERO) + ONE);
        }
        Set<String> clothesKeys = clothesMap.keySet();
        for (String key : clothesKeys) {
            answer *= clothesMap.get(key) + ONE;
        }
        return answer - ONE;
    }
}
