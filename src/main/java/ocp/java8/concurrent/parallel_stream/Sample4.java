package ocp.java8.concurrent.parallel_stream;

import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;


public class Sample4 {

  public static void main(String[] args) {

    AtomicLong value = new AtomicLong(0);
    final long[] array = {0};

    IntStream.iterate(1, i -> 1)
        .limit(100)
        .parallel()
        .forEach(i -> value.incrementAndGet());

    IntStream.iterate(1, i -> 1)
        .limit(100)
        .parallel()
        .forEach(i -> ++array[0]);

    System.out.println(value + " " + array[0]);


  }

}
