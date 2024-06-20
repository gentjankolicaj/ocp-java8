package ocp.java8.try_catch;

public class Sample1 {

  public static void main(String[] args) {

    try {
      System.out.println("Hello world");
      throw new RuntimeException("Try block");
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    } finally {
      // throw new Exception("From finally block");
      // causes compile error becasue checked exeptions have to be handeled(try-catch)
      // or declare (throws)
      throw new RuntimeException("From finally block");
    }
  }

}
