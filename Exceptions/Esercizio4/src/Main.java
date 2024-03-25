public class Main {
    public static void main(String[] args) {
       int[] numeri = {10,20,30};
       divisiZero(numeri);
    }
    public static void divisiZero(int[] numeri) {

        try {
                int risultato = numeri[5] / 2;
                System.out.println("il risultato è: " + risultato);


        } catch (ArithmeticException e) {
            System.out.println("errore: " + e);

        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("indice non presente: " + e);
        }
    }
}
