package repeats.array.array_programs.practice;

import java.util.Scanner;

public class star1 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows");
		int row=sc.nextInt();
		
		for(int i=0; i<row; i++) { 
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
