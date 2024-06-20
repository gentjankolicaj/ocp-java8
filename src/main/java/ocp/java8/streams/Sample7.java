package ocp.java8.streams;

import java.util.function.BiFunction;

public class Sample7 {

  public static void main(String[] args) {

    //BiFunction<T,U,R>
    // BiFunction<Integer,Integer> bf=(a,b)->a; compile error
    BiFunction<Integer, Integer, Integer> bf = (a, b) -> a;


  }

}
