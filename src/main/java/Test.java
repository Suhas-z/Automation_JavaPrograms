import java.util.*;

public class Test {
    public static void main(String[] args) {

        // secondLargest();
        seclargest();
        // {2, 9, 11, 13, 0, -1, -2, 33}
        int[] arr = {2, 9, 11, 13, 0, -1, -2, 33, 33};
        int temp;
        int secondLargestNUm = 0;
        Set<Integer> numSet = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
               /* if (arr[j] < arr[i]) {
                    secondLargestNUm = arr[j];
                }*/
            }
            //System.out.print("Sorted array = "+arr[i]);
            //    System.out.print(arr[i]);
            numSet.add(Integer.valueOf(arr[i]));

        }
//  System.out.print("Second largest number = " + arr[arr.length-2]);
        //  System.out.println(numSet);

    }


    public static void secondLargest() {

        int[] randomIntegers = {2, 9, 11, 13, 0, -1, -2, 33, 33};
        List<Integer> list = new ArrayList<>();
        for (int i : randomIntegers) {
            if (!(list.contains(Optional.of(i)))) {
                list.add(Integer.valueOf(i));
            }
        }
        Collections.sort(list);
        System.out.println(list.get(list.size() - 2));
    }


    public static void seclargest() {
        int[] randomIntegers = {2, 9, 11, 13, 0, -1, -2, 33, 33};
        Set<Integer> mySet = new TreeSet<>();
        for (int i : randomIntegers) {
            mySet.add(Integer.valueOf(i));
        }
        List<Integer> myList = new LinkedList<>(mySet);
        Collections.sort(myList);

        System.out.print(myList.get(myList.size() - 2));
    }
}
