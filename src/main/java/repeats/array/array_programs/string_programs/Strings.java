package repeats.array.array_programs.string_programs;

public class Strings {


	public static void main(String[] args) {

		try {
			// colors();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// stringPalindrome();

		// numberPalindrome(1551);

		// leap year, given year should be divisible by 4 expect end of century years

		// leapYear();

		// stringReverse("Logitech");

		// noVowels();
		// removeChar();
		//swapString();

		System.out.println('a'+'b');

	}

	public static void swapString() {
		String a = "Coding";
		String b = "Ninjas";

		System.out.println("a : before = " + a);

		String c = b;
		b = a;
		a = c;

		System.out.println("a : after = " + a);

		// without 3d variable

		String p = "Love";
		String q = "you";

		p = p + q;

		q = p.substring(0, p.length() - q.length());

		p = p.substring(q.length());

		System.out.println("P - " + p + "\n q - " + q);

	}

	public static void removeChar() {
		String name = "Suhas";
		char remove = 'h';

		String res = name.replaceAll(Character.toString(remove), "v");

		System.out.println(res);

	}

	public static void noVowels() {
		String nn = "radio";
		char[] ch = nn.toLowerCase().toCharArray();
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < nn.length(); i++) {
			if (ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u') {
				res.append(ch[i]);
			}
		}
		System.out.println("Original string : " + nn + "\n No vowels : " + res);
	}

	private static void colors() throws Exception {
		String color[] = new String[] { "Red", "Blue", "Green", "Yellow", "Torquoise", "Fuschia" };
		int rand = (int) (Math.random() * 10);
		if (rand <= 6)
			System.out.println(color[rand]);
	}

	private static void stringReverse(String input) {

		StringBuffer stringBuffer = new StringBuffer(input);
		stringBuffer.reverse();
		System.out.println("using stringBuffer : " + stringBuffer.toString());

		// using string builder
		StringBuilder stringBuilder = new StringBuilder(input);
		stringBuilder.reverse();
		System.out.println("Using string builder : " + stringBuilder.toString());

		char[] ch = input.toCharArray();
		String out = "";

		for (int i = ch.length - 1; i >= 0; i--) {
			out = out + String.valueOf(ch[i]);
		}
		System.out.println("Char : " + out);
	}

	/**
	 * 
	 */
	private static void leapYear() {
		int year = 1902;
		boolean leap;

		if (year % 4 == 0) {
			leap = true;

			if (year % 100 == 0) {
				if (year % 400 == 0) {
					leap = true;
				} else
					leap = false;
			}

		} else {
			leap = false;
		}

		if (leap) {
			System.out.println(year + " = Is leap year");
		} else {
			System.out.println(year + " = Is not a leap year");
		}
	}

	/**
	 * 
	 */
	private static void numberPalindrome(int input) {
		int num = 1551;
		int reverse = 0, rem;

		while (num > 0) {
			rem = num % 10;
			reverse = (reverse * 10) + rem;
			num = num / 10;
		}

		System.out.println(input + " - " + reverse);
	}

	private static void stringPalindrome() {
		String input = "suhas";
		String rev = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			rev += input.charAt(i);
		}

		if (rev.equals(input)) {

			System.out.println(rev + " Is Palindrome");
		} else
			System.out.println("Not a Palindrome");
	}
}