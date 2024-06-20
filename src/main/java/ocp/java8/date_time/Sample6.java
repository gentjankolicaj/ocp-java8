package ocp.java8.date_time;

import java.util.Properties;

public class Sample6 {

  public static void main(String[] args) {
    Properties props = null;

    // compile error props.get("user","default");

    props.getProperty("password", "defaultPassword");

    props.keySet().stream().map(x -> props.get(x)).forEach(System.out::println);


  }

}
