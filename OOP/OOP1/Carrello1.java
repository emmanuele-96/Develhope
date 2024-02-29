package OOP1;

import java.util.Arrays;

public class Carrello1 {
    private Articolo1[] articolo;

    // private double prezzoFinale;

    public Carrello1(Articolo1[] articolo) {
        setArticolo(articolo);

    }

    public Articolo1[] getArticolo() {
        return articolo;
    }

    public void setArticolo(Articolo1[] articolo) {
        this.articolo = articolo;

    }

    public double getPrezzoFinale(boolean conIva) {
        double prezzoFinale = 0.0;

        for (Articolo1 articolo : articolo) {
            prezzoFinale = prezzoFinale + articolo.getPrezzo(conIva);
        }
        return prezzoFinale;
    }

    @Override
    public String toString() {
        return "Carello { articoli: " + Arrays.toString(articolo) + "}";
    }

}
