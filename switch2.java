public class switch2 {
    public static void main(String args[]) {
        char carattere = '+';

        switch (carattere) {
            case '+':
                System.out.println("somma");
                break;
            case '-':
                System.out.println("sottrazione");
                break;
            case '*':
                System.out.println("moltiplicazione");
                break;
            case '/':
                System.out.println("divisione");
                break;
            default:
                System.out.println("carattere non identificato");
                break;
        }
    }
}
