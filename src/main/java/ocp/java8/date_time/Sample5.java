package ocp.java8.date_time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;


public class Sample5 {

  public static void main(String[] args) {

    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();
    LocalDateTime dateTime = LocalDateTime.now();
    ZoneId zone = ZoneId.systemDefault();

    ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zone);
    long epochSeconds = 0;

    Instant inst1 = zonedDateTime.toInstant();
    Instant inst2 = Instant.now();
    Instant inst3 = Instant.ofEpochSecond(
        1); //Counting starts from 1970/1/1 just like in unix systems

    System.out.println(inst1);
    System.out.println(inst2);
    System.out.println(inst3);


  }

}
