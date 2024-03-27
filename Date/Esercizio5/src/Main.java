import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime giorno1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime giorno2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        boolean gg1 = giorno1.isBefore(giorno2);
        System.out.println("giorno1 è precedente a giorno2? " + gg1);

        boolean gg2 = giorno2.isAfter(giorno1);
        System.out.println("giorno2 è antecedente giorno1? " + gg2);

        boolean gUgualeG = giorno1.isEqual(giorno2);
        System.out.println("i giorni hanno la stessa data? " + gUgualeG);

    }
}