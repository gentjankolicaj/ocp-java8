package ocp.java8.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sample6 {

  public static void main(String[] args) {
    List<Integer> l1 = Arrays.asList(1, 2, 3);
    List<Integer> l2 = Arrays.asList(4, 5, 6);
    List<Integer> l3 = Collections.emptyList();

    //	Stream.of(l1,l2,l3).map(x->x+1).flatMap(x->x.stream()).forEach(System.out::print);
    //Operator + is undefined for List<Integer>

  }

}
