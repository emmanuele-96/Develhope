public class Main {

    static boolean controllaRange(int numero, int numeroMinimo, int numeroMassimo) {
        if (numero > numeroMinimo && numero < numeroMassimo) {
            return true;
        } else {
            throw new ArithmeticException("il numero non è all'interno del range");
        }
    }

    public static void main(String[] args) {
        int numero = 100;
        int numeroMinimo = 1;
        int numeroMassimo = 99;

        try {
            boolean risultato = controllaRange(numero, numeroMinimo, numeroMassimo);
            System.out.println("il risultato è: " + risultato);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
