package ocp.java8.try_catch;

public class TryCatchTest {

  public static void main(String[] args) {

    TryCatchTest.test1();

  }

  public static void test1() {
    String value = "";
    try {
      try {
        value += "a";
        throw new RuntimeException("From inside try{}");
      } catch (RuntimeException e) {
        e.printStackTrace();
        value += "b";
      } finally {
        value += "c";
        throw new Exception("From inside finally {} block");
      }
    } catch (Exception e) {
      e.printStackTrace();
      value += "d";
      throw new RuntimeException(
          "Error thrown  to close JVM from outer catch block"); //causes some anomaly because sometimes jvm is shutdown
    } finally {
      value += "e";
      System.out.println("->" + value);
    }
  }

}
