package Ereditarietà.Esercizio2;
enum TipoForma {
    RETTANGOLO,
    TRIANGOLO
}
abstract class Forma {
    private final TipoForma tipo;

        public Forma(TipoForma tipo) {
            this.tipo = tipo;
        }

        public TipoForma getTipo() {
            return tipo;
        }
     public abstract float calcolaArea();
}
