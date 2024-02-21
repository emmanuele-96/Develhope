
/**
 *
 * Esercizio 1: Una funzione che gioca a nascondino
 * Scrivi una funzione che gioca a nascondino con l'utente.
 * La funzione dovrebbe generare un numero casuale tra 1 e 100 e chiedere
 * all'utente di indovinarlo.
 * Se l'utente indovina il numero, la funzione dovrebbe stampare "Hai vinto!".
 * Altrimenti, la funzione dovrebbe stampare "Hai sbagliato! Il numero era
 * {numero_casuale}".
 *
 *
 */
public class generatore1 {
    public static void main(String[] args) {
        nascondino(0);
    }

    public static void nascondino(int numeroDigitato) {
        int numeroACaso = (int) (Math.random() * 100);
        System.out.println(numeroACaso);
    }
}