package repeats.array.array_programs.practice;

public class Rotate_array {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		
		int n=3, last;
		
		for(int i=0; i<n; i++) {
			last=arr[arr.length-1];
			for(int j=arr.length-1; j>0; j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		System.out.println();
		
		System.out.println("array after right rotation: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
