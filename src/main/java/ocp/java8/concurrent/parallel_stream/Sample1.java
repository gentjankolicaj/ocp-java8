package ocp.java8.concurrent.parallel_stream;

import java.util.ArrayList;
import java.util.List;

public class Sample1 {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < 1000; i++) {
      list.add(i);
    }

    list.parallelStream().forEach((Integer a) -> System.out.print(a + " "));


  }

}
