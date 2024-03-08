import com.sun.source.util.SourcePositions;

import java.util.Arrays;
import java.util.Locale;

public class Metodi1 {
    public static void main(String[] args) {
        String testo1 = "oh bella ciao, bella ciao, bella ciao, ciao, ciao";
        System.out.println(testo1);


        // per stampare tutto in maiuscolo
        System.out.println("Maiuscole: " + testo1.toUpperCase());
        //per stampare tutto in minuscolo
        System.out.println("minuscole: " + testo1.toLowerCase());

        //numero di parole
        String[] array = testo1.split(" ");
        System.out.println("numero di parole: " + array.length);
        //numero di lettere
        System.out.println("numero di lettere: " + testo1.length());

        //parole separate da virgole
        String[] array1 = testo1.split(" ");
        System.out.println("parole separate da virgole:" + Arrays.toString(array1));

        //per trasformare il testo in un array e prendere solo quella in posizione 1
        String testo2 = "GIORNO: lunedì";
        String[] array2 = testo2.split(":");
        System.out.println("giorno: " + array2[1]);

        //per stampare solo il giorno (invede di .equals si può utilizzare == , quindi sarà (giorno == "lunedì") )
        String giorno = array2[1].trim();
        if (giorno.equals("lunedì")) {
            System.out.println("oggi è lunedì" );
        }

        //per rimpiazzare un volore
        String testo3 = "eren, naruto, goku".replace("goku", "akira");
        System.out.println(testo3);

        //per concatenare più stringhe separate
        StringBuilder testo4 = new StringBuilder("1,");
        testo4.append("2");
        System.out.println(testo4);

        //le concatenazioni
        String testo5 = "1, ";
        testo5 = testo5.concat("2, ").concat("3");
        System.out.println(testo5);

    }
}
