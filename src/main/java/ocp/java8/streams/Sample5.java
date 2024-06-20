package ocp.java8.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample5 {

  public static void main(String[] args) {

    System.out.println(
        Stream.iterate(1, x -> ++x).limit(5).map(x -> "" + x).collect(Collectors.joining()));

  }

}
