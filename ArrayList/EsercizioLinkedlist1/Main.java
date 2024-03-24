package EsercizioLinkedlist1;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Fruit fruit1 = new Fruit("Banana");
        Fruit fruit2 = new Fruit("Mela");
        Fruit fruit3 = new Fruit("Pesca");
        Fruit fruit4 = new Fruit("Papaia");
        Fruit fruit5 = new Fruit("Mango");
        Fruit fruit6 = new Fruit("Fragole");
        Fruit fruit7 = new Fruit("Cocco");


        LinkedList<Fruit> listaFrutta = new LinkedList<>();
        listaFrutta.add(fruit1);
        listaFrutta.add(fruit2);
        listaFrutta.add(fruit3);
        listaFrutta.add(fruit4);
        System.out.println("lista frutta originale: " + listaFrutta);

        listaFrutta.add(fruit5);
        listaFrutta.addFirst(fruit6);
        listaFrutta.addLast(fruit7);
        System.out.println("lista frutta aggiornata: " + listaFrutta);
    }
}
