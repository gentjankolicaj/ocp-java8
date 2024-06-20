package ocp.java8.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Sample1 {


  public static void main(String[] args) {

    Map<Integer, String> map = new HashMap<>();
    map.put(1, "One");
    map.put(2, "Two");
    map.put(3, "Threee");

    Set<Integer> keys = map.keySet();
    Iterator<Integer> keyIterator = keys.iterator();
    while (keyIterator.hasNext()) {
      System.out.println(keyIterator.next());
    }

  }

}
