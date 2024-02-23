public class array1 {

    public static void main(String[] args) {
        int sum = 1;
        for (int i = 1; i <= 10; i++) {
            int[] box = { i };
            sum = box[i] + sum;

            System.out.println(box);
        }

    }

}
