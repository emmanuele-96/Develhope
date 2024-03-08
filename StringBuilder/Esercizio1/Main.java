package Esercizio1;

public class Main {
    public static void main(String[] args) {
        String testo1 = "salutami";
        String testo2 = "assocrate";
        String risutatoComparazione = ComparazioneTraStringhe(testo1, testo2);

        System.out.println(risutatoComparazione);
    }
    public static String ComparazioneTraStringhe(String testo1, String testo2) {
        StringBuilder risultato = new StringBuilder("Le due stringhe sono ");
        if (testo1.equals(testo2)) {
            risultato.append("uguali");
        } else {
            risultato.append("differenti");
        }
        return risultato.toString();
    }

    }

