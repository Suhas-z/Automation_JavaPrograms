package repeats.array.array_programs.practice;

public class Vowels {

	public static void main(String[] args) {
		String a="Nayana Smita Nesarikar";

		a.contains("alksjkl");
		int count=0;
		for(int i=0; i<a.length(); i++) {
			char b=a.charAt(i);
			if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u') {
				count++;
			}
		}
		
		if(count>0) {
			System.out.println("String contains "+count+" vowels.");
		}else {
			System.out.println("String does not contain vowels.");
		}
	}

}
