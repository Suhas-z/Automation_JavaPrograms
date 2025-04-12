package repeats.array.array_programs.practice;

import java.util.Scanner;

public class prime_num{

@SuppressWarnings("resource")
public static void main(String[]args){
//divisible by itself

Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int a= sc.nextInt();

int pr=0;

for(int i=2; i<= a-1; i++){ 
	if(a%i==0){ //
		pr=pr+1;
}
}

if(pr==0){
	System.out.println("prime");
} else{
	System.out.println("not prime");
}
}
}
