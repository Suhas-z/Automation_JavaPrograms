package repeats.array.array_programs.string_programs;

public class Reverse_BySplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Nayana Nesarikar Suhas Sanvi Gimmy";
		String a[]=name.split(" ");
		
		for(int i=0; i<a.length; i++) {
			for(int j=a[i].length()-1;j>=0; j--) {
				System.out.print(a[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

}
