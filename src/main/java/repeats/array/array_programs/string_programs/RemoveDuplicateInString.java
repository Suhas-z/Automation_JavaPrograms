package repeats.array.array_programs.string_programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicateInString {

    public static void main(String[] args) {
        String str = "Java Selenium Java Rest Assured";
        duplicateChar(str);
        duplicateWord(str);
    }

    private static void duplicateChar(String str) {
        String resuly = "";
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (resuly.indexOf(ch[i]) < 0) {
                resuly += ch[i];
            }
        }
        System.out.println(resuly);
    }

    private static void duplicateWord(String str) {

        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    arr[j] = "remove";
                }
            }
        }
        for (String s : arr) {
            if (!s.equals("remove")) {
                System.out.print(s+" ");
            }
        }
    }
}
