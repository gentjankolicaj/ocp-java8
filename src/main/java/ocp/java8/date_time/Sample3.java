package ocp.java8.date_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Sample3 {

  public static void main(String[] args) {

    LocalDate date = LocalDate.of(2016, 3, 13);
    LocalTime time = LocalTime.of(2, 15);
    ZoneId zone = ZoneId.of("US/Eastern");

    ZonedDateTime zdt = ZonedDateTime.of(date, time, zone);

    System.out.println(zdt);


  }

}
