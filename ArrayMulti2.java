public class ArrayMulti2 {
    public static void main(String[] args) {
        int[][] matrice = { { 15, 53, 94, 75 }, { 75, 21, 36, 64 } };
        int somma = sommaMatrice(matrice);
        System.out.println("la somma della matrice è " + somma);
    }

    public static int sommaMatrice(int[][] matrice) {
        int somma = 0;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                somma = somma + matrice[i][j];
            }

        }
        return somma;

    }
}
