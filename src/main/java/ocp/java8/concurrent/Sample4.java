package ocp.java8.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class Sample4 {

  public static Integer performCount(int value) {
    return 1;
  }

  public static void print(Future<?> future) {
    try {
      System.out.println(future.get());
    } catch (Exception e) {

    }
  }

  public static void main(String[] args) {
    ExecutorService service = Executors.newSingleThreadExecutor();
    final List<Future<?>> results = new ArrayList<>();
    IntStream.range(0, 10)
        .forEach(i -> results.add(service.submit(() -> performCount(i))));

    results.stream().forEach(f -> print(f));

    service.shutdown();

  }

}
