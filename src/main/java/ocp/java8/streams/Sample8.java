package ocp.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample8 {

  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(1, 2, 3, 3, 44, 34);

    list.stream().filter(x -> x > 0).map(x -> "" + x).collect(Collectors.toList())
        .forEach(System.out::println);

    //collect is intermediate operation
    //if collect were to be terminal operation we would have a compile error.

    //Also we can't call intermediate or terminal operations on a stream after terminal operation is called before
    //else we have compile error

  }

}
