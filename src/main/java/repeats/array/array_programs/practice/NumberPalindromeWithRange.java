package repeats.array.array_programs.practice;

public class NumberPalindromeWithRange {
    public static void main(String[] args) {
        int rem = 0;
        for (int num = 1000; num <= 2500; num++) {
            int n = num;
            int rev = 0;
            while (n > 0) {
                rem = n % 10;
                rev = (rev * 10) + rem;
                n = n / 10;
            }
            if (rev == num) {
                System.out.print(num + " ");
            }
        }
    }
}