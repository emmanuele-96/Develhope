import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime giorno = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String formatoFull = giorno.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("data formato FULL: " + formatoFull);

        String formatoMedium = giorno.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("data formato MEDIUM: " + formatoMedium);

        String formatoShort = giorno.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("data formato SHORT: " + formatoShort);



    }
}