package repeats.array.array_programs.practice;

import java.util.Scanner;

public class Armstrong_no {
			//narcissistic
			//pluperfect digital invariant(PPDI)
			//plus perfect number
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int n=sc.nextInt();
		
		int temp=n;
		int res=0;

		while(temp>0) {
			int ld = temp%10; // 3 5 1
			res=res+ld*ld*ld; // 27 152 153
			temp=temp/10; // 15.3 1.5
		}
		if(res==n ) {
			System.out.println("amstrong");
		}else {
			System.out.println("not amstrong");
		}
		
	}
}
