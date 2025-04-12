package repeats.array.array_programs.string_programs;

import java.util.Scanner;

public class Reverse_n_palidrome_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String word=sc.next();
		
		
		String rev="";
		for (int i=word.length()-1; i>=0;i--) {
			rev=rev+word.charAt(i);
			
		}
		System.out.println("reverse string is:"+rev);
		
		//for palidrome
//		if(word.equalsIgnoreCase(rev)) {
//			System.out.println("palidrome");
//		}else {
//			System.out.println("not palidrome");
//		}
	
		
		//for reverse simply
//		String a="Nayana Nesarikar";
//		for(int i=a.length()-1; i>=0; i--) {
//			System.out.print(a.charAt(i));
//		}
	
	}

}
