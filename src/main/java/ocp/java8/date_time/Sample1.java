package ocp.java8.date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Sample1 {

  public static void main(String[] args) {
    ZoneId zoneId = ZoneId.of("PARIS/FRANCE");

    LocalDate ld = LocalDate.now();
    LocalDate ld2 = LocalDate.of(2000, Month.APRIL, 1);

    LocalTime lt = LocalTime.now();
    LocalTime lt2 = LocalTime.of(21, 23, 23);

    LocalDateTime ldt = LocalDateTime.now();
    LocalDateTime ldt2 = LocalDateTime.of(1, 2, 2, 2, 2, 2);
    LocalDateTime ldt3 = LocalDateTime.of(ld, lt);

    ZonedDateTime zdt = ZonedDateTime.now();
    ZonedDateTime zdt2 = ZonedDateTime.of(ld, lt, zoneId);
    ZonedDateTime zdt3 = ZonedDateTime.of(ldt, zoneId);


  }

}
