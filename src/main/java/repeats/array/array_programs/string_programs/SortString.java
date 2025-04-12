package repeats.array.array_programs.string_programs;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String s = "Do not miss this opportunity madam";
      //  sortLexicographically(s);
        sortByLength(s);
    }

    // alphabetical order
    private static void sortLexicographically(String str) {
        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void sortByLength(String str) {
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i].length() > arr[j].length()) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
