package ocp.java8.date_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Sample2 {

  public static void main(String[] args) {

    LocalDate date = LocalDate.of(2016, 3, 13);
    LocalTime time = LocalTime.of(1, 30, 30);
    ZoneId zone = ZoneId.of("US/Eastern");

    ZonedDateTime zdt1 = ZonedDateTime.of(date, time, zone);
    ZonedDateTime zdt2 = zdt1.plusHours(1);

    long hours = ChronoUnit.HOURS.between(zdt1, zdt2);
    int clock = zdt1.getHour();
    int clock2 = zdt2.getHour();

    System.out.println(hours + " " + clock + " " + clock2);

  }

}
