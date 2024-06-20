package ocp.java8.random_samples;

import java.util.HashMap;
import java.util.Map;

public class Sample10 {

  public static void main(String[] args) {
    Map m = new HashMap();
    m.put(23, "456");
    m.put("789", "def");
    System.out.println(m.containsKey("123"));

  }

}
