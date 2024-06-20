package ocp.java8.random_samples;

public class Sample12 {

  public static void main(String[] args) {

    Sample12 child = new Child();
    print("Test");

  }

  public static void print(String str) {
    System.out.println("Hello from parent :" + str);
  }
}

class Child extends Sample12 {

  public static void print(String str) {
    System.out.println("Hello from child :" + str);
  }
}
