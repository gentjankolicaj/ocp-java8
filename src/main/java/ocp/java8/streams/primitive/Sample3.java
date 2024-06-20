package ocp.java8.streams.primitive;

import java.util.stream.DoubleStream;

public class Sample3 {

  public static void main(String[] args) {

    DoubleStream ds = DoubleStream.of(1.2, 2.4);
    Long result = ds.peek(System.out::print).filter(x -> x > 2).count();
    System.out.println();
    System.out.println(result);


  }

}
