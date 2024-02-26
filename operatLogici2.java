public class operatLogici2 {
    /*
     * public static void main(String[] args) {
     * int a = 52;
     * 
     * boolean rappBoolean = (a % 2 == 0) && (rappBoolean = true);
     * System.out.println(rappBoolean);
     * }
     * }
     */

    public static void main(String[] args) {
        int a = 52;

        System.out.println("il valore a è pari? " + pariODispari(a));

    }

    public static boolean pariODispari(int a) {
        return (int) a % 2 == 0;
    }
}