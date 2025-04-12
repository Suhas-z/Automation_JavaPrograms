import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 3, 3, 4, 4, 5, 1};
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
       // charCount();
    }

    private static void charCount() {
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
    }

    private static void charCount2() {
        String str = "Switch to smart";
        for (char c = 'a'; c <= 'z'; c++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {


            }
        }
    }
}
