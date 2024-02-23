
public class ArrayMulti1 {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6, 7, 8, 9, 10 } };
        int somma = sommaMatrice(a);
        System.out.println("la somma della matrice é " + somma);
    }

    public static int sommaMatrice(int[][] a) {
        int somma = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                somma = somma + a[i][j];
            }

        }
        return somma;

    }

}

    

    