package repeats.array.array_programs.practice;

public class Space_count {

	public static void main(String[] args) {
		String abc="Nayana smita gimmy are free now.";
		int count=0;
		
		for(int i=0; i<abc.length(); i++) {
			char a=abc.charAt(i);
			if(a==' ') {
				count++;
			}
		}
		System.out.println("Number of spaces:"+ count);
	}

}
