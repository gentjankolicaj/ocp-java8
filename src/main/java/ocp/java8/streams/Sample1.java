package ocp.java8.streams;

import java.util.stream.Stream;

public class Sample1 {

  public static void main(String[] args) {

    Stream<String> stream = Stream.iterate("", s -> s + "1");
    stream = stream.limit(2).map(x -> x + "2");
    System.out.println(stream);

  }

}
