import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime giorno = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String anno = giorno.format(DateTimeFormatter.ofPattern("yyyy"));
        System.out.println("Anno: " + anno);

        String mese = giorno.format(DateTimeFormatter.ofPattern("MMMM"));
        System.out.println("Mese: " + mese);

        String giornoDelAnno = giorno.format(DateTimeFormatter.ofPattern("DD"));
        System.out.println("giorno dell'anno: " + giornoDelAnno);

        String giornoDellaSettimana = String.valueOf(giorno.getDayOfWeek());
        System.out.println("giorno della settimana: " + giornoDellaSettimana);
    }
}