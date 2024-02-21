public class switch1 {
    public static void main(String args[]) {
        int giorno = 5;

        switch (giorno) {
            case 1:
                System.out.println("lunedì");
                break;
            case 2:
                System.out.println("martedì");
                break;
            case 3:
                System.out.println("mercoledì");
                break;
            case 4:
                System.out.println("giovedì");
                break;
            case 5:
                System.out.println("venerdì");
                break;
            case 6:
                System.out.println("sabato");
                break;
            case 7:
                System.out.println("domenica");
                break;
            default:
                System.out.println("errore: il numero è < 1 || > 7");
                break;
        }

    }

}
