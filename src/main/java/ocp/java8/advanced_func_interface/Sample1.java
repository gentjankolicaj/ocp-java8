package ocp.java8.advanced_func_interface;

interface A<T> {

}

interface B<T> extends A<T> {

}

interface C<T, V> extends B<T> {

}

public class Sample1 {

  public static void main(String[] args) {

    // Note inheriting interface must declare same amount of generics or more
    // If inheriting interface declares less generic than parent interface then we
    // have compile error
    // If inheriting interface declare a different generic than parent interface
    // then we have compile error;

    A<Integer> a = new A<Integer>() {

    };

    B<Double> b = new B<Double>() {

    };

    C<Byte, Short> c = new C<Byte, Short>() {

    };

  }

}
