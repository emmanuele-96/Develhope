import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    /*public static void main(String[] args) {
    HashSet<String> insieme1 = riempHash();
    System.out.println("Valori: " + riempHash());
}
    public static  HashSet<String> riempHash() {
        HashSet<String> insieme1 = new HashSet<>();
        insieme1.add("1");
        insieme1.add("2");
        insieme1.add("3");
        return  insieme1;
    }

}*/


//Scrivere una funzione che restituisca un hashset riempito
//Leggere l'hashSet e stampre grandezza ed elementi

  public static void main(String[] args) {
        Set<String> insieme1 = riempiHashSet();
         System.out.println("l'HashSet riempito è: " + insieme1.size());

        System.out.println("gli elementi sono: ");
         for (String elementi : insieme1) {
             System.out.println(elementi);
        }
    }

     public static HashSet<String> riempiHashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("1");
         hashSet.add("2");
        hashSet.add("3");

        return (HashSet<String>) hashSet;
     }
     }