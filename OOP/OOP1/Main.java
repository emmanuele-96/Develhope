package OOP1;

public class Main {
    public static void main(String[] args) {
        Articolo1 articolo1 = new Articolo1("Pizza", 4.99, 0.1);
        // articolo1.nome = "Pizza";
        // articolo1.prezzo = 4.99;

        Articolo1 articolo2 = new Articolo1("Coca-cola", 1.50, 0.22);
        // articolo2.nome = "Coca-cola";
        // articolo2.prezzo = 1.50;
        Carrello1 carrello = new Carrello1(new Articolo1[] { articolo1, articolo2 });
        // carrello.articolo = new Articolo1[] { articolo1, articolo2 };
        // carrello.prezzoFinale = articolo1.getPrezzo() + articolo2.getPrezzo();
        // System.out.println("Carrello: " + carrello);
        System.out.println("Carello: ");
        System.out.println("numero degli aricoli: " + carrello.getArticolo().length);
        System.out.println("prezzo finale (senza iva): " + carrello.getPrezzoFinale(false));
        System.out.println("prezzo finale (con iva): " + carrello.getPrezzoFinale(true));
        // System.out.println("il primo articolo è: " + articolo1);
        // System.out.println("il secondo articolo è: " + articolo2);
        Articolo1 articolo3 = new Articolo1("sushi", 10, 0.22);
        carrello = new Carrello1(new Articolo1[] { articolo1, articolo2, articolo3 });

        // System.out.println("Carrello aggiornato: " + carrello);
        System.out.println("carello aggiornato: ");
        System.out.println("numero di articolo: " + carrello.getArticolo().length);
        System.out.println("prezzo finale (senza iva): " + carrello.getPrezzoFinale(false));
        System.out.println("prezzo finale (con iva): " + carrello.getPrezzoFinale(true));

    }

}
