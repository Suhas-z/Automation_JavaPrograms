package repeats.array.array_programs.practice;

import java.util.Scanner;

public class Factorial_num {

	public static void main(String[] args) {
		//1*2*3*4*5*6*7
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int no=sc.nextInt();
		
		int fact=1;
		for(int i=1; i<=no; i++) {
			fact=fact*i; // 1 2 6 24
		}
		System.out.println(fact);
	}

}
