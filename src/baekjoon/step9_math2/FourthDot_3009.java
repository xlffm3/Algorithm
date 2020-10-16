package baekjoon.step9_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class FourthDot_3009 {
    private static final int ZERO = 0;
    private static final int THREE = 3;
    private static final String SPACE_DELIMITER = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> xMap = new HashMap<>();
        Map<Integer, Integer> yMap = new HashMap<>();
        for (int i = ZERO; i < THREE; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), SPACE_DELIMITER);
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());
            xMap.put(x, xMap.getOrDefault(x, 0) + 1);
            yMap.put(y, yMap.getOrDefault(y, 0) + 1);
        }
        bufferedReader.close();
        int x = findFourthSpot(xMap);
        int y = findFourthSpot(yMap);
        System.out.printf("%d %d\n", x, y);
    }

    private static int findFourthSpot(Map<Integer, Integer> map) {
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            int value = map.get(key);
            if (value == 1)
                return key;
        }
        return 0;
    }
}
