package ocp.java8.advanced_func_interface;

public class Sample2 {

  public static void main(String[] args) {
    // Multiple lambda calls and nested lambdas

    A a = (b) -> {
    };
    a.use(c -> {
    });

  }

  interface A {

    void use(B b);
  }

  interface B {

    void use(C c);
  }

  interface C {

    void use(D d);
  }

  interface D {

  }

}
