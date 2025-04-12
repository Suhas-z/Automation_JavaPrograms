package repeats.array.array_programs.practice;

public class sum_of_2number_10 {

	public static void main(String[] args) {
		int a[]= {1,7,9,6,5,3,2};
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
			if(a[i] + a[j]==10) {
				System.out.println(a[i] +" + " +a[j]+ " = "+ (a[i]+a[j]));
			}}
		}
	}

}
