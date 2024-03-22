package Esercizio2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Francesco", 20);
        Student student2 = new Student("Mirco", 23);
        Student student3 = new Student("Paolo", 24);
        Student student4 = new Student("Giorgio", 21);
        Student student5 = new Student("Giuseppe", 36);
        Student student6 = new Student("Anna", 27);
        Student student7 = new Student("Maria", 23);
        Student student8 = new Student("Francesca", 28);
        Student student9 = new Student("Alberta", 21);
        Student student10 = new Student("Giorgia", 21);
        Student student11= new Student("Alessia", 28);
        Student student12 = new Student("Pia", 25);

        List<Student> listaStudenti = new ArrayList<>();
        listaStudenti.add(student1);
        listaStudenti.add(student2);
        listaStudenti.add(student3);
        listaStudenti.add(student4);
        listaStudenti.add(student5);
        listaStudenti.add(student6);
        listaStudenti.add(student7);
        listaStudenti.add(student8);
        listaStudenti.add(student9);
        listaStudenti.add(student10);
        listaStudenti.add(student11);
        listaStudenti.add(student12);

        System.out.println("lista degli studenti: " + listaStudenti);

        listaStudenti.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println("lista degli studenti ordinata per nome: " + listaStudenti);

    }
}
