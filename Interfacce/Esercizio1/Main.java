package Ereditarietà.Esercizio2;

public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(3, 5);
        Triangolo triangolo = new Triangolo(10, 6);

        rettangolo.calcolaArea();
        triangolo.calcolaArea();

        System.out.println("l'area del rettangolo è: " + rettangolo.calcolaArea());
        System.out.println("l'area del triangolo è: " + triangolo.calcolaArea());

    }
}

