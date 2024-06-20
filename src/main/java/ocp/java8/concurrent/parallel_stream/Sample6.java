package ocp.java8.concurrent.parallel_stream;

import java.util.Arrays;

public class Sample6 {

  public static void main(String[] args) {
    System.out.println(Arrays.asList("Duck", "chicken", "flaming", "pelican")
        .parallelStream()
        .parallel()
        .reduce(0,
            (c1, c2) -> 1 + c2.length(),
            (s1, s2) -> s1 + s2));


  }

}
