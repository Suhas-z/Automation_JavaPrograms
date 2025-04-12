package repeats.array.array_programs.array_programs;

public class Sum_of_multiD_array {

    public static void main(String[] args) {
        int abc[][] = {{10, 20, 30, 40},
                {50, 60, 70, 80},
                {90, 100, 200, 300}};

        int efg[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};

        int c[][] = new int[3][4];

        for (int i = 0; i < abc.length; i++) {
            for (int j = 0; j < abc[i].length; j++) {
                System.out.print(abc[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < efg.length; i++) {
            for (int j = 0; j < efg[i].length; j++) {
                System.out.print(efg[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = abc[i][j] + efg[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }

}
