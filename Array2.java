public class Array2 {
    public static void main(String[] args) {
        int[][] matrice = new int[2][3];
        matrice[0][0] = 1;
        matrice[1][0] = 4;
        matrice[0][1] = 2;
        matrice[1][1] = 5;
        matrice[0][2] = 3;
        matrice[1][2] = 6;
        stampaMatrice(matrice);
    }

    public static void stampaMatrice(int[][] matrice) {
        for (int i = 0; i < matrice[0].length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (j == matrice[i].length - 1) {
                    System.out.print(matrice[i][j]);
                } else {
                    System.out.print(matrice[i][j] + " ");
                }

            }
            System.out.println();
        }
    }
}
