package ocp.java8.concurrent.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.DoubleStream;

public class Sample6 {

  public static void main(String[] args) {

    ExecutorService service = Executors.newFixedThreadPool(10);

    DoubleStream.of(3.124567, 2.18287)
        .forEach(d -> service.submit(
            () -> System.out.println(10 * d)));

    service.execute(() -> System.out.println("Printed"));

  }

}
