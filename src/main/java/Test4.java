import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(13);
        list.add(20);
        list.add(8);
        list.add(23);
        list.add(26);
        list.add(40);
        list.add(18);

        findEven(list);

    }

    public static void findEven(List<Integer> arrayList) {
        List<Integer> evenList = new ArrayList<>();
        for (int i : arrayList) {
            if (i >= 1 && i % 2 == 0) {
                evenList.add(i);
            }
        }
        Collections.sort(evenList);
        evenList.stream().forEach(i -> System.out.print(i + " "));
    }
}
