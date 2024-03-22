package Esercizio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Student student1 = new Student("Mario", 22);
        Student student2 = new Student("Luigi", 20);
        Student student3 = new Student("Toad", 19);
        Student student4 = new Student("Bowser", 25);
        Student student5 = new Student("Principessa Peach", 23);
        Student student6 = new Student("Wario", 26);


        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        System.out.println("lista originale: " + studentList);


        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        System.out.println("lista aggiornata: " + studentList);
    }
}
