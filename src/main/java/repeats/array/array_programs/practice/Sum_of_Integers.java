package repeats.array.array_programs.practice;

public class Sum_of_Integers {
    public static void main(String[] args) {
        int num = 45789;
        int sum = 0, rem = 0;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
