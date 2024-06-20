package ocp.java8.try_catch;

public class Sample2 {

  public static void main(String[] args) {

    try {
      System.out.println("Hello world");
      throw new RuntimeException("Try block");
    } catch (RuntimeException e) {
      System.out.println("Hi from catch block");
      throw new RuntimeException("Catch block");

    } finally {
      // throw new Exception("From finally block");
      // causes compile error because checked exceptions have to be handled(try-catch) or declare (throws)
      throw new RuntimeException("From finally block");
    }
  }
}
