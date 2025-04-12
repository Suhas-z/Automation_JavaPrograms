package repeats.array.array_programs.practice;

public class ordinals_on_numbers {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(i%10==1 && i!=11) {
				System.out.println(i+"st");
			}
			if(i%10==2 && i!=12) {
				System.out.println(i+"nd");
		    }
			if(i%10==3 && i!=13) {
				System.out.println(i+"rd");
		    }
			if(i%10==4 |i%10==5|i%10==6|i%10==7|i%10==8|i%10==9|i%10==0|i==11|i==12|i==13) {
				System.out.println(i+"th");
			}
	}

}
}