package repeats.array.array_programs;

public class TestStrings {
    public static void main(String[] args) {
        //repeatCharInAString();
        //wordEnd();
        //palindrome();
        primeNumber();
    }

    private static void repeatCharInAString() {
        String str = "Java";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.print(str.charAt(i));
            }
        }
    }

    private static void wordEnd() {
        String str = "Hello World!";
        String[] arr = str.split(" ");
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            //res = res + arr[i] + "ay";
            System.out.println(arr[i].charAt(0));
        }
        System.out.println(res);
    }

    private static void palindrome() {
        String name = "Madam";
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev += name.charAt(i);
        }
        if (name.toLowerCase().equalsIgnoreCase(rev)) {
            System.out.println("Is palindrome");
        } else {
            System.out.println("not palidnrome");
        }
    }

    private static void primeNumber() {
        int num = 5;
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 0)
            System.out.println("Prime");
        else {
            System.out.println("Not a prime");
        }
    }

    private static void primeNumberFrom1to100() {
        int i = 0;
        int num = 0;
        //Empty String
        String primeNumbers = "";

        for (i = 1; i <= 100; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);
    }
}
