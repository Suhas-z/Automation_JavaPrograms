import java.io.File;
import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        double d1 = 33.0;
        double d2 = 881.2;

        // System.out.println(Double.compare(d1, d2));
        // printAlternate();
        // removeDuplicateFromAnIntArray();
        // stringReverse();
        // removeDuplicateFromAnArray();
        // sumOfNumInArray();
        // palindromeString();
         countRepeatedCharInAString();
        // findSmallestNLargestWord();
        sortString();
    }

    private static void removeDuplicateFromAnIntArray() {
        int[] arr = {10, 20, 40, 30, 30, 20, 40, 10};
        Set<Integer> set = new TreeSet<>();
        for (int i : arr) {
            set.add(i);
        }
        System.out.println(set);
    }

    private static void removeDuplicateFromAnArray() {
        int[] arr = {10, 20, 40, 30, 30, 20, 40, 10};
        Arrays.sort(arr);
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[arr.length - 1];

        for (int l = 0; l < j; l++) {
            arr[l] = temp[l];
        }
        for (int k : arr) {
            System.out.print(k + ",");
        }
    }

    public static void printAlternate() {
        String name = "Nayana Nesarikar";
        String[] nameArr = name.split(" ");
        String res = "";

        for (int n = 0; n < nameArr.length; n++) {
            for (int j = nameArr[n].length() - 1; j >= 0; j--) {
                res += nameArr[n].charAt(j);
            }
        }
        System.out.println(res);

        for (int i = 0; i < name.length(); i = i + 2) {
            System.out.print(name.charAt(i) + " ");
        }
    }

    public static void stringReverse() {
        String str = "Suhas";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    private static void sumOfNumInArray() {
        int[] num = {10, 30, 20, 40, 55};
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        System.out.println("Sum of array - " + sum);
    }

    private static void palindromeString() {
        String str = "Madam";
        StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        if (rev.toString().equalsIgnoreCase(str)) {
            System.out.println("given string is palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    private static void countRepeatedCharInAString() {
        String str = "suhas";
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            // using ternary operator
            countMap.put(str.charAt(i), countMap.containsKey(str.charAt(i)) ? countMap.get(str.charAt(i)) + 1 : 1);

           /* if (countMap.containsKey(str.charAt(i))) {
                countMap.put(str.charAt(i), countMap.get(str.charAt(i)) + 1);
            } else {
                countMap.put(str.charAt(i), 1);
            }*/
        }
        System.out.println(countMap);
    }

    private static void findSmallestNLargestWord() {
        String str = "My name is Suhas";
        String[] arr = str.toLowerCase().split(" ");
        String largest = arr[0];
        String smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > largest.length()) {
                largest = arr[i];

            } else if (arr[i].length() < smallest.length()) {
                smallest = arr[i];
            }
        }
        System.out.print("Smallest - " + smallest + "\n" + "Largest - " + largest);

    }

    private static void sortString() {
        String str = "Suhas Hi Hello how you doing";
        String[] arr = str.split(" ");
        String min = arr[0];
        String max = arr[0];
        String temp = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < min.length()) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                min = temp;
            } else if (arr[i].length() > max.length()) {
                max = arr[i];
            }
        }
        System.out.print("Min = " + min + "\n" + "Max = " + max);
    }

}