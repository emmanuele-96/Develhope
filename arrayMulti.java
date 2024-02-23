public class arrayMulti {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6, 7, 8, 9, 10 } };

        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < a[i].length; k++)
                System.out.println(a[i][k]);

        }
    }
}
