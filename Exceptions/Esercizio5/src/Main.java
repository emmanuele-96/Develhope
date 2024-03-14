// Scrivere una funzione che accetti in input un numeratore e un denominatore
//Controlli che il numeratore e il denominatore non siano null
//Usare la funzione appena scritta in due blocchi di codice dove si cattura l'eventuale eccezione

public class Main {

    public static void main(String[] args) {
        Integer numeratore = 60;
        Integer denominatore = 2;

        try {
            if (numeratore == null || denominatore == null) {
                System.out.println("null rilevato");
            } else {
                Integer risultato = controlloNull(numeratore, denominatore);
                System.out.println("Risultato: " + risultato);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Integer controlloNull(Integer numeratore, Integer denominatore) {
        if (denominatore == 0) {
            throw new ArithmeticException("Impossibile, il denominatore è uguale a 0");
        }
        return numeratore / denominatore;
    }
}








