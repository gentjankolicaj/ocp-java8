package ocp.java8.collection.map;

import java.util.function.BiFunction;

public class Sample3 {

  static final BiFunction<Integer, Integer, Integer> var = (a, b) -> a + b;


  public static void main(String[] args) {
    BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> {
      int c = a + b;
      return c;
    };


  }

}
