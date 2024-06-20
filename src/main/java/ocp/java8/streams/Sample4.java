package ocp.java8.streams;

import java.util.stream.Stream;

public class Sample4 {

  public static void main(String[] args) {

    Stream<String> stream = Stream.generate(() -> "meow");
    boolean match = stream.allMatch(String::isEmpty);
    System.out.println(match);

  }

}
