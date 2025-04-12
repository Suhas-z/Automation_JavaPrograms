package tests;

import java.util.HashMap;
import java.util.Map;

public class RelxInterview {
    public static void main(String[] args) {
        findOddOccurrences();
    }

    private static void findOddOccurrences() {
        int[] arr = {1, 2, 3, 2, 3, 1, 2, 1, 5};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (int k : map.keySet()) {
            if (map.get(k) % 2 != 0) {
                System.out.println(k);
            }
        }
    }
}
