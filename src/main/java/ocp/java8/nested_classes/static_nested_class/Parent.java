package ocp.java8.nested_classes.static_nested_class;

public class Parent {

  public static void main(String[] args) {
    Child1 c1 = new Child1();
    Child2 c2 = new Child2();
    Child3 c3 = new Child3();
    Child4 c4 = new Child4();
  }

  public static class Child1 {

    public static String name = "Child1";

    static {
      System.out.print("Hello from ");
      print();
    }

    public static void print() {
      System.out.print(name);
    }

  }

  protected static class Child2 {

    protected static String name = "Child2";

    static {
      System.out.println();
      System.out.print("Hello from ");
      print();
    }

    protected static void print() {
      System.out.print(name);
    }
  }

  static class Child3 {

    static String name = "Child3";

    static {
      System.out.println();
      System.out.print("Hello from ");
      print();
    }

    static void print() {
      System.out.print(name);
    }

  }

  private static class Child4 {

    private static final String name = "Child4";

    static {
      System.out.println();
      System.out.print("Hello from ");
      print();
    }

    private static void print() {
      System.out.print(name);
    }
  }

}
