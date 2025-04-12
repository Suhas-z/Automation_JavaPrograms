package repeats.array.array_programs.string_programs;

public class Capitalize_1st_letter {

    public static void main(String[] args) {
        String a = "gimmy is sleeping cozy";
        a = " " + a;
        String b = "";

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch == ' ') {
                b = b + ch;
                i++;
                ch = a.charAt(i);
                b = b + Character.toUpperCase(ch);
            } else {
                b = b + ch;
            }
        }
        b = b.trim();
        System.out.println(b);
		jjj(a);
    }


    private static void jjj(String str) {
        String res = "";
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            res += Character.toUpperCase(arr[i].charAt(0));
        }

		System.out.println(res);
    }
}
