package repeats.array.array_programs.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Character_count {

    public static void main(String[] args) {
        String a = "nayana smita nesarikar";

        for (char i = 'a'; i <= 'z'; i++) {
            int count = 0;

            for (char j = 0; j < a.length(); j++) {
                if (a.charAt(j) == i) {
                    count++;
                }
            }
            if (count >= 1) {
                System.out.println(i + "=" + count);
            }
        }


//for single word duplicate
//		int count=0;
//for(char j=0; j<a.length(); j++) {
//	if(a.charAt(j)=='n') {
//		count++;
//	}
//}
//if(count>=1) {
//	System.out.println("total number of N is "+count);
//}
//}
        usingMap(a);
    }

    private static void usingMap(String str) {
        Map<Character, Integer> map = new HashMap<>();

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Character, Integer> chars : map.entrySet()) {
            System.out.println(chars.getKey() + "=" + chars.getValue());
        }
    }
}
