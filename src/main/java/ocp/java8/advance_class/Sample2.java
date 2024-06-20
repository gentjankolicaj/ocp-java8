package ocp.java8.advance_class;

public class Sample2 {

  public static void main(String[] args) {

    String s1 = "Canada";

    String s2 = s1;

    if (s1 == s2) {
      System.out.println("Same objects on string pool");
    }

    if (s1.equals(s2)) {
      System.out.println("Same string objects with equals() method.");
    }

  }

}
