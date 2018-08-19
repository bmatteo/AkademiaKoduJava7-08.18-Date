import java.time.*;

public class Main {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        ZonedDateTime zonedDateTime1 = ZonedDateTime.ofInstant(zonedDateTime.toInstant(), ZoneId.of("UTC"));
        System.out.println(zonedDateTime1);
    }
}
