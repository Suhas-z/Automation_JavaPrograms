import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class TestArrays {
    public static void main(String[] args) {
        //arraySortAsc();
        //arraysSortDesc();
        //arrayLargestNum();
        arraySecondLargestNum();
    }

    private static void arraySortAsc() {
        int[] arr = {2, 9, 4, 12, 35, 1, 76};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int k : arr) {
            System.out.print(k + ",");
        }
    }

    private static void arraysSortDesc() {
        Integer[] arr = {5, 1, 87, 61, 32, 21, 10, 4};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    private static void arrayLargestNum() {
        // without sorting
        int[] arr = {12, 45, 74, 22, 23, 22, 55, 64, 74};
        int max = arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    private static void arraySecondLargestNum() {
        int[] arr = {1, 2, 10, 45, 36, 25, 23, 45, 74};
        int max = arr[0];
        int secondLargest = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                temp = max;
                max = arr[i];
                secondLargest = temp;
            } else if (arr[i] > secondLargest && arr[i] != max) {
                secondLargest = arr[i];
            }
        }
        System.out.print("Max - " + max + "\n" + "Second largest = " + secondLargest);
    }


}
