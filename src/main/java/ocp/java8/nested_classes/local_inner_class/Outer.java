package ocp.java8.nested_classes.local_inner_class;

public class Outer {

  public static void main(String[] args) {

    Outer outer = new Outer();
    outer.print();

  }

  public void print() {
    final int value = 0;
    int x = 1;
    int y = 2;

    class LocalInnerClass {

      void print() {
        System.out.println(value);

        System.out.println(
            x); // x is a normal local variable,but since x isn't reasgned a new value during
        // scope is considered "efectively final"
        // if x is reasigned a value during scope then we would have a compile error at
        // ->System.out.println(x);
        System.out.println(y);

      }
    }

    LocalInnerClass lic = new LocalInnerClass();
    lic.print();

  }


}
