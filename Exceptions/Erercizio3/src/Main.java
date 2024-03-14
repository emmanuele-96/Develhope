public class Main {
    public static void main(String[] args) {
        int dividendo = 27;
        int divisore  = 0;
        divisoZero(dividendo,divisore);
    }
    public static void divisoZero(int dividendo, int divisore) {
        try {
            int risultato = dividendo / divisore;
            System.out.println("il risultato é: " + risultato);
        } catch (ArithmeticException e) {
            System.out.println("errore");
            System.out.println("messaggio: " + e);
        }
    }
}