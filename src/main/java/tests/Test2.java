package tests;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {

    public static void main(String[] args) {
        int[] arr = {6, 5, 2, 1, 6, 4, 5, 1, 3};
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (Integer integer : set) {
            System.out.print(integer + " ");
        }
        //System.out.print(set);

    }
}
