package ocp.java8.nested_classes.static_nested_class;

public class Outer {

  private String outerClassName;

  public static void main(String[] args) {
    Inner inner = new Inner("Inner.class", 01);
    String str = inner.toString();
    System.out.println(str);

  }

  static class Inner {

    private String name;
    private int code;

    public Inner() {
    }

    public Inner(String name, int code) {
      this.name = name;
      this.code = code;
    }

    @Override
    public String toString() {
      return "Inner [name=" + name + ", code=" + code + "]";
    }

  }

}
