package repeats.array.array_programs.practice;

public class practice {

public static void main(String[] args) {

	String a[]={"Nayana","Nesarikar"};
	
	
	for(int i=0; i<a.length; i++ ){
	  for(int j=a[i].length()-1; j>=0; j--){
	    System.out.print(a[i].charAt(j));
	}
	System.out.print(" ");
	}
}}


