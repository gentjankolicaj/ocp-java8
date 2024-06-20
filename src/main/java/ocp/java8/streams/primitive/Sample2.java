package ocp.java8.streams.primitive;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Sample2 {

  public static void main(String[] args) {

    Stream<String> s = Stream.empty();
    Stream<String> s2 = Stream.empty();

    Map<Boolean, List<String>> m1 = s.collect(Collectors.partitioningBy(b -> b.startsWith("c")));
    Map<Boolean, List<String>> m2 = s2.collect(Collectors.partitioningBy(b -> b.startsWith("c")));

    //Note
    //partitioningBy(Predicate<? super T> predicate)
    // this methods gets as parameter a predicate

    System.out.println(m1 + " " + m2);

  }

}
