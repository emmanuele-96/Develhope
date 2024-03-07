import java.util.Arrays;

public class CarrelloConIva implements Carrello {

    private Articolo[] articoli;

    public CarrelloConIva(Articolo[] articoli) {
       setArticolo(articoli);
    }

    @Override
    public Articolo[] getArticoli() {
        return articoli;

    }
    @Override
    public  void setArticolo(Articolo[] articoli) {
        this.articoli = articoli;
    }
    @Override
    public double getPrezzoFinale() {
        double prezzoFinale = 0.0;

        for (Articolo articolo : getArticoli()) {
            prezzoFinale += articolo.getPrezzo(true);
        }
        return prezzoFinale;
    }

    @Override
    public String toString() {
        return "Carrello con iva { articoli: " + Arrays.toString(getArticoli()) + ", prezzo: " + getPrezzoFinale() + "}";
    }
}
