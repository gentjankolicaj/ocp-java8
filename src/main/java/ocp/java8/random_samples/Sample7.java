package ocp.java8.random_samples;

import java.io.FileNotFoundException;

public class Sample7 {

  public static <U extends Exception> void print(U u) {
    System.out.println(u.getMessage());
  }

  public static void main(String[] args) {

    Sample7.print(new Exception("Exception"));
    Sample7.print(new FileNotFoundException("Exception"));

    // Sample7.<Throwable>print(new Exception("Exception"));
    //CE Because from generic declaration on method,parent classes are restricted

    Sample7.print(new NullPointerException("Exception"));

    //Sample7.print(new Throwable());
    //CE Because from generic declaration on method,parent classes are restricted

  }

}
