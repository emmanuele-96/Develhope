public class Main {
    public static void main(String[] args) {
        Articolo articolo1 = new Articolo("Pizza", 4.99, 0.1);
        Articolo articolo2 = new Articolo("Coca-cola", 1.50, 0.22);
        Articolo[] articoli = new Articolo[] { articolo1, articolo2 };

        CarrelloSenzaIva carrelloSenzaIva = new CarrelloSenzaIva(articoli);
        System.out.println("Carrello senza iva: ");
        System.out.println("numero degli aricoli: " + carrelloSenzaIva.getArticoli().length);
        System.out.println("prezzo finale: " + carrelloSenzaIva.getPrezzoFinale());
        System.out.println("Carrello senza iva toString: " + carrelloSenzaIva);

        CarrelloConIva carrelloConIva = new CarrelloConIva(articoli);
        System.out.println("Carrello con iva: ");
        System.out.println("numero degli aricoli: " + carrelloConIva.getArticoli().length);
        System.out.println("prezzo finale: " + carrelloConIva.getPrezzoFinale());
        System.out.println("Carrello con iva toString: " + carrelloConIva);

    }
}
