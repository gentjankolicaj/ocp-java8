package ocp.java8.concurrent.parallel_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Sample2 {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < 1000; i++) {
      list.add(i);
    }

    Stream<Integer> stream = list.stream();

    Stream<Integer> parallelStream = stream.parallel();
    parallelStream.forEach(e -> System.out.print(e + " "));
  }

}
