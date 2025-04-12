package repeats.array.array_programs.practice;

import java.util.Scanner;

public class Reverse_n_palidrome_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		int no=sc.nextInt();
		
		int a=no; // 234
		int b=0,c;
		while(a!=0) {
			c=a%10;   // 4 3 2
			b=b*10+c;// 4 43 432
			a=a/10; // 23.4 2.34 0.234
		}
		//System.out.println("reverse is:" + b);
		
		// for palidrome
		 if(no==b) {
			 System.out.println("Palidrome");
		 }else {
			 System.out.println("not Palidrome");
		 }
		 
}}
