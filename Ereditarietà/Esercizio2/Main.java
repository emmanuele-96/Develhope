package Ereditarietà.Esercizio2;
//Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato calcolaArea() che stampi l'area della forma.

//Crea poi una sottoclasse chiamata Rettangolo che fa override del metodo calcolaArea() per calcolare l'area del rettangolo.

public class Main {
    public static void main(String[] args) {
        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo(3, 5);
        Triangolo triangolo = new Triangolo(10, 6);

        forma.calcolaArea();
        rettangolo.calcolaArea();
        triangolo.calcolaArea();

    }
}
