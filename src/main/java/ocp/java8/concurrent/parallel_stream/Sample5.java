package ocp.java8.concurrent.parallel_stream;

import java.util.Arrays;

public class Sample5 {

  public static void main(String[] args) {

    Integer i1 = Arrays.asList(1, 2, 3, 4, 5, 6).stream().findAny().get();

    synchronized (i1) {
      Integer i2 = Arrays.asList(6, 7, 8, 9, 10).parallelStream()
          .sorted()
          .findAny()
          .get();
      System.out.println(i1 + " " + i2);

    }


  }

}
