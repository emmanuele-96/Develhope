import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> numeri = new HashSet<>();

        numeri.add(1);
        numeri.add(2);
        numeri.add(3);

        System.out.println(numeri);

        for(int i = 0; i <= 3; i++) {
            if (numeri.contains(i)) {
            numeri.remove(i);
            System.out.println("i numeri rimossi sono: " + i);
            }
        }
        System.out.println(numeri);
    }
}