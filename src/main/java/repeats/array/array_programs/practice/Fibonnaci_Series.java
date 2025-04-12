package repeats.array.array_programs.practice;

import java.util.Scanner;

public class Fibonnaci_Series {

    public static void main(String[] args) {

        fibbb();
        //0 1 1 2 3 5 8 13
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num:");
        int no = sc.nextInt();

        int a = 0, b = 1, c;

        System.out.print(a + " " + b);

        for (int i = 2; i < no; i++) {
            c = a + b; // 1 2 3
            System.out.print(" " + c);
            a = b; // 1 1 2
            b = c; //1 2 3
        }
    }

    private static void fibbb() {
        int a = 0, b = 1, c;
        System.out.print(a + " " + b);

    }

}
