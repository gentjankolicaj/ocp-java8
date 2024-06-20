package ocp.java8.nested_classes.anonymous_inner_class;

public class Outer {

  public static void main(String[] args) {

    Outer outer = new Outer();
    outer.info();

  }

  public void info() {
    //Anonymous inner class for local inner classes

    Testable testable = new Testable() {
      public void test() {
        System.out.println("test() method implemented from A.I.C");
      }
    };

    Inner inner = new Inner() {

      public void test() {
        System.out.println("test() method implemented using A.I.C");
      }

      public void print() {
        System.out.println("print() method implemented using A.I.C");
      }
    };

    InnerStatic innerStatic = new InnerStatic() {

      void info() {
        System.out.println("info method implemented from A.I.C");
      }
    };

    testable.test();

    inner.print();
    inner.test();

    innerStatic.info();


  }

  private interface Testable {

    void test();

  }

  static abstract class InnerStatic {

    abstract void info();
  }

  private abstract class Inner implements Testable {

    public abstract void print();
  }

}
