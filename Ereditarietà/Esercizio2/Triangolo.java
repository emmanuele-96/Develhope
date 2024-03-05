package Ereditarietà.Esercizio2;

public class Triangolo extends  Forma {
    private float base;
    private float altezza;

    public Triangolo (float base, float altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltezza() {
        return altezza;
    }

    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }
    @Override
    public void calcolaArea() {
        System.out.println("l'area del triangolo è pari ha: " + (base * altezza) / 2);
    }
}

