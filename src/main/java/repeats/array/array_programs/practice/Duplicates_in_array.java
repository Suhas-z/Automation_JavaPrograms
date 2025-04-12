package repeats.array.array_programs.practice;

import java.util.Arrays;
import java.util.HashSet;

public class Duplicates_in_array {

    public static void main(String[] args) {

        String DSS[] = {"amdocs", "tcs", "accenture", "tcs", "capgemini", "accenture"};

//		Arrays.parallelSort(DSS);

        for (int i = 0; i < DSS.length; i++) {
            for (int j = i + 1; j < DSS.length; j++) {
                int count = 0;
                if (DSS[i].equals(DSS[j])) {
                    count++;
                    System.out.println("Found Dupliate elements:" + " " + DSS[i] + "-" + count + " Times");
                    //System.out.println(count);
                }
            }
        }

    }
}

// for string convert it into array by tochararray method and then same code