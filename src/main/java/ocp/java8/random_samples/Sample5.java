package ocp.java8.random_samples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sample5 {

  public static void main(String[] args) {
    Set<Number> numbers = new HashSet<>();
    numbers.add(Integer.valueOf(10));
    numbers.add(75);
    numbers.add(10);
    numbers.add(null);
    numbers.add(75);
    numbers.add(24L);
    numbers.add(12.0f);
    numbers.add(232.23);
    Iterator iter = numbers.iterator();
    while (iter.hasNext()) {
      System.out.print(iter.next());
    }

    System.out.println();
    TreeSet<String> string = new TreeSet<String>();
    string.add("one");
    string.add("One");
    string.add("ONE");
    System.out.println(string.ceiling("On"));


  }

}
