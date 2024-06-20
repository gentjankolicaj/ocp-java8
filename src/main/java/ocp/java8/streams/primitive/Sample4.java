package ocp.java8.streams.primitive;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sample4 {

  public static void main(String[] args) {
    List<Integer> list = IntStream.range(1, 6).mapToObj(x -> x).collect(Collectors.toList());

    list.forEach(System.out::print);

  }

}
