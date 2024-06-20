package ocp.java8.collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sample1 {

  public static void main(String[] args) {

    Set<Integer> set = new HashSet<>();

    for (int i = 0; i < 10; i++) {
      set.add(i);
    }
    System.out.println(set);
    System.out.println();

    Set<Double> set2 = new TreeSet<>();
    for (double d = 0.0; d < 55.5; d = d + 5.5) {
      set2.add(d);
    }

    System.out.println(set2);

  }

}
