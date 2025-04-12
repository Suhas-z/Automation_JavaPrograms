package repeats.array.array_programs.array_programs;

public class Sum_of_twodimentionalArray {
 
	
	public static void main(String[] args) {
	
		int [][]a = {{10,20},
					 {20,30},
					 {30,40}};

		int add=0;
	for(int i=0; i<a.length; i++) {
		for(int j=0; j<=1; j++) {
			add=add+a[i][j];
		}
	}
	System.out.println(add);
		
		}
}
