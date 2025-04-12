package repeats.array.array_programs.array_programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Array_acsen_dece {

    public static void main(String[] args) {
        int a[] = {7, 1, 4, 9, 3, 6};
        int temp=0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) {    //7>7  9>3
                    a[i] = a[j];    // 1
                    a[j] = temp;
                }
            }
        }
        for (int b : a) {
            System.out.println(b + " ");
        }


//		int a[]= {7,1,4,9,3,6};
//		ArrayList <Integer> al=new ArrayList<Integer>();
//		for(int i:a) {
//			al.add(i);
//		}
//		Collections.sort(al);
//		for(int b:al) {
//			System.out.println(b);
//		}
    }

}
