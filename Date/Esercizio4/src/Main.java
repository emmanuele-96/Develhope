import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime giorno = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String giornoItaliano = giorno.format(DateTimeFormatter.ofPattern("dd, MMMM, yyyy", Locale.ITALY));

        OffsetDateTime aggiungiAnno = giorno.plusYears(1);
        System.out.println("aggiunto un anno: " + aggiungiAnno);

        OffsetDateTime sottrattoMese = giorno.minusMonths(1);
        System.out.println("sottratto un mese: " + sottrattoMese);

        OffsetDateTime aggiungiGiorno = giorno.plusDays(7);
        System.out.println("aggiunti giorni: " + aggiungiGiorno);

        System.out.println();
    }
}