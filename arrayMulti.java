public class arrayMulti {
    public static void main(String[] args) {
        int[][] matrice = { { 15, 53, 94, 75 }, { 75, 21, 36, 64 } };
        int somma = sommaMatrice(matrice);
        System.out.println("la somma della matrice è " + somma);
    }

    public static int sommaMatrice(int[][] matrice) {
        int somma = 0;
        for (int j = 0; j < matrice[0].length; j++) {

            somma = somma + matrice[0][j];
        }

        return somma;
    }
}