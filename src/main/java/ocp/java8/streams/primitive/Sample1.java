package ocp.java8.streams.primitive;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;


public class Sample1 {

  public static void main(String[] args) {

    Stream<Integer> s = Stream.of(1);

    //primitive streams
    IntStream is = s.mapToInt(x -> x);
    LongStream ls = s.mapToLong(x -> x);
    DoubleStream ds = s.mapToDouble(x -> x);

    //Getting stream from primitive stream,we use method mapToObj
    Stream<Integer> s2 = is.mapToObj(x -> x);

    s2.forEach(System.out::print);

    //Compile errors cause by wrong method call
    // Stream<Integer> s2=is.mapToInt(x->x);
    // Stream<Integer> s2=is.mapToLong(x->x);
    // Stream<Integer> s2=is.mapToDouble(x->x);

  }

}
