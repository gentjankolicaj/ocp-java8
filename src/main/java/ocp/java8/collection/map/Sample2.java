package ocp.java8.collection.map;

import java.util.HashMap;
import java.util.Map;

public class Sample2 {

  public static void main(String[] args) {

    Map<Integer, Integer> map = new HashMap<>();
    map.put(1, 10);
    map.put(2, 20);
    map.put(3, null);

    map.merge(1, 3, (a, b) -> a + b);
    map.merge(3, 3, (a, b) -> a + b);

    System.out.println(map);

  }

}
