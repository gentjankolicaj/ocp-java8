package ocp.java8.random_samples;

class A {

  A() {
    print();
  }

  void print() {
    System.out.print("A");
  }
}

class B extends A {

  private final int i = 4;

  B() {
  }

  void print() {
    System.out.print(i);
  }
}

public class Sample1 {

  public static void main(String[] args) {

    A a = new B(); // it prints 0 because of virtual method invocation
    a.print(); // it prints 4 because of virtual method invocation
  }
}
