public class Test6 {
    public static void main(String[] args) {
        String str = "This is java selenium java";
        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    arr[j] = "remove";
                }
            }
        }
        for (String s : arr) {
            if (!s.equals("remove")) {
                // System.out.print(s+" ");
            }
        }

    }
}
