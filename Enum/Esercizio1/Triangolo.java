package Ereditarietà.Esercizio2;

public class Triangolo extends Forma {
    private float base;
    private float altezza;

    public Triangolo (float base, float altezza) {
        super(TipoForma.TRIANGOLO);
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public float calcolaArea() {
       return (base * altezza) / 2;
    }
}

