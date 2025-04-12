package tests;

public class Test1 {
    public static void main(String[] args) {
        String str = "String reverse with inplace words";
        String res = "";
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length() - 1; j >= 0; j--) {
                res += arr[i].charAt(j);
            }
            res += " ";
        }
        System.out.println(res);
    }
}
