import java.util.Arrays;

public class CarrelloSenzaIva implements Carrello{
    private Articolo[] articoli;
    public CarrelloSenzaIva(Articolo[] articoli) {
        setArticolo(articoli);
    }
    @Override
    public Articolo[] getArticoli() {
        return articoli;
    }
    @Override
    public void setArticolo(Articolo[] articoli) {
        this.articoli = articoli;
    }
    @Override
    public double getPrezzoFinale() {
        double prezzoFinale = 0.0;

        for (Articolo articolo : getArticoli()) {
            prezzoFinale += articolo.getPrezzo(false);
        }
        return prezzoFinale;
    }

    @Override
    public String toString() {
        return "Carrello senza iva { articoli: " + Arrays.toString(getArticoli()) + ", prezzo: " + getPrezzoFinale() + "}";
    }
}
