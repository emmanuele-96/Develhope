public class Main {
    public static void main(String[] args) {
        char carattere = 'A';
        contrallaNumero(carattere);
    }
    public static void contrallaNumero(char carattere) {
        if (Character.isDigit(carattere)) {
            System.out.println("il paramentro è il numero " + carattere);
        } else {
            throw new ArithmeticException("il carattere non è un numero " + carattere);
        }
    }
}

    /*public static void main(String[] args) {
        Character carattere = null;
        contrallaNumero(carattere);
    }
    public static void contrallaNumero(Character carattere) {
        if (Character.isDigit(carattere)) {
            System.out.println("il paramentro è il numero " + carattere);
        } else if (carattere == null) {
            throw new RuntimeException("errore null");
        }
        else {
            throw new ArithmeticException("il carattere non è un numero " + carattere);
        }
    }
}*/