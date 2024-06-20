package ocp.java8.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Sample1 {

  {
    List<String> list = new ArrayList<>();
    list.add("User");
    list.add("Tester");
    list.add("Admin");

    Consumer<String> consumer = (p) -> System.out.println(p);

    list.forEach(consumer);

    System.out.println();
    System.out.println();

    list.forEach(p -> {
      System.out.println("-- " + p);
      System.out.println();
    });

  }

  public static void main(String[] args) {
    new Sample1();

  }
}
