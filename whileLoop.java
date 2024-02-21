public class whileLoop {
    public static void main(String[] args) {
        int number = 0;
        int tot = 0;

        while (number <= 5) {

            System.out.println(number);
            number++;
            tot = tot + number;
        }
        System.out.println(tot);

    }
}
